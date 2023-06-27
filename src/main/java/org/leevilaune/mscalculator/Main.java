package org.leevilaune.mscalculator;

import org.leevilaune.mscalculator.domain.Monster;
import org.leevilaune.mscalculator.domain.Stage;
import org.leevilaune.mscalculator.logic.DataLoader;
import org.leevilaune.mscalculator.logic.StageManager;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.sort;

public class Main {
    public static void main(String[] args) {
        DataLoader loader = new DataLoader();
        List<Monster> monsters = loader.loadMonsters("src/main/resources/ms-2023-06-26.csv");

        StageManager manager = new StageManager(loader.loadCampaignData("src/main/resources/monster-count.csv"));
        List<Stage> stages = new ArrayList<>();
        for(Monster monster : loader.loadMonsters("src/main/resources/ms-2023-06-26.csv")){
            stages.addAll(manager.findStagesWith(monster.getName()));
        }
        List<Stage> sortedStages = manager.calculatePointsForStages(stages,monsters);
        Collections.sort(sortedStages, new Comparator<Stage>() {
            @Override
            public int compare(Stage o1, Stage o2) {
                return Integer.compare(o1.getPoints(),o2.getPoints());
            }
        });

        for (Stage s : sortedStages){
            System.out.println(s);
        }
    }
}