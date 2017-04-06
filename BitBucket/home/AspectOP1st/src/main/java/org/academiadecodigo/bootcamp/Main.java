package org.academiadecodigo.bootcamp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by codecadet on 28/03/17.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring-config.xml");

        NaiveTest naiveTest = context.getBean(NaiveTest.class);
        naiveTest.test();
    }
}
