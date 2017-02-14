package com.aka;

import java.lang.reflect.Method;

public class Invoker implements java.lang.reflect.InvocationHandler {
    private Object obj;

    public Invoker(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("I inv " + method.getName());

        return method.invoke(obj, args);
    }
}
