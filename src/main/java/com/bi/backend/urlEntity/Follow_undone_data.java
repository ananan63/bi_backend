package com.bi.backend.urlEntity;

public class Follow_undone_data  extends BaseUrlEntity{
    int corp_id;
    String s_date;
    String e_date;

    int type; //1 按时；2 按天；3 按周；4 按月


    int follow_id; //跟进状态 非必须

    public Follow_undone_data() {
        this.url = "https://dev.scrmapi.jihuigj.com/api/open-statistics/follow-undone-data";
    }
}

/*
{
    "error": 0,
    "data": {
        "userData": [
            {
                "name": "未来",
                "avatar": "https://wework.qpic.cn/wwpic/564423_vjdMKFUHTg2YAbq_1650584371/0",
                "gender": "1",
                "depart": "永康市东方五金电子商务有限公司",
                "1_day": 1,
                "3_day": 1,
                "5_day": 1
            },
            {
                "name": "程玉靖",
                "avatar": "https://wework.qpic.cn/bizmail/yyvMlLFYv0dZChyxP8JgsIFA66u2qs32uZIAt8ia2UPxtdPTHrclKdw/0",
                "gender": "1",
                "depart": "永康市东方五金电子商务有限公司",
                "1_day": 1,
                "3_day": 1,
                "5_day": 1
            },
            {
                "name": "李飞跃",
                "avatar": "https://wework.qpic.cn/wwpic/214684_t1dY9gXwQ8y6nd0_1662455111/0",
                "gender": "1",
                "depart": "永康市东方五金电子商务有限公司",
                "1_day": 0,
                "3_day": 0,
                "5_day": 0
            },
            {
                "name": "厉志军",
                "avatar": "https://wework.qpic.cn/wwpic/396372_OJUJFgzVQeOTYRz_1662759350/0",
                "gender": "1",
                "depart": "永康市东方五金电子商务有限公司",
                "1_day": 2,
                "3_day": 2,
                "5_day": 2
            },
            {
                "name": "李中军",
                "avatar": "https://wework.qpic.cn/wwpic/64204_g9O-gxz9QHSMZxv_1664440922/0",
                "gender": "1",
                "depart": "永康市东方五金电子商务有限公司",
                "1_day": 10,
                "3_day": 10,
                "5_day": 10
            },
            {
                "name": "徐莹浜",
                "avatar": "http://wework.qpic.cn/bizmail/Cm63cpeJrcagzHmfnJg4I7g4KMHK9qSXJYNxWXGCq9gwn8LhCwM2hg/0",
                "gender": "1",
                "depart": "永康市东方五金电子商务有限公司",
                "1_day": 10,
                "3_day": 10,
                "5_day": 10
            },
            {
                "name": "张翼",
                "avatar": "http://wework.qpic.cn/bizmail/GfwQuW1Aia2gibDnef0KsEUyfibO9Zp9vTu08zuEjUmXpKlWxpu4W4wmw/0",
                "gender": "1",
                "depart": "永康市东方五金电子商务有限公司",
                "1_day": 2,
                "3_day": 2,
                "5_day": 2
            },
            {
                "name": "郑加靖",
                "avatar": "http://wework.qpic.cn/bizmail/2flB64SPAdQlwLFHcXy5BicdBPLvnFpLNWGp7omDdRsUaGjpx3hj2nQ/0",
                "gender": "1",
                "depart": "永康市东方五金电子商务有限公司",
                "1_day": 0,
                "3_day": 0,
                "5_day": 0
            },
            {
                "name": "周志豪",
                "avatar": "https://wework.qpic.cn/wwhead/duc2TvpEgSSdsPInfahzx87lptWkNCSSGrlf2poOsyq3WicpSE7SCibemjCoqPGuSCbdwzTxrB6y4/0",
                "gender": "1",
                "depart": "永康市东方五金电子商务有限公司",
                "1_day": 7,
                "3_day": 7,
                "5_day": 7
            },
            {
                "name": "王永进",
                "avatar": "http://wework.qpic.cn/bizmail/5eLQuIG4kltlXHfwoEzbkXgPM9zmcWMn6sydlNdiana1N7uctcqZZ7w/0",
                "gender": "1",
                "depart": "永康市东方五金电子商务有限公司",
                "1_day": 0,
                "3_day": 0,
                "5_day": 0
            }
        ],
        "dateData": [
        {
            "name": "2023-02-06",
            "1_day": 10493,
            "3_day": 10448,
            "30_day": 10225
        },
        {
            "name": "2023-02-07",
            "1_day": 10494,
            "3_day": 10481,
            "30_day": 10229
        },
        {
            "name": "2023-02-08",
            "1_day": 10540,
            "3_day": 10493,
            "30_day": 10230
        },
        {
            "name": "2023-02-09",
            "1_day": 10586,
            "3_day": 10494,
            "30_day": 10232
        }
        ],
        "columns": [
            {
                "title": "员工姓名",
                "dataIndex": "name",
                "key": "name"
            },
            {
                "title": "超过1天未跟进",
                "dataIndex": "1_day",
                "key": "1_day"
            },
            {
                "title": "超过3天未跟进",
                "dataIndex": "3_day",
                "key": "3_day"
            },
            {
                "title": "超过5天未跟进",
                "dataIndex": "5_day",
                "key": "5_day"
            }
        ],
        "count": 10
    }
}
 */