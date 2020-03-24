package com.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author: Waciao
 * @Date: 2020/3/24
 * @Version: 1.0
 * @github: https://github.com/byojiaoxianz7
 */

@Data
public class Blog {

    /**
     *   1. 属性名 createTime 和字段名 create_time 不一致，需要在 mybatis-config.xml 开启驼峰命名规则
     *   2. id 为 String 类型原因是需要用到 uuid
     */

    private String id;
    private String title;
    private String author;
    private Date createTime;
    private Integer views;
}
