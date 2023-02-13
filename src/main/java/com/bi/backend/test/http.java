package com.bi.backend.test;

import com.bi.backend.httpRequest.HttpClientUtil;

import java.util.HashMap;
import java.util.Map;

public class http {
    public static void main(String[] args) {
        String url = "https://dev.scrmapi.jihuigj.com/api/open-statistics/channelcode-attribute-data";
        Map<String, Object> map = new HashMap<>();
        //         corp_id:6,
        //         s_data:"2023-01-25",
        //         e_data:"2023-01-30"
        map.put("corp_id",6);
        map.put("s_data","2023-01-25");
        map.put("s_data","2023-01-30");
        String result = null;
        try {
            result =  HttpClientUtil.doPost(url,map).toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(result);

    }


}
