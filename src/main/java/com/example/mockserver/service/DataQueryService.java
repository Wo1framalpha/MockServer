package com.example.mockserver.service;

import com.example.mockserver.entity.DataEntity;
import com.example.mockserver.repository.DataRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.apache.bcel.classfile.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataQueryService {
    @Autowired
    DataRepository repository;

    public List<DataEntity> getData() {
        return (List<DataEntity>) repository.findAll();
    }


    public List<DataEntity> getData(String code) {

        return repository.findByCode(code);
    }

    public void addData(DataEntity data) {
        repository.save(data);
    }
}
