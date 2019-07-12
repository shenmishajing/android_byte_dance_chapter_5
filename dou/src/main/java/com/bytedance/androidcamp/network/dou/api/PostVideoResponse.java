package com.bytedance.androidcamp.network.dou.api;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class PostVideoResponse {
    @SerializedName("result")
    private Map<String, String> result;
    @SerializedName("url")
    private String url;
    @SerializedName("success")
    private boolean success;

    public Map<String, String> getResult() {
        return result;
    }

    public void setResult(Map<String, String> result) {
        this.result = result;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
