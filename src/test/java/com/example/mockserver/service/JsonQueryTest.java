package com.example.mockserver.service;

import com.example.mockserver.entity.DataEntity;
import com.example.mockserver.repository.DataRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.List;

@Slf4j
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class JsonQueryTest {
    @Autowired
    private DataRepository repository;

    @Test
    void getJson() {
        List<DataEntity> json = repository.findByCode("03020101A0006");
        System.out.println(json.toString());
    }

    @Test
    void save(){
        DataEntity json = new DataEntity();
        json.setCode("03020101A0006");
        json.setData("{\n" +
                "  \"hostCustNo\":" +
                " \"123456789\",\n" +
                "  \"acctNo\": \"123456789\",\n" +
                "  \"currency\": \"CNY\",\n" +
                "  \"acctName\": \"张三\",\n" +
                "  \"openOrgNo\": \"123456789\",\n" +
                "  \"openOrgName\": \"张三\",\n" +
                "  \"openDate\": \"20170301\",\n" +
                "  \"acctType\": \"1\",\n" +
                "  \"acctStat\": \"1\",\n" +
                "  \"acctClass\": \"1\",\n" +
                "  \"cashFlag\": \"1\",\n" +
                "  \"overFlag\": \"1\",\n" +
                "  \"bankNo\": \"123456789\",\n" +
                "  \"bankName\": \"中国银行\"\n" +
                "  \n" +
                "}");
        repository.save(json);
        log.warn(json.toString());
    }
    @Test
    void test() throws JsonProcessingException {
        String json = "{\n" +
                "  \"hostCustNo\":" +
                " \"123456789\",\n" +
                "  \"acctNo\": \"123456789\",\n" +
                "  \"currency\": \"CNY\"}";

        ObjectMapper mapper = new ObjectMapper();
        byte[] bytes = new byte[0];

        bytes = mapper.writeValueAsBytes(json);

        json = mapper.writeValueAsString(bytes);

        log.warn(json);
    }
}