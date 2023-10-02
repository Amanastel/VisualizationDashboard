package com.blackcoffer.Service;


import com.blackcoffer.model.DataEntity;
import com.blackcoffer.repository.DataRepository;
import jakarta.persistence.criteria.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataServiceImple implements DataService {

	@Autowired private DataRepository DataRepository;
	
	
	@Override
	public DataEntity persistData(DataEntity investigation) {
		return DataRepository.save(investigation);
		
	}
	
	
	public List<DataEntity> searchInvestigations(DataEntity filter) {
        Specification<DataEntity> specification = (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            // Filtering by start_year
            if (!StringUtils.isEmpty(filter.getStart_year())) {
                predicates.add(criteriaBuilder.equal(root.get("start_year"), filter.getStart_year()));
            }

            // Filtering by end_year
            if (!StringUtils.isEmpty(filter.getEnd_year())) {
                predicates.add(criteriaBuilder.equal(root.get("end_year"), filter.getEnd_year()));
            }

            // Filtering by city
            if (!StringUtils.isEmpty(filter.getCity())) {
                predicates.add(criteriaBuilder.like(root.get("city"), "%" + filter.getCity() + "%"));
            }

            // Filtering by topic
            if (!StringUtils.isEmpty(filter.getTopic())) {
                predicates.add(criteriaBuilder.like(root.get("topic"), "%" + filter.getTopic() + "%"));
            }

            // Add more similar blocks for other fields

            // Combine all predicates with AND
            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };

        return DataRepository.findAll(specification);
    }
}
