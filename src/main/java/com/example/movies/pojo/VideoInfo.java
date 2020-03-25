package com.example.movies.pojo;

import lombok.Data;

@Data
public class VideoInfo {
    private Integer v_id;
    private String v_name;
    private Integer v_star;
    private String v_info;
    private Integer v_type;
    private Integer v_desc;
    private String v_area;
    private Integer v_language;
    private Integer v_delete;
    private String v_image_url;
}
