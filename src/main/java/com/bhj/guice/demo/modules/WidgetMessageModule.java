package com.bhj.guice.demo.modules;

import com.bhj.guice.demo.annotations.WidgetMessage1;
import com.bhj.guice.demo.annotations.WidgetMessage2;
import com.google.inject.AbstractModule;

public class WidgetMessageModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(String.class).
                annotatedWith(WidgetMessage1.class).
                toInstance("Here's message 1.");
        bind(String.class).
                annotatedWith(WidgetMessage2.class).
                toInstance("Here's message 2.");
    }
}
