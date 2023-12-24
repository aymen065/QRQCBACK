package com.misfat.qrqc.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import com.misfat.qrqc.dto.EnregistrementDTO;
import com.misfat.qrqc.model.Enregistrement;
import com.misfat.qrqc.model.Enregistrement_Processus;
import com.misfat.qrqc.model.Processus;
import com.misfat.qrqc.model.Ligne;

import javax.persistence.criteria.CriteriaBuilder.In;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;

@Component
public class EnregSpecification {
//, ProcessusDTO proc,LigneDTO ligne
	public Specification<EnregistrementDTO> getEnregistrements(EnregistrementDTO eng) {
		return (root, query, criteriaBuilder) -> {
			List<Predicate> predicates = new ArrayList<>();

			Join<Enregistrement, Enregistrement_Processus> ep = root.join("processus");
			Join<Enregistrement_Processus, Processus> p = ep.join("processus", JoinType.INNER);
			Join<Processus, Ligne> l = p.join("ligne", JoinType.INNER);

			if (eng != null && eng.getDateEnregInf() != null && eng.getDateEnregSup() != null) {
				predicates.add(
						criteriaBuilder.between(root.get("dateEnreg"), eng.getDateEnregInf(), eng.getDateEnregSup()));
			}

			if (eng != null && eng.getProcessus_id() != null && !eng.getProcessus_id().isEmpty()) {

				In<Integer> inClause = criteriaBuilder.in(p.get("id"));
				for (Integer id : eng.getProcessus_id()) {
					inClause.value(id);
				}
				predicates.add(inClause);
			}
			if (eng != null && eng.getLigne_id() != 0) {
				predicates.add(criteriaBuilder.equal(l.get("id"), eng.getLigne_id()));
			}

			query.distinct(true).orderBy(criteriaBuilder.desc(root.get("heure")));

			return criteriaBuilder.and(predicates.toArray(new Predicate[0]));

		};

	}

}
