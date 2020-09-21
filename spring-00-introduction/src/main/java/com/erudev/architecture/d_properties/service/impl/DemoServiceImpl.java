package com.erudev.architecture.d_properties.service.impl;


import com.erudev.architecture.d_properties.dao.DemoDao;
import com.erudev.architecture.d_properties.factory.BeanFactory;
import com.erudev.architecture.d_properties.service.DemoService;

import java.util.List;

/**
 * @author pengfei.zhao
 * @date 2020/9/21 19:57
 */
public class DemoServiceImpl implements DemoService {

    DemoDao demoDao = (DemoDao)BeanFactory.getBean("demoDao");

    public DemoServiceImpl(){
        for (int i = 0; i < 10; i++) {
            System.out.println(BeanFactory.getBean("demoDao"));
        }
    }

    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }

    public static void main(String[] args) {
        new DemoServiceImpl();
    }
}
