package com.bhj.guice.maps;

import javax.inject.Provider;
import java.util.Map;

public class SystemVariableProvider implements Provider<Map<String, String>> {
    @Override
    public Map<String, String> get() {
        return System.getenv();
    }
}
