package com.bi.backend.urlEntity;

public class Channelcode_top_data extends BaseUrlEntity{

    int corp_id;
    int data_Type; //数据类型：1发起申请数；2新增客户数；3删除/拉黑成员的客户数
    String s_date;
    String e_date;
    int s_week;
    int type; //1 按时；2 按天；3 按周；4 按月

    public Channelcode_top_data() {
        corp_id = 6;
        url = "https://dev.scrmapi.jihuigj.com/api/open-statistics/channelcode-point-data";
    }
}


/*
 {
 "error": 0,
 "data":{
 "count": 3,
 "seriesData": ["7", "1", "1"],
 "wayData": [
 {
 "all_num": "7",
 "group_name": "线下公共宣传资料",
 "name": "机汇管家SCRM 宣传单",
 "sort": 1
 }
 {
 "all_num": "1",
 "group_name": "公众号",
 "name": "裂变商城公众号文章引流",
 "sort": 2
 }
 {
 "all_num": "1",
 "group_name": "线下公共宣传资料",
 "name": "办公室易拉宝",
 "sort": 3
 }],
 "xData": ["机汇管家SCRM 宣传单", "裂变商城公众号文章引流", "办公室易拉宝"]
 }
 }
 */