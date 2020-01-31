package com.example.movies.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping(value = "/comment")
public class CommentController {

    private static Logger logger = LoggerFactory.getLogger(CommentController.class);


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public void add(@NotNull int mId,@NotNull String comment){

    }


}
