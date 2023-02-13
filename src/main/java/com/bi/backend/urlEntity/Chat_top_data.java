package com.bi.backend.urlEntity;

public class Chat_top_data extends BaseUrlEntity{
    int corp_id;
    int data_Type; //数据类型：1 新增群成员数；2 退群人数；3 群聊消息总数（search_type=3时才有）
    int search_type; //查询类型：1 按群；2 按分组；3 按群主
    String s_date;
    String e_date;
    int s_week;
    int type; //1 按时；2 按天；3 按周；4 按月

    public Chat_top_data(){
        this.url = "https://dev.scrmapi.jihuigj.com/api/open-statistics/chat-top-data";
    }
}

/*
{
    "error": 0,
    "data":
    {
        "chatData": [
        {
            "sort": 1,
            "name": "新需求沟通|裂变商城+机汇管家",
            "group_name": "未分组",
            "all_num": "11"
        },
        {
            "sort": 2,
            "name": "58招聘+东方五金网对接群",
            "group_name": "未分组",
            "all_num": "8"
        },
        {
            "sort": 3,
            "name": "扶鹰咨询部SCRM推进（技术）",
            "group_name": "未分组",
            "all_num": "8"
        }],
        "xData": ["新需求沟通|裂变商城+机汇管家", "58招聘+东方五金网对接群", "扶鹰咨询部SCRM推进（技术）"],
        "seriesData": ["11", "8", "8"]
    }
}
 */