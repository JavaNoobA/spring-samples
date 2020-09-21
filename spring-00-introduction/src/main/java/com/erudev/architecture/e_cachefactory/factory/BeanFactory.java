package com.erudev.architecture.e_cachefactory.factory;

import com.erudev.architecture.e_cachefactory.dao.DemoDao;

/**
 * @author pengfei.zhao
 * @date 2020/9/21 20:04
 */
public class BeanFactory {

    public static DemoDao getDemoDao(){
        try {
            return (DemoDao) Class.forName("com.erudev.architecture.e_cachefactory.dao.impl.DemoDaoImpl").newInstance();
        } catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("DemoDao instantiation error, cause: " + e.getMessage());
        }
    }
}
