package org.launchcode.techjobs.oo;

import java.util.Objects;

public class CoreCompetency extends JobField{

    private int id;
    private static int nextId = 1;
    private String value;

    public CoreCompetency() {
            id = nextId;
            nextId++;
    }

    public CoreCompetency(String value) {
        super(value);
    }
}
