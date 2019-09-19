package com.bhj.guice.maps;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.TypeLiteral;

import java.util.Map;

public class SimpleModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(getTypeLiteral()).
                annotatedWith(SystemVariables2.class).
                toInstance(System.getenv());

        bind(getTypeLiteral()).
                annotatedWith(SystemVariables3.class).
                toProvider(SystemVariableProvider.class);
    }

    private TypeLiteral<Map<String, String>> getTypeLiteral() {
        return new TypeLiteral<Map<String, String>>() {
        };
    }

    @Provides
    @SystemVariables1
    private Map<String, String> getSystemVariables() {
        return System.getenv();
    }
}
