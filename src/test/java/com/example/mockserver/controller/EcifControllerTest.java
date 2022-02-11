package com.example.mockserver.controller;

import com.example.mockserver.entity.AcHostDetailQryDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class EcifControllerTest {
    @Autowired
    EcifController controller;

    @Autowired
    ObjectMapper mapper;

    @Test
    void getEcif() throws IOException {
        byte[] ret = controller.getEcif("03020101A0006");
        log.info("ret=" + new String(ret));
        AcHostDetailQryDto dto = mapper.readValue(ret, AcHostDetailQryDto.class);
        log.info("dto=" + dto.toString());

    }
}