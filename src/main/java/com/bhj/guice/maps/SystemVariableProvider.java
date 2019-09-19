package com.bhj.guice.maps;

import javax.inject.Provider;

public class SystemVariableProvider implements Provider<SystemVariableMap> {
    @Override
    public SystemVariableMap get() {
        return new SystemVariableMap(System.getenv());
    }
}
