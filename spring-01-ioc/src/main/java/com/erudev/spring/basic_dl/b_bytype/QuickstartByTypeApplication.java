package com.erudev.spring.basic_dl.b_bytype;

import com.erudev.spring.basic_dl.b_bytype.bean.Person;
import com.erudev.spring.basic_dl.b_bytype.dao.DemoDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author pengfei.zhao
 * @date 2020/9/21 20:44
 */
public class QuickstartByTypeApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("basic_dl/quickstart-bytype.xml");
        Person person = applicationContext.getBean(Person.class);
        DemoDao demoDao = applicationContext.getBean(DemoDao.class);
        System.out.println(person);
        System.out.println(demoDao.findAll());
    }
}
