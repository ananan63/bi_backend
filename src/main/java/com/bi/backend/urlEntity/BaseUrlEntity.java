package com.bi.backend.urlEntity;

import java.util.Map;

public abstract class BaseUrlEntity {

    protected String url;
    protected Map requestMap;


    public String getUrl() {
        return url;
    }

    public Map getRequestMap() {
        return requestMap;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setRequestMap(Map requestMap) {
        this.requestMap = requestMap;
    }
}
