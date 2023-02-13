package com.bi.backend.urlEntity;

public class Chat_daily_data extends BaseUrlEntity {

    int corp_id;
    int data_Type; //数据类型：1 群聊总数；2 新增群聊数；3 有过消息的群聊数；4 群成员总数；5 新增群成员数；6 发过消息的群成员数；7 群聊消息总数；8 退群人数
    String s_date;
    String e_date;
    int s_week;
    int type; //1 按时；2 按天；3 按周；4 按月

    public Chat_daily_data(){
        this.url = "https://dev.scrmapi.jihuigj.com/api/open-statistics/chat-daily-data";
    }
}

/*
{
    "error": 0,
    "data": {
        "chatData": [
            {
                "add_num": 0,
                "time": "2023-01-30"
            },
            {
                "add_num": 0,
                "time": "2023-01-31"
            },
            {
                "add_num": 0,
                "time": "2023-02-01"
            },
            {
                "add_num": 0,
                "time": "2023-02-02"
            },
            {
                "add_num": 0,
                "time": "2023-02-03"
            },
            {
                "add_num": 0,
                "time": "2023-02-04"
            },
            {
                "add_num": 0,
                "time": "2023-02-05"
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
        "seriesData": [
            {
                "name": "群聊总数",
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
        "snum1": 0,
        "snum2": 0,
        "snum3": 0,
        "snum4": 0
    }
}
 */