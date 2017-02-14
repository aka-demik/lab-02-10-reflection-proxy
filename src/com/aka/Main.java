package com.aka;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
	    Director director = new Director();
	    IEmploye employe = (IEmploye) Proxy.newProxyInstance(
	            Director.class.getClassLoader(),
                Director.class.getInterfaces(),
                new Invoker(director));

	    employe.setName("Denis");
    }
}
