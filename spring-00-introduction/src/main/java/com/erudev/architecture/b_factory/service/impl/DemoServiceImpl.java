package com.erudev.architecture.b_factory.service.impl;


import com.erudev.architecture.b_factory.dao.DemoDao;
import com.erudev.architecture.b_factory.factory.BeanFactory;
import com.erudev.architecture.b_factory.service.DemoService;

import java.util.List;

/**
 * @author pengfei.zhao
 * @date 2020/9/21 19:57
 */
public class DemoServiceImpl implements DemoService {

    DemoDao demoDao = BeanFactory.getDemoDao();

    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}
