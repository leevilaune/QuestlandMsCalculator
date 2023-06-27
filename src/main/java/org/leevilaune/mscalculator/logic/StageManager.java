package org.leevilaune.mscalculator.logic;

import org.leevilaune.mscalculator.domain.Monster;
import org.leevilaune.mscalculator.domain.Stage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StageManager {

    private List<Stage> stages;


    public StageManager(List<Stage> stages){
        this.stages = stages;
    }

    /***
     * Find stages with specified monster
     * @param monster - String of monster name
     * @return list of stages with wanted monster
     */
    public List<Stage> findStagesWith(String monster){
        List<Stage> stagesWith = this.stages.stream().filter(stage -> stage.hasMonster(monster)).toList();
        return stagesWith;
    }

    public List<Stage> calculatePointsForStages(List<Stage> stages, List<Monster> monsters){
        List<Stage> stageList = new ArrayList<>();
        for (Stage s : stages){
            int points = 0;
            for(Monster m : monsters){
                if(s.getMonsters().get(m.getName()) == null){
                    continue;
                }
                points+=s.getMonsters().get(m.getName())*m.getPoints();
            }
            s.setPoints(points);
            if(!stageList.contains(s)){
                stageList.add(s);
            }
        }
        return stageList;
    }
}
