package com.example.mockserver.controller;

import com.example.mockserver.entity.DataEntity;
import com.example.mockserver.service.DataQueryService;
import com.example.mockserver.utils.JsonParseUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class EcifController {
    @Autowired
    private DataQueryService queryService;

    @Autowired
    private ObjectMapper mapper;

    @RequestMapping(value = "/ecif", produces = "application/json;charset=UTF-8")
    public String getEcif(@RequestBody String json) throws JsonProcessingException {
        Map<String, Object> objectMap = JsonParseUtil.json2Map(json);

        List<DataEntity> jsonObjects = queryService.getData((String) objectMap.get("headTrCode"));

        return mapper.writeValueAsString(jsonObjects);
    }
}
