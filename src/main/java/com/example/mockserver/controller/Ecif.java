package com.example.mockserver.controller;

import com.example.mockserver.model.SendAccInfomationQryReq;
import com.example.mockserver.service.JsonQuery;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ecif {
    @Autowired
    private JsonQuery query;

    @RequestMapping(value = "/ecif", produces = "application/json;charset=UTF-8")
    public String getEcif(@RequestBody String json) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            SendAccInfomationQryReq req = objectMapper.readValue(json, SendAccInfomationQryReq.class);
            return query.getJson(req.getHeadTrCode);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "{}";
    }
}
