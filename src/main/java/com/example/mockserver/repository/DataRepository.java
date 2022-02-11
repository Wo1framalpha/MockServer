package com.example.mockserver.repository;

import com.example.mockserver.entity.DataEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataRepository extends CrudRepository<DataEntity, Integer> {

    List<DataEntity> findByCode(String code);

    void deleteByCode(String code);
}
