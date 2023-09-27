package com.blackcoffer.repository;

import com.blackcoffer.model.DataEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<DataEntity, Long> {

}
