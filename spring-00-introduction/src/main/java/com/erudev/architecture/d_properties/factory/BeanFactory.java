package com.erudev.architecture.d_properties.factory;

import com.erudev.architecture.d_properties.dao.DemoDao;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author pengfei.zhao
 * @date 2020/9/21 20:04
 */
public class BeanFactory {

    /**
     * 外部化配置
     */
    private static Properties properties;

    private static Map<String, Object> beanMap = new HashMap<>();

    static {
        properties = new Properties();
        try {
            properties.load(BeanFactory.class.getClassLoader().getResourceAsStream("factory.properties"));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("BeanFactory initialize error, cause: " + e.getMessage());
        }
    }

    public static Object getBean(String beanName){
        if (!beanMap.containsKey(beanName)){
            synchronized (BeanFactory.class){
                if (!beanMap.containsKey(beanName)){
                    try {
                        Class<?> beanClazz = Class.forName(properties.getProperty(beanName));
                        Object bean = beanClazz.newInstance();
                        beanMap.put(beanName, bean);
                    }catch (ClassNotFoundException e){
                        throw new RuntimeException("BeanFactory have not [" + beanName + "] bean!", e);
                    } catch (IllegalAccessException | InstantiationException e) {
                        throw new RuntimeException("[" + beanName + "] instantiation error!", e);
                    }
                }
            }
        }
        return beanMap.get(beanName);
    }
}
