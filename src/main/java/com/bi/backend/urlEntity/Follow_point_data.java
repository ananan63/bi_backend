package com.bi.backend.urlEntity;

public class Follow_point_data extends BaseUrlEntity {

    int corp_id;
    String s_date;
    String e_date;

    public Follow_point_data() {
        this.url = "https://dev.scrmapi.jihuigj.com/api/open-statistics/follow-point-data";
    }
}

/*
{
    "error": 0,
    "data": {
        "userCount": 0,
        "recordCount": 0,
        "todayUserCount": 0,
        "todayRecordCount": 0,
        "followState": [
            {
                "title": "未跟进",
                "num": 0,
                "next_num": 0
            },
            {
                "title": "跟进中",
                "num": 0,
                "next_num": 0
            },
            {
                "title": "已拒绝",
                "num": 0,
                "next_num": 0
            },
            {
                "title": "已成交",
                "num": 0,
                "next_num": 0
            },
            {
                "title": "未跟进",
                "num": 0,
                "next_num": 0
            },
            {
                "title": "无效",
                "num": 0,
                "next_num": 0
            },
            {
                "title": "已成交",
                "num": 0,
                "next_num": 0
            },
            {
                "title": "已拒绝",
                "num": 0,
                "next_num": 0
            },
            {
                "title": "跟进中",
                "num": 0,
                "next_num": 0
            },
            {
                "title": "跟进",
                "num": 0,
                "next_num": 0
            },
            {
                "title": "无效",
                "num": 0,
                "next_num": 0
            }
        ]
    }
}
 */