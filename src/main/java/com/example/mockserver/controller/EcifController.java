package com.example.mockserver.controller;

import com.example.mockserver.service.JsonQueryService;
import com.example.mockserver.utils.JsonParseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class EcifController {
    @Autowired
    private JsonQueryService queryService;

    @RequestMapping(value = "/ecif", produces = "application/json;charset=UTF-8")
    public String getEcif(@RequestBody String json) {
        Map<String, Object> objectMap = JsonParseUtil.json2Map(json);
        return queryService.getJson((String) objectMap.get("headTrCode"));
    }
}
