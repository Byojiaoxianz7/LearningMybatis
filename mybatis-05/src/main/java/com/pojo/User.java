package com.pojo;

/**
 * @Author: Waciao
 * @Date: 2020/3/17 11:32
 * @Version: 1.0
 * @Github: https://github.com/byojiaoxianz7
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 实体类使用lombok插件
 * @author Waciao
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;
    private String name;
    private String pwd;
}
