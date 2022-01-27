package com.example.mockserver.service;

import com.example.mockserver.entity.Json;
import com.example.mockserver.repository.JsonRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class JsonQueryService {

    @Autowired
    private JsonRepository repository;

    public String getJson(String code) {
        ObjectMapper mapper = new ObjectMapper();
        String result = null;
        try {
            result = mapper.writeValueAsString(repository.findByCode(code));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void putJson(String code, String json){
        // repository.save();
    }
}
