package com.erudev.architecture.a_original.service.impl;

import com.erudev.architecture.a_original.dao.DemoDao;
import com.erudev.architecture.a_original.dao.impl.DemoDaoImpl;
import com.erudev.architecture.a_original.service.DemoService;

import java.util.List;

/**
 * @author pengfei.zhao
 * @date 2020/9/21 19:57
 */
public class DemoServiceImpl implements DemoService {

    DemoDao demoDao = new DemoDaoImpl();

    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}
