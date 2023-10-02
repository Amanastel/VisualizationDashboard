package com.blackcoffer.Service;

import com.blackcoffer.Exception.DataEntityException;
import com.blackcoffer.model.DataEntity;
import com.blackcoffer.repository.DataRepository;
import jakarta.persistence.criteria.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataServiceImple implements DataService {

    @Autowired
    private DataRepository DataRepository;

    @Override
    public DataEntity persistData(DataEntity investigation) {
        return DataRepository.save(investigation);
    }

    public List<DataEntity> searchInvestigations(DataEntity filter) {
        Specification<DataEntity> specification = (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            // Filtering by end_year
            if (!StringUtils.isEmpty(filter.getEnd_year())) {
                predicates.add(criteriaBuilder.like(root.get("end_year"), "%"+ filter.getEnd_year() + "%"   ));
            }

            // Filtering by citylng
            if (!StringUtils.isEmpty(filter.getCitylng())) {
                predicates.add(criteriaBuilder.like(root.get("citylng"), "%"+ filter.getCitylng() + "%"   ));
            }

            // Filtering by citylat
            if (!StringUtils.isEmpty(filter.getCitylat())) {
                predicates.add(criteriaBuilder.like(root.get("citylat"), "%"+filter.getCitylat() + "%"  ));
            }

            // Filtering by intensity
            if (!StringUtils.isEmpty(filter.getIntensity())) {
                predicates.add(criteriaBuilder.like(root.get("intensity"), "%" + filter.getIntensity() + "%"));
            }

            // Filtering by sector
            if (!StringUtils.isEmpty(filter.getSector())) {
                predicates.add(criteriaBuilder.like(root.get("sector"), "%" +  filter.getSector()+ "%"  ));
            }

            // Filtering by topic
            if (!StringUtils.isEmpty(filter.getTopic())) {
                predicates.add(criteriaBuilder.like(root.get("topic"), "%" + filter.getTopic() + "%"));
            }

            // Filtering by insight
            if (!StringUtils.isEmpty(filter.getInsight())) {
                predicates.add(criteriaBuilder.like(root.get("insight"), "%"+ filter.getInsight() + "%"   ));
            }

            // Filtering by swot
            if (!StringUtils.isEmpty(filter.getSwot())) {
                predicates.add(criteriaBuilder.like(root.get("swot"), "%"+ filter.getSwot() + "%"   ));
            }

            // Filtering by url
            if (!StringUtils.isEmpty(filter.getUrl())) {
                predicates.add(criteriaBuilder.like(root.get("url"), "%"+ filter.getUrl() + "%"   ));
            }

            // Filtering by region
            if (!StringUtils.isEmpty(filter.getRegion())) {
                predicates.add(criteriaBuilder.like(root.get("region"), "%"+ filter.getRegion() + "%"   ));
            }

            // Filtering by start_year
            if (!StringUtils.isEmpty(filter.getStart_year())) {
                predicates.add(criteriaBuilder.like(root.get("start_year"), "%"+ filter.getStart_year() + "%"));
            }

            // Filtering by impact
            if (!StringUtils.isEmpty(filter.getImpact())) {
                predicates.add(criteriaBuilder.like(root.get("impact"), "%" +filter.getImpact() + "%"  ));
            }

            // Filtering by added
            if (!StringUtils.isEmpty(filter.getAdded())) {
                predicates.add(criteriaBuilder.like(root.get("added"), "%"+ filter.getAdded() + "%"   ));
            }

            // Filtering by published
            if (!StringUtils.isEmpty(filter.getPublished())) {
                predicates.add(criteriaBuilder.like(root.get("published"), "%"+ filter.getPublished() + "%"  ));
            }

            // Filtering by city
            if (!StringUtils.isEmpty(filter.getCity())) {
                predicates.add(criteriaBuilder.like(root.get("city"), "%"+ filter.getCity() + "%"  ));
            }

            // Filtering by country
            if (!StringUtils.isEmpty(filter.getCountry())) {
                predicates.add(criteriaBuilder.like(root.get("country"), "%"+ filter.getCountry() + "%"  ));
            }

            // Filtering by relevance
            if (!StringUtils.isEmpty(filter.getRelevance())) {
                predicates.add(criteriaBuilder.like(root.get("relevance"), "%"+ filter.getRelevance() + "%"  ));
            }

            // Filtering by pestle
            if (!StringUtils.isEmpty(filter.getPestle())) {
                predicates.add(criteriaBuilder.like(root.get("pestle"), "%"+ filter.getPestle() + "%"  ));
            }

            // Filtering by source
            if (!StringUtils.isEmpty(filter.getSource())) {
                predicates.add(criteriaBuilder.like(root.get("source"), "%"+ filter.getSource() + "%"  ));
            }

            // Filtering by title
            if (!StringUtils.isEmpty(filter.getTitle())) {
                predicates.add(criteriaBuilder.like(root.get("title"), "%"+ filter.getTitle() + "%"  ));
            }

            // Filtering by likelihood
            if (!StringUtils.isEmpty(filter.getLikelihood())) {
                predicates.add(criteriaBuilder.like(root.get("likelihood"), "%"+ filter.getLikelihood() + "%"  ));
            }

            // Combine all predicates with AND
            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };

        try {
            return DataRepository.findAll(specification);
        } catch (Exception e) {
            throw new DataEntityException("Error while searching DataEntities");
        }

    }


    @Override
    public List<DataEntity> getAllData(Integer pageNumber, Integer numberOfRecord) {
        Pageable pageable = PageRequest.of(pageNumber-1, numberOfRecord);

        Page<DataEntity> page = DataRepository.findAll(pageable);
        List<DataEntity> data = page.getContent();
        return data;
    }
}
