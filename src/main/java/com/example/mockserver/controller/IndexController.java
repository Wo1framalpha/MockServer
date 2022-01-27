package com.example.mockserver.controller;

import com.example.mockserver.entity.Json;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(Model model) {
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
        model.addAttribute("json", json);
        return "";
    }
}
