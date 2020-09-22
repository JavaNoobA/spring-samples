package com.erudev.spring.basic_dl.a_quickstart_byname;

import com.erudev.spring.basic_dl.a_quickstart_byname.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author pengfei.zhao
 * @date 2020/9/21 20:44
 */
public class QuickstartByNameApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("basic_dl/quickstart-byname.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }
}
