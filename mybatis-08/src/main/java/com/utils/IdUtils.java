package com.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @author: Waciao
 * @Date: 2020/3/24
 * @Version: 1.0
 * @github: https://github.com/byojiaoxianz7
 */
public class IdUtils {

    public static String getId() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

}
