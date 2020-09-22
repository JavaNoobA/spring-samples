package com.erudev.spring.basic_di.a_quickstart_set;

import com.erudev.spring.basic_di.a_quickstart_set.bean.Cat;
import com.erudev.spring.basic_di.a_quickstart_set.bean.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author pengfei.zhao
 * @date 2020/9/22 7:54
 */
public class QuickstartBySetApplication {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("basic_dl/quickstart-byset.xml");
        Person person = beanFactory.getBean(Person.class);
        Cat cat = (Cat) beanFactory.getBean("cat");
        System.out.println(person);
        System.out.println(cat);
    }
}
