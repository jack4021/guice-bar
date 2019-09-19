package com.bhj.guice.demo.widgets;

import com.bhj.guice.demo.annotations.StartChecker;
import com.bhj.guice.demo.annotations.WidgetMessage1;
import com.bhj.guice.demo.annotations.WidgetMessage2;
import com.bhj.guice.demo.annotations.WidgetSorter1;
import com.bhj.guice.demo.annotations.WidgetSorter2;
import com.bhj.guice.demo.annotations.WidgetSorter3;
import com.bhj.guice.demo.annotations.WidgetSorter4;
import com.bhj.guice.demo.sorters.Sorter;

import javax.inject.Inject;

public class NormalWidget implements Widget {
    private String message1;
    private String message2;
    private Sorter sorter1;
    private Sorter sorter2;
    private Sorter sorter3;
    private Sorter sorter4;

    @Inject
    public NormalWidget(@WidgetMessage1 String message1,
                        @WidgetMessage2 String message2,
                        @WidgetSorter1 Sorter sorter1,
                        @WidgetSorter2 Sorter sorter2,
                        @WidgetSorter3 Sorter sorter3,
                        @WidgetSorter4 Sorter sorter4) {
        this.message1 = message1;
        this.message2 = message2;
        this.sorter1 = sorter1;
        this.sorter2 = sorter2;
        this.sorter3 = sorter3;
        this.sorter4 = sorter4;
    }

    @Override
    @StartChecker
    public void start() {
        System.out.println(message1);
        System.out.println(message2);
        sorter1.sort();
        sorter2.sort();
        sorter3.sort();
        sorter4.sort();
    }

    public String getMessage1() {
        return message1;
    }

    public void setMessage1(String message1) {
        this.message1 = message1;
    }

    public String getMessage2() {
        return message2;
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    public Sorter getSorter1() {
        return sorter1;
    }

    public void setSorter1(Sorter sorter1) {
        this.sorter1 = sorter1;
    }

    public Sorter getSorter2() {
        return sorter2;
    }

    public void setSorter2(Sorter sorter2) {
        this.sorter2 = sorter2;
    }

    public Sorter getSorter3() {
        return sorter3;
    }

    public void setSorter3(Sorter sorter3) {
        this.sorter3 = sorter3;
    }

    public Sorter getSorter4() {
        return sorter4;
    }

    public void setSorter4(Sorter sorter4) {
        this.sorter4 = sorter4;
    }
}
