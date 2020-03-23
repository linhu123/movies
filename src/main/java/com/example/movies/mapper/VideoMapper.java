package com.example.movies.mapper;

import com.example.movies.pojo.VideoInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface VideoMapper {
    List<VideoInfo> selectAllVideos();

    List<VideoInfo> selectPageVideos(@Param("currentIndex") Integer currentIndex,@Param("pageSize") Integer pageSize);

    VideoInfo selectVideoById(Integer vId);

    void insertOneVideo(VideoInfo videoInfo);

    void deleteVideo(Integer vId);

    int totleVideo();

}
