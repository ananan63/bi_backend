package com.bi.backend.controller;

import com.bi.backend.entity.HttpResult;
import com.bi.backend.httpRequest.HttpClientUtil;
import com.bi.backend.urlEntity.BaseUrlEntity;
import com.bi.backend.urlEntity.Operate_point_data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@ResponseBody
public class OperationController {

    @PostMapping("customerOperation")
    public String customerOperation(@RequestParam("corp_id") int corp_id,
                                    @RequestParam("data_Type") int data_Type,
                                    @RequestParam("s_date") String s_date,
                                    @RequestParam("e_date") String e_date,
                                    @RequestParam("s_week") int s_week,
                                    @RequestParam("type") int type,
                                    Model model){
        Operate_point_data operate_point_data = new Operate_point_data();
        Map<String, Object> map = new HashMap();
        map.put("corp_id",corp_id);
        map.put("data_Type",data_Type);
        map.put("s_date",s_date);
        map.put("e_date",e_date);
        map.put("s_week",s_week);
        map.put("type",type);
        HttpResult operate_point_data_result = null;
        try {
            operate_point_data_result = HttpClientUtil.doPost(operate_point_data.getUrl(),map);
            } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("operate_point_data_result",operate_point_data_result);
        return operate_point_data_result.toString();
    }

    //int search_type

    //int follow_id; //跟进状态 非必须
    // int status_id; //未跟进天数 非必须
}
