package com.example.movies.controller;

import com.example.movies.common.ServerResponse;
import com.example.movies.pojo.Tv;
import com.example.movies.pojo.VideoInfo;
import com.example.movies.service.TvService;
import com.example.movies.service.VideoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/video")
public class VideoController {
    private static Logger logger = LoggerFactory.getLogger(VideoController.class);

    @Autowired
    private VideoService videoService;
    @Autowired
    private TvService tvService;
    /**
     * 电影列举
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ServerResponse listMovies(@RequestParam Integer currentIndex,@RequestParam Integer pageSize){
        List<VideoInfo> list = videoService.getAllMovies(currentIndex,pageSize);
        logger.info(list.toString());
        return ServerResponse.success("success",list);
    }

    @GetMapping("/total")
    public ServerResponse getVideoTitle(){
        Integer total = videoService.totleVideos();
        logger.info(String.format("电影数量%s",total));
        return ServerResponse.success("success",total);
    }

    /**
     * 电影删除
     */
    @RequestMapping(value = "/delete")
    public void deleteMovies(Integer mId){

    }

    @RequestMapping(value = "/add")
    public void addVideo(){

    }
    @GetMapping("/playId")
    public ServerResponse playId(@RequestParam Integer v_id){
        logger.info(String.format("playId is call ,v_id is %s", v_id));
        List<Tv> tvList = tvService.seleceTvByVId(v_id);
        return ServerResponse.success("success",tvList);
    }


}
