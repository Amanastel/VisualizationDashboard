package com.blackcoffer.Service;


import com.blackcoffer.model.DataEntity;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DataService {
	public DataEntity persistData(DataEntity dataEntity);
	public List<DataEntity> searchInvestigations(DataEntity filter);
    public List<DataEntity> getAllData(Integer pageNumber, Integer numberOfRecord);
}

