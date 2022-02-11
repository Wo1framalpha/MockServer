package com.example.mockserver.service;

import com.example.mockserver.entity.DataEntity;
import com.example.mockserver.repository.DataRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.apache.bcel.classfile.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

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

    public String getResponse(String code) {
        List<DataEntity> ret = repository.findByCode(code);
        if (ret.size() == 0) {
            return "";
        }else if (ret.size() == 1) {
            return ret.get(0).getData();
        }else {
            Random r = new Random();
            return ret.get(r.nextInt(ret.size()-1)).getData();
        }
    }

    public void addData(DataEntity data) {
        repository.save(data);
    }
}
