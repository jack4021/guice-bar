package com.bhj.guice.maps2;

import com.google.inject.name.Named;

import javax.inject.Inject;

public class Gadget {

    @Inject
    public Gadget(@Named("rs.domain.prefix") String prefix) {
        System.out.println("The prefix: " + prefix);
    }
}
