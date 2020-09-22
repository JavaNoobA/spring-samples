package com.erudev.spring.basic_dl.b_bytype.dao.impl;


import com.erudev.spring.basic_dl.b_bytype.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

/**
 * @author pengfei.zhao
 * @date 2020/9/21 19:54
 */
public class DemoDaoImpl implements DemoDao {

    public List<String> findAll() {
        return Arrays.asList("aaa", "bbb", "ccc");
    }
}
