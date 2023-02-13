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
        model.addAttribute("c0","https://dev.scrmapi.jihuigj.com/api/open-statistics/work-user-data");
        Map c1 = new HashMap();
        c1.put("corp_id",6);
        c1.put("s_data","2023-01-25");
        c1.put("e_data","2023-01-30");
        model.addAttribute("c1",c1);
        return "customerInfo";
    }



}
