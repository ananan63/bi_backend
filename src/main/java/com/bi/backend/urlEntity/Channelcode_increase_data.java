package com.bi.backend.urlEntity;

public class Channelcode_increase_data extends BaseUrlEntity {
    int corp_id;
    String s_date;
    String e_date;
    int s_week;
    int type; //1 按时；2 按天；3 按周；4 按月

    public Channelcode_increase_data() {
        this.url =  "https://dev.scrmapi.jihuigj.com/api/open-statistics/channelcode-increase-data";

    }
}
