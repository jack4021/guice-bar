package com.bhj.guice.demo.modules;

import com.bhj.guice.demo.annotations.WidgetSorterMessage1;
import com.bhj.guice.demo.annotations.WidgetSorterMessage2;
import com.bhj.guice.demo.annotations.WidgetSorterMessage3;
import com.bhj.guice.demo.annotations.WidgetSorterMessage4;
import com.google.inject.AbstractModule;

public class WidgetSorterMessageModule extends AbstractModule {
    private static final String PREFIX = "Let's do some sorting. ";

    @Override
    protected void configure() {
        bind(String.class).
                annotatedWith(WidgetSorterMessage1.class).
                toInstance(PREFIX + "WidgetSorterMessage1");
        bind(String.class).
                annotatedWith(WidgetSorterMessage2.class).
                toInstance(PREFIX + "WidgetSorterMessage2");
        bind(String.class).
                annotatedWith(WidgetSorterMessage3.class).
                toInstance(PREFIX + "WidgetSorterMessage3");
        bind(String.class).
                annotatedWith(WidgetSorterMessage4.class).
                toInstance(PREFIX + "WidgetSorterMessage4");
    }
}
