package com.pojo;

/**
 * @Author: Waciao
 * @Date: 2020/3/17 11:32
 * @Version: 1.0
 * @Github: https://github.com/byojiaoxianz7
 */

/**
 * 实体类
 * @author Waciao
 */
public class User {

    private Integer id;
    private String name;
    private String pwd;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + pwd + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return pwd;
    }

    public void setPassword(String password) {
        this.pwd = password;
    }

    public User(Integer id) {
        this.id = id;
    }

    public User(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.pwd = password;
    }
}
