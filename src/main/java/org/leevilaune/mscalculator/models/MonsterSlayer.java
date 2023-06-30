package org.leevilaune.mscalculator.models;

import java.util.List;

public class MonsterSlayer {

    private List<Monster> monsters;
    private String date;

    public MonsterSlayer(List<Monster> monsters, String date){
        this.monsters = monsters;
        this.date = date;
    }
}
