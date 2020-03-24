package com.dao;

import com.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author: Waciao
 * @Date: 2020/3/24
 * @Version: 1.0
 * @github: https://github.com/byojiaoxianz7
 */
public interface BlogMapper {

    /**
     * 插入数据
     * @param blog
     * @return
     */
    int addBlog(Blog blog);

    /**
     * 查询博客
     * @param map
     * @return
     */
    List<Blog> queryBlogIF(Map map);
}
