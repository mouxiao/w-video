package com.w.video.common.entity;

import lombok.Data;

@Data
public class Category {
	
    private Integer id;

    private String name;

    private Integer parentid;

    private String remark;

}