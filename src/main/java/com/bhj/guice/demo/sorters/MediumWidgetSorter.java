package com.bhj.guice.demo.sorters;

import com.bhj.guice.demo.annotations.WidgetSorterMessage1;

import javax.inject.Inject;

public class MediumWidgetSorter implements Sorter {
    private String message;

    @Inject
    public MediumWidgetSorter(@WidgetSorterMessage1 String message) {
        this.message = message;
    }

    @Override
    public void sort() {
        System.out.println(message);
    }
}
