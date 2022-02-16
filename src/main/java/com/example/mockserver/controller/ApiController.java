package com.example.mockserver.controller;

import com.example.mockserver.entity.DataEntity;
import com.example.mockserver.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.DataTruncation;

@Controller
@RequestMapping("/api")
public class ApiController {
    @Autowired
    DataRepository repository;

    @PostMapping("/addSingle")
    public String addSingle(@ModelAttribute DataEntity dataEntity, Model model){
        repository.save(dataEntity);
        return "redirect:/page/add";
    }

    @RequestMapping("/delete")
    @Transactional
    public String delete(@RequestParam String code, Model model){
        repository.deleteByCode(code);
        return "redirect:/index";
    }
}
