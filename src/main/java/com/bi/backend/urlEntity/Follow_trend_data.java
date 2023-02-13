package com.bi.backend.urlEntity;

public class Follow_trend_data extends BaseUrlEntity {
    int corp_id;
    String s_date;
    String e_date;
    int status_id; //未跟进天数 非必须

    public Follow_trend_data(){
        this.url = "https://dev.scrmapi.jihuigj.com/api/open-statistics/follow-trend-data";
    }
}

/*
{
    "error": 0,
    "data": {
        "legData": [
            "未跟进",
            "跟进中",
            "已拒绝",
            "已成交",
            "未跟进",
            "跟进中",
            "已拒绝",
            "已成交",
            "无效",
            "无效",
            "跟进"
        ],
        "pieData": [
            {
                "name": "未跟进",
                "value": 0
            },
            {
                "name": "跟进中",
                "value": 0
            },
            {
                "name": "已拒绝",
                "value": 0
            },
            {
                "name": "已成交",
                "value": 0
            },
            {
                "name": "未跟进",
                "value": 25
            },
            {
                "name": "跟进中",
                "value": 4
            },
            {
                "name": "已拒绝",
                "value": 0
            },
            {
                "name": "已成交",
                "value": "1",
                "其他": 1
            },
            {
                "name": "无效",
                "value": 0
            },
            {
                "name": "无效",
                "value": 0
            },
            {
                "name": "跟进",
                "value": 0
            }
        ],
        "seriesData": [
            {
                "name": "未跟进",
                "type": "line",
                "smooth": true,
                "data": [
                    0,
                    0,
                    0,
                    0,
                    0,
                    0,
                    0
                ]
            },
            {
                "name": "跟进中",
                "type": "line",
                "smooth": true,
                "data": [
                    0,
                    0,
                    0,
                    0,
                    0,
                    0,
                    0
                ]
            },
            {
                "name": "已拒绝",
                "type": "line",
                "smooth": true,
                "data": [
                    0,
                    0,
                    0,
                    0,
                    0,
                    0,
                    0
                ]
            },
            {
                "name": "已成交",
                "type": "line",
                "smooth": true,
                "data": [
                    0,
                    0,
                    0,
                    0,
                    0,
                    0,
                    0
                ]
            },
            {
                "name": "未跟进",
                "type": "line",
                "smooth": true,
                "data": [
                    31,
                    31,
                    31,
                    31,
                    31,
                    31,
                    31
                ]
            },
            {
                "name": "跟进中",
                "type": "line",
                "smooth": true,
                "data": [
                    4,
                    4,
                    4,
                    4,
                    4,
                    4,
                    4
                ]
            },
            {
                "name": "已拒绝",
                "type": "line",
                "smooth": true,
                "data": [
                    0,
                    0,
                    0,
                    0,
                    0,
                    0,
                    0
                ]
            },
            {
                "name": "已成交",
                "type": "line",
                "smooth": true,
                "data": [
                    1,
                    1,
                    1,
                    1,
                    1,
                    1,
                    1
                ]
            },
            {
                "name": "无效",
                "type": "line",
                "smooth": true,
                "data": [
                    0,
                    0,
                    0,
                    0,
                    0,
                    0,
                    0
                ]
            },
            {
                "name": "无效",
                "type": "line",
                "smooth": true,
                "data": [
                    0,
                    0,
                    0,
                    0,
                    0,
                    0,
                    0
                ]
            },
            {
                "name": "跟进",
                "type": "line",
                "smooth": true,
                "data": [
                    0,
                    0,
                    0,
                    0,
                    0,
                    0,
                    0
                ]
            }
        ],
        "xData": [
            "2023-01-30",
            "2023-01-31",
            "2023-02-01",
            "2023-02-02",
            "2023-02-03",
            "2023-02-04",
            "2023-02-05"
        ],
        "days": [
            {
                "name": "超过1天未跟进",
                "id": -3,
                "day": 1,
                "num": "1_day",
                "key": 0
            },
            {
                "name": "超过3天未跟进",
                "id": -2,
                "day": 3,
                "num": "3_day",
                "key": 1
            },
            {
                "id": "1",
                "day": "5",
                "name": "超过5天未跟进",
                "num": "5_day",
                "key": 2
            }
        ]
    }
}
 */