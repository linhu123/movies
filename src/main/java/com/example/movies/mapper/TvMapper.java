package com.example.movies.mapper;

import com.example.movies.pojo.Tv;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TvMapper {
    List<Tv> selectTvByVId(Integer v_id);
}
