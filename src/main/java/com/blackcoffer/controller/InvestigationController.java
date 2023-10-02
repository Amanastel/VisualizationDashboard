package com.blackcoffer.controller;

import com.blackcoffer.Service.DataService;
import com.blackcoffer.model.DataEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/api")
public class InvestigationController {

    @Autowired
    private DataService investigationService;

    private DataService dataService;

    @GetMapping("/search")
    public ResponseEntity<List<?>> searchInvestigations(
            @RequestParam(name = "startYear", required = false) Integer startYear,
            @RequestParam(name = "endYear", required = false) Integer endYear,
            @RequestParam(name = "city", required = false) String city,
            @RequestParam(name = "citylng", required = false) Double citylng,
            @RequestParam(name = "citylat", required = false) Double citylat,
            @RequestParam(name = "intensity", required = false) String intensity,
            @RequestParam(name = "sector", required = false) String sector,
            @RequestParam(name = "topic", required = false) String topic,
            @RequestParam(name = "insight", required = false) String insight,
            @RequestParam(name = "swot", required = false) String swot,
            @RequestParam(name = "url", required = false) String url,
            @RequestParam(name = "region", required = false) String region,
            @RequestParam(name = "impact", required = false) String impact,
            @RequestParam(name = "added", required = false) String added,
            @RequestParam(name = "published", required = false) String published,
            @RequestParam(name = "country", required = false) String country,
            @RequestParam(name = "relevance", required = false) String relevance,
            @RequestParam(name = "pestle", required = false) String pestle,
            @RequestParam(name = "source", required = false) String source,
            @RequestParam(name = "title", required = false) String title,
            @RequestParam(name = "likelihood", required = false) Integer likelihood
    ) {

        DataEntity filter = new DataEntity();
        filter.setStart_year(startYear);
        filter.setEnd_year(endYear);
        filter.setCity(city);
        filter.setCitylng(citylng);
        filter.setCitylat(citylat);
        filter.setIntensity(intensity);
        filter.setSector(sector);
        filter.setTopic(topic);
        filter.setInsight(insight);
        filter.setSwot(swot);
        filter.setUrl(url);
        filter.setRegion(region);
        filter.setImpact(impact);
        filter.setAdded(added);
        filter.setPublished(published);
        filter.setCountry(country);
        filter.setRelevance(relevance);
        filter.setPestle(pestle);
        filter.setSource(source);
        filter.setTitle(title);
        filter.setLikelihood(likelihood);


        List<DataEntity> list = investigationService.searchInvestigations(filter);

        for (DataEntity inve : list) System.out.println(inve);

        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

    @GetMapping("/data/{numberOfRecord}")
    public ResponseEntity<List<?>> getInvestigations(@PathVariable Integer numberOfRecord, @RequestParam Integer page) {
        List<DataEntity> data = dataService.getAllData(page, numberOfRecord);
        return ResponseEntity.status(HttpStatus.OK).body(data);
    }


}
