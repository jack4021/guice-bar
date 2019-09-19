package com.bhj.guice.maps;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class SimpleModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(SystemVariableMap.class).
                annotatedWith(SystemVariables2.class).
                toInstance(new SystemVariableMap(System.getenv()));

        bind(SystemVariableMap.class).
                annotatedWith(SystemVariables3.class).
                toProvider(SystemVariableProvider.class);
    }

    @Provides
    @SystemVariables1
    private SystemVariableMap getSystemVariables() {
        return new SystemVariableMap(System.getenv());
    }
}
