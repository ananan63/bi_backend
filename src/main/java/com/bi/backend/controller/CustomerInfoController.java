package com.bi.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class CustomerInfoController {

    @RequestMapping("/customerIndex")
    public String customerIndex(Model model){
//        model.addAttribute("c0","https://dev.scrmapi.jihuigj.com/api/open-statistics/work-user-data");
//        Map c1 = new HashMap();
        model.addAttribute("corp_id",6);
        model.addAttribute("s_date","2023-01-25");
        model.addAttribute("e_date","2023-01-30");
        model.addAttribute("data_Type",1);
        model.addAttribute("s_week",4);
        model.addAttribute("type",2);

//        model.addAttribute("c1",c1);
        return "forward:/customerOperation";
    }



}
