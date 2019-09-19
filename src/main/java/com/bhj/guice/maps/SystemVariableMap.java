package com.bhj.guice.maps;

import java.util.HashMap;
import java.util.Map;

class SystemVariableMap extends HashMap<String, String> implements Map<String, String> {
    SystemVariableMap(Map<? extends String, ? extends String> m) {
        super(m);
    }
}
