package com.w.video.common.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Video {
    private Integer id;

    private String name;

    private String intro;

    private Date edittime;

    private Integer categoryid;

    private Integer islive;

    private String url;

    private String oriurl;

    private String thumbnailurl;

    private Integer videostateid;

    private String remark;

}