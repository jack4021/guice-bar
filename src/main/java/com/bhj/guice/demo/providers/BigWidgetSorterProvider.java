package com.bhj.guice.demo.providers;

import com.bhj.guice.demo.sorters.Sorter;
import com.bhj.guice.demo.annotations.WidgetSorterMessage3;
import com.bhj.guice.demo.sorters.BigWidgetSorter;

import javax.inject.Inject;
import javax.inject.Provider;

public class BigWidgetSorterProvider implements Provider<Sorter> {
    @Inject
    @WidgetSorterMessage3
    private String message;

    @Override
    public Sorter get() {
        return new BigWidgetSorter(message);
    }
}
