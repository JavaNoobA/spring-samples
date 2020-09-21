package com.erudev.architecture.e_cachefactory.dao.impl;

import com.erudev.architecture.e_cachefactory.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

/**
 * @author pengfei.zhao
 * @date 2020/9/21 19:54
 */
public class DemoMySQLImpl implements DemoDao {
    @Override
    public List<String> findAll() {
        System.out.println("MySQL...");
        return Arrays.asList("aaa", "bbb", "ccc");
    }
}
