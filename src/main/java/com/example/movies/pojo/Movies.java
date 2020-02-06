package com.example.movies.pojo;

import java.time.LocalDateTime;

public class Movies {
    private Integer mId;
    private String mName;
    private String mTitle;
    private int mStars;//星数
    private String mUrl;
    private String mPicture;
    private LocalDateTime createTime;
    private int deleteFlag;

    @Override
    public String toString() {
        return "Movies{" +
                "mId=" + mId +
                ", mName='" + mName + '\'' +
                ", mTitle='" + mTitle + '\'' +
                ", mStars=" + mStars +
                ", mUrl='" + mUrl + '\'' +
                ", mPicture='" + mPicture + '\'' +
                ", createTime=" + createTime +
                ", deleteFlag=" + deleteFlag +
                '}';
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public int getmStars() {
        return mStars;
    }

    public void setmStars(int mStars) {
        this.mStars = mStars;
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    public String getmPicture() {
        return mPicture;
    }

    public void setmPicture(String mPicture) {
        this.mPicture = mPicture;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public int getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(int deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}
