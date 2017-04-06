package org.academidadecodigo.bootcamp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by codecadet on 27/03/17.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("/src/main/resources/spring-config.xml");
        HelloWorld helloWithConstructor = context.getBean("helloWithConstructor", HelloWorld.class);
        HelloWorld helloWithSetter = context.getBean("helloWithSetter", HelloWorld.class);

        helloWithConstructor.talk();
        helloWithSetter.talk();
    }
}
