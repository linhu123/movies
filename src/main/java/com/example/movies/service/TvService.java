package com.example.movies.service;

import com.example.movies.mapper.TvMapper;
import com.example.movies.pojo.Tv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TvService {
    @Autowired
    private TvMapper tvMapper;

    public List<Tv> seleceTvByVId(Integer v_id){
        List<Tv> tvList = tvMapper.selectTvByVId(v_id);
        return tvList;
    }
}
