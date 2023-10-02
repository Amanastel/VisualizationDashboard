package com.blackcoffer.controller;

import com.blackcoffer.Service.DataService;
import com.blackcoffer.model.DataEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/api")
public class InvestigationController {

	@Autowired
	private DataService investigationService;
	
	
	@GetMapping("/search")
    public ResponseEntity<List<?>>  searchInvestigations(
            @RequestParam(name = "startYear", required = false) Integer startYear,
            @RequestParam(name = "endYear", required = false) Integer endYear,
            @RequestParam(name = "city", required = false) String city,
            @RequestParam(name = "topic", required = false) String topic

    ) {
		System.out.println("working....");
        DataEntity filter = new DataEntity();
        filter.setStart_year(startYear);
        filter.setEnd_year(endYear);
        filter.setCity(city);
        filter.setTopic(topic);
        // Set other filter criteria here

        List<DataEntity> list = investigationService.searchInvestigations(filter);
        
        for(DataEntity inve : list) System.out.println(inve);
        
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }
	
}
