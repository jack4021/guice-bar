package com.bhj.guice.demo.widgets;

import com.google.inject.ImplementedBy;

@ImplementedBy(NormalWidget.class)
public interface Widget {
    void start();
}
