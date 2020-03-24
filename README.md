[OTC]
# Mybatis-Learning

## 环境

- JDK 1.8

- MySql 8.0.19

- Mybatis 3.5.4

- Maven 4.0

- IDEA 2019

## 资料

[B站视频](https://www.bilibili.com/video/av69742084)

[官方文档](https://mybatis.org/mybatis-3/zh/index.html)

## 注意
- MySql

    - MySql 8 版本连接数据库时需要添加时区

    - Driver 使用的是 com.mysql.cj.jdbc.Driver

    - 使用 IDEA 连接数据库时可能会报错：Server returns invalid timezone. Go to 'Advanced' tab and set 'serverTimezone' property manually.

        - 原因：没有设置时区
        
        - 解决办法：
            
            - 命令行连接数据库：```mysql -uroot -p```
            
            - 查看是否设置时区：```show variables like'%time_zone'; ```，如果 Value 显示 SYSTEM 则没有设置
            
            - 设置时区：```set global time_zone = '+8:00';```