package org.academiadecodigo.bootcamp.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by codecadet on 28/03/17.
 */
public class AdviceAfter implements AfterReturningAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("I am after");
    }
}
