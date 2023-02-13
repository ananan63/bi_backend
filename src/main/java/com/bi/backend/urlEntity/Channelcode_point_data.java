package com.bi.backend.urlEntity;

public class Channelcode_point_data extends BaseUrlEntity {
    int corp_id;

    public Channelcode_point_data() {
        corp_id = 6;
        url = "https://dev.scrmapi.jihuigj.com/api/open-statistics/channelcode-point-data";
    }
}

/*
* {
    "error": 0,
    "data": [
        {
            "title": "昨日新增客户数",
            "des": "新增客户数，成员新添加的客户数量。",
            "status": 0,
            "count": 0,
            "per": "0.0%"
        },
        {
            "title": "昨日被客户删除人数",
            "des": "删除成员的客户数，即将成员删除的客户数。",
            "status": 0,
            "count": 0,
            "per": "0.0%"
        },
        {
            "title": "昨日删除人数",
            "des": "员工删除的客户数。",
            "status": 0,
            "count": 0,
            "per": "0.0%"
        },
        {
            "title": "昨日净增人数",
            "des": "新增客户数减去昨日被客户删除人数。（该数值包含了净流失人数）",
            "status": 0,
            "count": 0,
            "per": "0.0%"
        }
    ]
}
* */