package com.example.mockserver.service;

import com.example.mockserver.entity.Json;
import com.example.mockserver.repository.JsonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class JsonQueryTest {
    @Autowired
    private JsonRepository repository;

    @Test
    void getJson() {
        Json json = repository.findByHeadTrCode("03020101A0006");
        System.out.println(json.toString());
    }
}