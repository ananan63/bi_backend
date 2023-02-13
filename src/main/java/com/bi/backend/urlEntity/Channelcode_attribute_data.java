package com.bi.backend.urlEntity;

public class Channelcode_attribute_data extends BaseUrlEntity {
    int corp_id;
    String s_date;
    String e_date;

    public Channelcode_attribute_data() {
        this.url = "https://dev.scrmapi.jihuigj.com/api/open-statistics/channelcode-attribute-data";
    }
}

/*
{
    "error": 0,
    "data":
    {
        "increaseCount": 9,
        "per": "0.1%",
        "seriesData1": [
        {
            "name": "男",
            "type": "line",
            "smooth": true,
            "data": [0, 0, 0, 0, "2", 0, "6", 0]
        },
        {
            "name": "女",
            "type": "line",
            "smooth": true,
            "data": [0, 0, 0, 0, 0, 0, 0, 0]
        },
        {
            "name": "未知",
            "type": "line",
            "smooth": true,
            "data": [0, 0, 0, 0, 0, 0, "1", 0]
        }],
        "seriesData2": [
        {
            "name": "机汇管家SCRM 宣传单",
            "type": "line",
            "smooth": true,
            "data": [0, 0, 0, 0, 0, 0, "7", 0]
        },
        {
            "name": "办公室易拉宝",
            "type": "line",
            "smooth": true,
            "data": [0, 0, 0, 0, "1", 0, 0, 0]
        },
        {
            "name": "裂变商城公众号文章引流",
            "type": "line",
            "smooth": true,
            "data": [0, 0, 0, 0, "1", 0, 0, 0]
        }],
        "legData1": ["男", "女", "未知"],
        "legData2": ["机汇管家SCRM 宣传单", "办公室易拉宝", "裂变商城公众号文章引流"],
        "pieData1": [
        {
            "value": 8,
            "name": "男"
        },
        {
            "value": 0,
            "name": "女"
        },
        {
            "value": 1,
            "name": "未知"
        }],
        "pieData2": [
        {
            "value": "7",
            "name": "机汇管家SCRM 宣传单"
        },
        {
            "value": "1",
            "name": "办公室易拉宝"
        },
        {
            "value": "1",
            "name": "裂变商城公众号文章引流"
        }],
        "xData": ["2023-01-25", "2023-01-26", "2023-01-27", "2023-01-28", "2023-01-29", "2023-01-30", "2023-01-31", "2023-02-01"],
        "sourceDetail": [
        {
            "name": "机汇管家SCRM 宣传单",
            "count": "7",
            "per": "0.1%"
        },
        {
            "name": "办公室易拉宝",
            "count": "1",
            "per": "0.0%"
        },
        {
            "name": "裂变商城公众号文章引流",
            "count": "1",
            "per": "0.0%"
        }]
    }
}
 */