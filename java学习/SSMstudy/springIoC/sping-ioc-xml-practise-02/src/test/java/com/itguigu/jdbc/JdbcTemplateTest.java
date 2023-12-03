package com.itguigu.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/*
测试javaTemplateTest 如何使用
 */
public class JdbcTemplateTest {
    public void testFoeJava(){
        /**
         * JdbcTemplate 简化数据库的crud 但是不提供链接池
         * DruidDataSource 负责连接的创建和数据库驱动的注册等等
         *
         */

        //0.创建一个连接池对象
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl("jdbc:mysql///studb");
        druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("sunmk156");

        //1.实例化对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(druidDataSource);

        //2.调用方法即刻
        //jdbcTemplate.update() DDL DML DCL .. 非查询语句都可以
        //jdbcTemplate.queryForObject（）DQL查询单个对象
        //jdbcTemplate.query() DQL查询集合

    }
}
