package com.bi.backend.urlEntity;

public class Follow_top_data extends BaseUrlEntity {
    int corp_id;
    String s_date;
    String e_date;

    int type; //1 按时；2 按天；3 按周；4 按月

    int status_id; //未跟进天数 非必须
    int follow_id; //跟进状态 非必须
}


/*
{
    "error": 0,
    "data": {
        "count": 7,
        "allData": [
            {
                "sort": 1,
                "name": "徐莹浜",
                "status": "全部阶段",
                "days": "全部",
                "count": 10
            },
            {
                "sort": 2,
                "name": "李中军",
                "status": "全部阶段",
                "days": "全部",
                "count": 10
            },
            {
                "sort": 3,
                "name": "周志豪",
                "status": "全部阶段",
                "days": "全部",
                "count": "7"
            },
            {
                "sort": 4,
                "name": "厉志军",
                "status": "全部阶段",
                "days": "全部",
                "count": "2"
            },
            {
                "sort": 5,
                "name": "张翼",
                "status": "全部阶段",
                "days": "全部",
                "count": "2"
            },
            {
                "sort": 6,
                "name": "未来",
                "status": "全部阶段",
                "days": "全部",
                "count": "1"
            },
            {
                "sort": 7,
                "name": "程玉靖",
                "status": "全部阶段",
                "days": "全部",
                "count": "1"
            }
        ],
        "seriesData": [
            10,
            10,
            "7",
            "2",
            "2",
            "1",
            "1"
        ],
        "xData": [
            "徐莹浜",
            "李中军",
            "周志豪",
            "厉志军",
            "张翼",
            "未来",
            "程玉靖"
        ]
    }
}
 */