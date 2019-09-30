package com.bhj.guice.maps2;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class SimpleModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(String.class).
                annotatedWith(Names.named("rs.domain.prefix")).
                toInstance(null);
    }
}
