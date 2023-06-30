package org.leevilaune.mscalculator.models;

import java.util.List;

public class Location {

    private String name;
    private int id;
    private List<Stage> stages;

    public Location(String name, int id, List<Stage> stages){
        this.name = name;
        this.id = id;
        this.stages = stages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
