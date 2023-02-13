package com.bi.backend.urlEntity;

public class Channelcode_user_increase_data extends BaseUrlEntity{
    int corp_id;
    String s_date;
    String e_date;

    public Channelcode_user_increase_data() {
        this.url = "https://dev.scrmapi.jihuigj.com/api/open-statistics/channelcode-user-increase-data";
    }
}
/*
{
    "error": 0,
    "data":
    {
        "count": "1",
        "seriesData": ["9"],
        "xData": ["厉志军"],
        "wayData": [
        {
            "sort": 1,
            "user_id": "13",
            "name": "厉志军",
            "all_num": "9",
            "department_names": "机汇网"
        }],
        "departsName":
        {
            "1": [
            {
                "id": "1",
                "name": "机汇网"
            }]
        },
        "departs": ["1"]
    }
}
 */