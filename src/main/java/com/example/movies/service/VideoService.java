package com.example.movies.service;

import com.example.movies.controller.VideoController;
import com.example.movies.mapper.VideoMapper;
import com.example.movies.pojo.VideoInfo;
import lombok.extern.log4j.Log4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;
@Service
public class VideoService {

    private static Logger logger = LoggerFactory.getLogger(VideoService.class);

    @Autowired
    private VideoMapper videoMapper;


    public List<VideoInfo> getAllMovies(Integer currentIndex,Integer pageSize){
        if(null != currentIndex && null!=pageSize){
            logger.info(String.format("currentIndex is %s,pageSize is %s", currentIndex,pageSize));
            return videoMapper.selectPageVideos(currentIndex,pageSize);
        }
        System.out.println("service get all movies");
        return videoMapper.selectAllVideos();
    }

    /**
     * 得到未删除的电影的数量
     * @return
     */
    public Integer totleVideos(){
        return videoMapper.totleVideo();
    }
}
