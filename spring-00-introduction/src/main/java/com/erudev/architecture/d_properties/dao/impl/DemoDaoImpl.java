package com.erudev.architecture.d_properties.dao.impl;

import com.erudev.architecture.d_properties.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

/**
 * @author pengfei.zhao
 * @date 2020/9/21 19:54
 */
public class DemoDaoImpl implements DemoDao {
    @Override
    public List<String> findAll() {
        return Arrays.asList("aaa", "bbb", "ccc");
    }
}
