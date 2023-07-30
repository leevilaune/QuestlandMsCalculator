package org.leevilaune.mscalculator.logic;

import org.leevilaune.mscalculator.models.CampaignStage;
import org.leevilaune.mscalculator.models.Monster;
import org.leevilaune.mscalculator.models.Stage;

import java.util.ArrayList;
import java.util.List;

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

    /***
     * Calculate points for stages
     * @param stages - list of stages
     * @param monsters - list of monsters
     * @return list of stages with points calculated
     */
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

    public CampaignStage getStage(int id, List<CampaignStage> stages){
        return stages.stream().filter(stage -> stage.getId() == id).toList().get(0);
    }
}
