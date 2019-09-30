package com.bhj.guice.maps2;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class App {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new SimpleModule());
        Gadget gadget = injector.getInstance(Gadget.class);
    }
}
