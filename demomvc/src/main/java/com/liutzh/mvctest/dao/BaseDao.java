package com.liutzh.mvctest.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;


public class BaseDao
{
    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    public SqlSessionTemplate getSqlSessionTemplate()
    {
        return sqlSessionTemplate;
    }

}