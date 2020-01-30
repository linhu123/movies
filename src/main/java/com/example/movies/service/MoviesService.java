package com.example.movies.service;

import com.example.movies.mapper.MoviesMapper;
import com.example.movies.pojo.Movies;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MoviesService {
    @Resource
    private MoviesMapper moviesMapper;
    public List<Movies> getAllMovies(){
        System.out.println("service get all movies");
        return moviesMapper.selectAllMovies();
    }

}
