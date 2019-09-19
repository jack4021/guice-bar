package com.bhj.guice.maps;

import javax.inject.Inject;
import java.util.Map;

public class Gadget {
    private Map<String, String> systemVariables1;
    private Map<String, String> systemVariables2;
    private Map<String, String> systemVariables3;

    @Inject
    public Gadget(@SystemVariables1 Map<String, String> systemVariables1,
                  @SystemVariables2 Map<String, String> systemVariables2,
                  @SystemVariables3 Map<String, String> systemVariables3) {
        this.systemVariables1 = systemVariables1;
        this.systemVariables2 = systemVariables2;
        this.systemVariables3 = systemVariables3;
    }

    void showSystemVariables1() {
        System.out.println("\n\nSys Var 1 --------------------------");
        systemVariables1.forEach((key, value) -> System.out.println(String.format("%s: %s", key, value)));
    }

    void showSystemVariables2() {
        System.out.println("\n\nSys Var 2 --------------------------");
        systemVariables2.forEach((key, value) -> System.out.println(String.format("%s: %s", key, value)));
    }

    void showSystemVariables3() {
        System.out.println("\n\nSys Var 3 --------------------------");
        systemVariables3.forEach((key, value) -> System.out.println(String.format("%s: %s", key, value)));
    }
}
