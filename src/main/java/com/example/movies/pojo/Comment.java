package com.example.movies.pojo;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Comment 实体类
 */
public class Comment {
    private Integer cId;
    private Integer mId;
    private String context;
    private LocalDateTime createTime;
    private int deleteFlag = 0;//0 表示正常 1 表示错误

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}
