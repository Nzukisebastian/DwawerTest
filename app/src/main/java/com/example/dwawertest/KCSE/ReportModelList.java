package com.example.dwawertest.KCSE;

public class ReportModelList {
    String description;
    String url;


    public ReportModelList() {

    };

    public ReportModelList(String description, String url) {
        this.description = description;
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

