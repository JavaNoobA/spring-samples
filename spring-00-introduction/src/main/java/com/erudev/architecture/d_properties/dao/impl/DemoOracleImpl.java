package com.erudev.architecture.d_properties.dao.impl;

import com.erudev.architecture.d_properties.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

/**
 * @author pengfei.zhao
 * @date 2020/9/21 19:54
 */
public class DemoOracleImpl implements DemoDao {
    @Override
    public List<String> findAll() {
        System.out.println("Oracle...");
        return Arrays.asList("aaa", "bbb", "ccc");
    }
}
