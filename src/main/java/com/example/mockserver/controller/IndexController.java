package com.example.mockserver.controller;

import com.example.mockserver.entity.DataEntity;
import com.example.mockserver.service.DataQueryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
public class IndexController {
    @Autowired
    DataQueryService service;

    @RequestMapping("/index")
    public String index(Model model) {
        String code = "";
        List<DataEntity> data = service.getData();
        model.addAttribute("code", code);
        model.addAttribute("data", data);
        return "index";
    }

    @RequestMapping("/search")
    public String search(String code, Model model){
        List<DataEntity> data = service.getData(code);
        model.addAttribute("data", data);
        return "index";
    }

    @RequestMapping("/page/add")
    public String addPage(ModelMap modelMap){
        DataEntity dataEntity = new DataEntity();
        modelMap.put("dataEntity", dataEntity);

        return "add";
    }
}
