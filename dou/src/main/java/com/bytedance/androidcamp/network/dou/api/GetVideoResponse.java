package com.bytedance.androidcamp.network.dou.api;

import com.bytedance.androidcamp.network.dou.model.Video;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetVideoResponse {
    @SerializedName("feeds")
    private List<Video> feeds;
    @SerializedName("success")
    private boolean success;

    public List<Video> getFeeds() {
        return feeds;
    }

    public void setFeeds(List<Video> feeds) {
        this.feeds = feeds;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
