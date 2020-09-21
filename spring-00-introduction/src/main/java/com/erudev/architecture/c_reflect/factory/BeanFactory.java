package com.erudev.architecture.c_reflect.factory;

import com.erudev.architecture.c_reflect.dao.DemoDao;
import com.erudev.architecture.c_reflect.dao.impl.DemoMySQLImpl;

/**
 * @author pengfei.zhao
 * @date 2020/9/21 20:04
 */
public class BeanFactory {

    public static DemoDao getDemoDao(){
        try {
            return (DemoDao) Class.forName("com.erudev.architecture.c_reflect.dao.impl.DemoDaoImpl").newInstance();
        } catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("DemoDao instantiation error, cause: " + e.getMessage());
        }
    }
}
