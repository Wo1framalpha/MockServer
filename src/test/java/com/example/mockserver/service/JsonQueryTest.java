package com.example.mockserver.service;

import com.example.mockserver.entity.Json;
import com.example.mockserver.repository.JsonRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class JsonQueryTest {
    @Autowired
    private JsonRepository repository;

    @Test
    void getJson() {
        Json json = repository.findByCode("03020101A0006");
        System.out.println(json.toString());
    }

    @Test
    void save(){
        Json json = new Json();
        json.setCode("03020101A0006");
        json.setJson("{\n" +
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
}