package com.bhj.guice.maps;

import javax.inject.Inject;

public class Gadget {
    private SystemVariableMap systemVariables1;
    private SystemVariableMap systemVariables2;
    private SystemVariableMap systemVariables3;

    @Inject
    public Gadget(@SystemVariables1 SystemVariableMap systemVariables1,
                  @SystemVariables2 SystemVariableMap systemVariables2,
                  @SystemVariables3 SystemVariableMap systemVariables3) {
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
