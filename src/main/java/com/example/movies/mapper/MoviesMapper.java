package com.example.movies.mapper;

import com.example.movies.pojo.Movies;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MoviesMapper {
    List<Movies> selectAllMovies();

    Movies selectMovieById(Integer movies);

    void insertOneMoive(Movies movies);

    void deleteMovie(Movies movies);

}
