package com.bi.backend.urlEntity;

public class Follow_hopper_data extends BaseUrlEntity{
    int corp_id;
    String s_date;
    String e_date;

    public Follow_hopper_data() {
        this.url = "https://dev.scrmapi.jihuigj.com/api/open-statistics/follow-hopper-data";
    }
}


/*
{
    "error": 0,
    "data": {
        "info": [
            {
                "id": "21",
                "title": "未跟进",
                "name": "未跟进",
                "num": 0,
                "nextNum": 0,
                "day": 0,
                "everyDay": 0,
                "rate": "0%",
                "per": "0%"
            },
            {
                "id": "22",
                "title": "跟进中",
                "name": "跟进中",
                "num": 0,
                "nextNum": 0,
                "day": 0,
                "everyDay": 0,
                "rate": "0%",
                "per": "0%"
            },
            {
                "id": "23",
                "title": "已拒绝",
                "name": "已拒绝",
                "num": 0,
                "nextNum": 0,
                "day": 0,
                "everyDay": 0,
                "rate": "0%",
                "per": "0%"
            },
            {
                "id": "24",
                "title": "已成交",
                "name": "已成交",
                "num": 0,
                "nextNum": 0,
                "day": 0,
                "everyDay": 0,
                "rate": "0%",
                "per": "0%"
            },
            {
                "id": "35",
                "title": "未跟进",
                "name": "未跟进",
                "num": 0,
                "nextNum": 0,
                "day": 0,
                "everyDay": 0,
                "rate": "0%",
                "per": "0%"
            },
            {
                "id": "48",
                "title": "无效",
                "name": "无效",
                "num": 0,
                "nextNum": 0,
                "day": 0,
                "everyDay": 0,
                "rate": "0%",
                "per": "0%"
            },
            {
                "id": "38",
                "title": "已成交",
                "name": "已成交",
                "num": 0,
                "nextNum": 0,
                "day": 0,
                "everyDay": 0,
                "rate": "0%",
                "per": "0%"
            },
            {
                "id": "37",
                "title": "已拒绝",
                "name": "已拒绝",
                "num": 0,
                "nextNum": 0,
                "day": 0,
                "everyDay": 0,
                "rate": "0%",
                "per": "0%"
            },
            {
                "id": "36",
                "title": "跟进中",
                "name": "跟进中",
                "num": 0,
                "nextNum": 0,
                "day": 0,
                "everyDay": 0,
                "rate": "0%",
                "per": "0%"
            },
            {
                "id": "80",
                "title": "跟进",
                "name": "跟进",
                "num": 0,
                "nextNum": 0,
                "day": 0,
                "everyDay": 0,
                "rate": "0%",
                "per": "0%"
            },
            {
                "id": "67",
                "title": "无效",
                "name": "无效",
                "num": 0,
                "nextNum": 0,
                "day": 0,
                "everyDay": 0,
                "rate": "---",
                "per": "0%"
            }
        ],
        "legend": [
            "未跟进",
            "跟进中",
            "已拒绝",
            "已成交",
            "未跟进",
            "无效",
            "已成交",
            "已拒绝",
            "跟进中",
            "跟进",
            "无效"
        ],
        "rate": [
            {
                "num": 0,
                "name": "未跟进（0）",
                "value": "0"
            },
            {
                "num": 0,
                "name": "跟进中（0）",
                "value": "0"
            },
            {
                "num": 0,
                "name": "已拒绝（0）",
                "value": "0"
            },
            {
                "num": 0,
                "name": "已成交（0）",
                "value": "0"
            },
            {
                "num": 0,
                "name": "未跟进（0）",
                "value": "0"
            },
            {
                "num": 0,
                "name": "无效（0）",
                "value": "0"
            },
            {
                "num": 0,
                "name": "已成交（0）",
                "value": "0"
            },
            {
                "num": 0,
                "name": "已拒绝（0）",
                "value": "0"
            },
            {
                "num": 0,
                "name": "跟进中（0）",
                "value": "0"
            },
            {
                "num": 0,
                "name": "跟进（0）",
                "value": "0"
            },
            {
                "num": 0,
                "name": "无效（0）",
                "value": "0"
            }
        ],
        "series": [
            {
                "name": "未跟进（0）",
                "data": "0"
            },
            {
                "name": "跟进中（0）",
                "data": "0"
            },
            {
                "name": "已拒绝（0）",
                "data": "0"
            },
            {
                "name": "已成交（0）",
                "data": "0"
            },
            {
                "name": "未跟进（0）",
                "data": "0"
            },
            {
                "name": "无效（0）",
                "data": "0"
            },
            {
                "name": "已成交（0）",
                "data": "0"
            },
            {
                "name": "已拒绝（0）",
                "data": "0"
            },
            {
                "name": "跟进中（0）",
                "data": "0"
            },
            {
                "name": "跟进（0）",
                "data": "0"
            },
            {
                "name": "无效（0）",
                "data": "0"
            }
        ]
    }
}
 */