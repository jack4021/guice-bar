package com.bhj.guice.demo.modules;

import com.google.inject.AbstractModule;

public class WidgetModule extends AbstractModule {
    @Override
    protected void configure() {
        install(new CheckerModule());
        install(new WidgetMessageModule());
        install(new WidgetSorterMessageModule());
        install(new WidgetSorterModule());
    }
}
