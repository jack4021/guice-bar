package com.bhj.guice.demo.modules;

import com.bhj.guice.demo.annotations.StartChecker;
import com.bhj.guice.demo.interceptors.StartInterceptor;
import com.google.inject.AbstractModule;

import static com.google.inject.matcher.Matchers.annotatedWith;
import static com.google.inject.matcher.Matchers.any;

public class CheckerModule extends AbstractModule {
    @Override
    protected void configure() {
        bindInterceptor(any(), annotatedWith(StartChecker.class), new StartInterceptor());
    }
}
