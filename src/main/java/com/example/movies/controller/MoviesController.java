package com.example.movies.controller;

import com.example.movies.pojo.Movies;
import com.example.movies.service.MoviesService;
import com.example.movies.utils.ResT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/movies")
public class MoviesController {
    private static Logger logger = LoggerFactory.getLogger(MoviesController.class);

    @Autowired
    private MoviesService moviesService;
    /**
     * 电影列举
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ResT listMovies(){
        List<Movies> list = moviesService.getAllMovies();
        logger.info(list.toString());
        return ResT.getSuccessNeedData(list);
    }

    /**
     * 电影删除
     */
    @RequestMapping(value = "/delete")
    public void deleteMovies(Integer mId){

    }


}
