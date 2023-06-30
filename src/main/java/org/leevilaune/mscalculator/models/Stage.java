package org.leevilaune.mscalculator.models;

import java.util.HashMap;
import java.util.Map;

public class Stage {


    private String name;
    private int id;
    private int points;
    private Map<String, Integer> monsters;
    public Stage(String name, int id){
        this.name = name;
        this.id = id;
        this.monsters = new HashMap<>();
    }

    public void addMonster(String name, int count){
        this.monsters.put(name,count);
    }

    /***
     * Check whether stage has specified monster
     * @param monster - name of monster
     * @return boolean indicating whether monster was found
     */
    public boolean hasMonster(String monster){
        for(String s : monsters.keySet()){
            if(s.equalsIgnoreCase(monster)){
                return true;
            }
        }
        return false;
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

    public Map<String, Integer> getMonsters() {
        return monsters;
    }

    public void setMonsters(Map<String, Integer> monsters) {
        this.monsters = monsters;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Stage{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", points=" + points +
                ", monsters=" + monsters +
                '}';
    }
}
