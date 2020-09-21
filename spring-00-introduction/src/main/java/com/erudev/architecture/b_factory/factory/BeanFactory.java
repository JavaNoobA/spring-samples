package com.erudev.architecture.b_factory.factory;

import com.erudev.architecture.b_factory.dao.DemoDao;
import com.erudev.architecture.b_factory.dao.impl.DemoMySQLImpl;

/**
 * @author pengfei.zhao
 * @date 2020/9/21 20:04
 */
public class BeanFactory {

    public static DemoDao getDemoDao(){
        //return new DemoDaoImpl();
        return new DemoMySQLImpl();
    }
}
