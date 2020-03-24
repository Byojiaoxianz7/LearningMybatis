# 缓存

## 缓存简介

### 1. 什么是缓存？

- 存在内存中的临时数据

- 将用户经常查询的数据放在缓存（内存）中，用户去查询数据就不用从磁盘上（关联型数据库文件）查询，从缓存中查询，从而提高查询效率，解决了高并发系统的性能问题

### 2. 为什么使用缓存？

- 减少与数据库的交互次数，减少系统开销，提高系统效率

### 3. 什么样的数据能使用缓存？

- 经常查询并且不经常改变的数据

## Mybatis 缓存

- MyBatis 内置了一个强大的事务性查询缓存机制，它可以非常方便地配置和定制

- Mybatis 中默认定义了两级缓存： 一级缓存和二级缓存

    - 默认情况下，只启用了一级缓存（SqlSession 级别的缓存，也称本地缓存）
    
    - 二级缓存需要手动开启，它是基于 namespace 级别的缓存
    
- 映射语句文件中的所有 select 语句的结果将会被缓存。

- 映射语句文件中的所有 insert、update 和 delete 语句会刷新缓存。


## 一级缓存

- 一级缓存默认开启，只在一次 SqlSession 中有效，也就是拿到连接和关闭连接这个区间段

- 可以想象成 Map

### 缓存失效的情况

- 查询不同的东西

- 增删改操作，可能会改变原来的数据，**必定会刷新缓存**

- 查询不同的 Mapper.xml

- 手动清理缓存

## 二级缓存

- 会话关闭时，二级缓存生效

- 新的会话查询信息，就可以从二级缓存中获取内容

- 不同的 mapper 查出的数据会放在自己对应的缓存（map）中

- **实体类序列化**，以后写实体类都加上
    
    ```java
    import java.io.Serializable;
    public class xxx implements Serializable {}
    ```

- 步骤：

    - 开启全局缓存：cacheEnabled，虽然是默认开启，但是写上，增加代码可读性
    
        ```xml
         <!--显示开启全局缓存-->
         <setting name="cacheEnabled" value="true"/>
        ```
      
    - 在要使用二级缓存的 mapper.xml 里添加
        
        ```xml
          <cache/>
        ```
      
        - 也可以自定义参数
        
        ```xml
         <cache
           eviction="FIFO"
           flushInterval="60000"
           size="512"
           readOnly="true"/>
        ```

# Log4j 配置
在 resources 目录下新建文件 log4j.properties
```properties
# Global logging configuration 开发时候建议使用 debug
log4j.rootLogger=DEBUG, stdout
# Console output...
log4j.appender.stdout=org.apache.log4j.ConsoleAppender
log4j.appender.stdout.layout=org.apache.log4j.PatternLayout
log4j.appender.stdout.layout.ConversionPattern=%5p [%t] - %m%n
```

# 数据库相关配置
在 resources 目录下新建文件 db.properties

```properties
driver=com.mysql.cj.jdbc.Driver
url=jdbc:mysql://localhost:3306/mybatis?userSSL=true&useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC
username=root
password=toor
```

# 核心配置文件
```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration
        PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>

    <properties resource="db.properties"/>

    <settings>
        <setting name="logImpl" value="LOG4J"/>
        <!--开启驼峰命名规则-->
        <setting name="mapUnderscoreToCamelCase" value="true"/>
    </settings>

    <environments default="development">
        <environment id="development">
            <transactionManager type="JDBC"/>
            <dataSource type="POOLED">
                <property name="driver" value="${driver}"/>
                <property name="url" value="${url}"/>
                <property name="username" value="${username}"/>
                <property name="password" value="${password}"/>
            </dataSource>
        </environment>
    </environments>

    <!--绑定接口-->
    <mappers>
        <mapper class="....." />
    </mappers>

</configuration>
```