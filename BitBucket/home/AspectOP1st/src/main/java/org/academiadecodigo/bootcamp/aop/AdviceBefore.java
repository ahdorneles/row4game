package org.academiadecodigo.bootcamp.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by codecadet on 28/03/17.
 */
public class AdviceBefore implements MethodBeforeAdvice{

    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("I'm hijacking the other object");
    }
}
