package com.bhj.guice.demo.sorters;

public class BigWidgetSorter implements Sorter {
    private String message;

    public BigWidgetSorter(String message) {
        this.message = message;
    }

    @Override
    public void sort() {
        System.out.println(message);
    }
}
