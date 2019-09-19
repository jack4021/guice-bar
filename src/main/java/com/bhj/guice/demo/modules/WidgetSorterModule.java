package com.bhj.guice.demo.modules;

import com.bhj.guice.demo.annotations.WidgetSorter1;
import com.bhj.guice.demo.annotations.WidgetSorter2;
import com.bhj.guice.demo.annotations.WidgetSorter3;
import com.bhj.guice.demo.annotations.WidgetSorter4;
import com.bhj.guice.demo.sorters.Sorter;
import com.bhj.guice.demo.providers.BigWidgetSorterProvider;
import com.bhj.guice.demo.sorters.DefaultWidgetSorter;
import com.bhj.guice.demo.sorters.MediumWidgetSorter;
import com.bhj.guice.demo.sorters.MiniWidgetSorter;
import com.google.inject.AbstractModule;

public class WidgetSorterModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Sorter.class).
                annotatedWith(WidgetSorter1.class).
                to(MediumWidgetSorter.class);
        bind(Sorter.class).
                annotatedWith(WidgetSorter2.class).
                to(MiniWidgetSorter.class);
        bind(Sorter.class).
                annotatedWith(WidgetSorter3.class).
                toProvider(BigWidgetSorterProvider.class);
        bind(Sorter.class).
                annotatedWith(WidgetSorter4.class).
                to(DefaultWidgetSorter.class);
    }
}
