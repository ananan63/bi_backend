package com.bi.backend.urlEntity;

public class Operate_top_data extends BaseUrlEntity{
    int corp_id;
    int data_Type; //数据类型：1发起申请数；2新增客户数；3删除/拉黑成员的客户数
    String s_date;
    String e_date;
    int s_week;
    int type;

    public Operate_top_data() {
        corp_id = 6;
        url = "https://dev.scrmapi.jihuigj.com/api/open-statistics/operate-top-data";
    }



}
