package com.SarkarSiddhant.developer;

public abstract class Player {
    private String Name;

    public Player(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}

