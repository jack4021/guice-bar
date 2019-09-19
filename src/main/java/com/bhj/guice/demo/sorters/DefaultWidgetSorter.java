package com.bhj.guice.demo.sorters;

import com.bhj.guice.demo.annotations.WidgetSorterMessage4;

import javax.inject.Inject;

public class DefaultWidgetSorter implements Sorter {
    private String message;

    @Inject
    public DefaultWidgetSorter(@WidgetSorterMessage4 String message) {
        this.message = message;
    }

    @Override
    public void sort() {
        System.out.println(message);
    }
}
