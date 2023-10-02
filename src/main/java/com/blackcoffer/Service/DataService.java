package com.blackcoffer.Service;


import com.blackcoffer.model.DataEntity;

import java.util.List;

public interface DataService {
	public DataEntity persistData(DataEntity dataEntity);
	public List<DataEntity> searchInvestigations(DataEntity filter);
}

