package com.blackcoffer.config;

import com.blackcoffer.model.DataEntity;
import org.springframework.batch.item.ItemProcessor;

public class DataItemProcessor implements ItemProcessor<DataEntity, DataEntity> {
    @Override
    public DataEntity process(DataEntity item) throws Exception {


        return item;
    }
}
