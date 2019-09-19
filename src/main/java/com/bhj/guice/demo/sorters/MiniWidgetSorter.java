package com.bhj.guice.demo.sorters;

import com.bhj.guice.demo.annotations.WidgetSorterMessage2;

import javax.inject.Inject;

public class MiniWidgetSorter implements Sorter {
    @Inject
    @WidgetSorterMessage2
    private String message;

    @Override
    public void sort() {
        System.out.println(message);
    }
}
