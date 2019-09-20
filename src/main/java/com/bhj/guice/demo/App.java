package com.bhj.guice.demo;

import com.bhj.guice.demo.modules.WidgetModule;
import com.bhj.guice.demo.widgets.Widget;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class App {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new WidgetModule());
        Widget widget = injector.getInstance(Widget.class);
        widget.start();
    }
}
