package com.bi.backend.controller;

import com.bi.backend.entity.HttpResult;
import com.bi.backend.httpRequest.HttpClientUtil;
import com.bi.backend.urlEntity.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class OperationController {

    @RequestMapping("customerOperation")
    public String customerOperation(
//            @RequestParam("corp_id") int corp_id,
//                                    @RequestParam("data_Type") int data_Type,
//                                    @RequestParam("s_date") String s_date,
//                                    @RequestParam("e_date") String e_date,
//                                    @RequestParam("s_week") int s_week,
//                                    @RequestParam("type") int type,
                                    Model model){
        Operate_point_data operate_point_data = new Operate_point_data();
        Operate_top_data operate_top_data = new Operate_top_data();
        Channelcode_top_data channelcode_top_data = new Channelcode_top_data();
        Follow_top_data follow_top_data = new Follow_top_data();
        Map<String, Object> map = new HashMap();
//        map.put("corp_id",corp_id);
//        map.put("data_Type",data_Type);
//        map.put("s_date",s_date);
//        map.put("e_date",e_date);
//        map.put("s_week",s_week);
//        map.put("type",type);
        map.put("corp_id",6);
        map.put("s_date","2023-01-25");
        map.put("e_date","2023-01-30");
        map.put("data_Type",1);
        map.put("s_week",4);
        map.put("type",2);
        HttpResult operate_point_data_result = null;
        HttpResult operate_top_data_result = null;
        HttpResult channelcode_top_data_result = null;
        HttpResult follow_top_data_result = null;
        try {
            operate_point_data_result = HttpClientUtil.doPost(operate_point_data.getUrl(),map);
            operate_top_data_result = HttpClientUtil.doPost(operate_top_data.getUrl(),map);
            channelcode_top_data_result = HttpClientUtil.doPost(channelcode_top_data.getUrl(),map);
            follow_top_data_result = HttpClientUtil.doPost(follow_top_data.getUrl(),map);
            } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("operate_point_data_result",operate_point_data_result);
        model.addAttribute("operate_top_data_result",operate_top_data_result);
        model.addAttribute("channelcode_top_data_result",channelcode_top_data_result);
        model.addAttribute("follow_top_data_result",follow_top_data_result);
        return "index";
    }

    //int search_type

    //int follow_id; //跟进状态 非必须
    // int status_id; //未跟进天数 非必须
}
