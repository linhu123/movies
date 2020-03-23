package com.example.movies.common;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Page {
    private Integer totle;//数据总数量
    private Integer currentIndex;//当前位置起使
    private Integer pageSize;//偏移量；

}
