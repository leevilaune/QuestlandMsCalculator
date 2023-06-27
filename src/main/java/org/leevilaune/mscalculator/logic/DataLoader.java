package org.leevilaune.mscalculator.logic;

import org.leevilaune.mscalculator.domain.Monster;
import org.leevilaune.mscalculator.domain.Stage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataLoader {
    public DataLoader(){
    }

    /***
     * Loads csv of monsters to objects
     * @param fileName - path of the csv that contains monster data
     * @return list of monsters
     */
    public List<Monster> loadMonsters(String fileName){
        List<Monster> rows = null;
        Scanner scanner;
        try{
            scanner = new Scanner(new File(fileName));
            rows = new ArrayList<>();
            scanner.nextLine();
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                Monster m = new Monster(parts[0],Integer.parseInt(parts[1]));
                rows.add(m);
            }

        }catch(Exception e){
            //TODO: custom logger
            System.out.println("Something went wrong in DataLoader - loadMonsters");
        }

        return rows;
    }

    /***
     * reads campaign data which contains stage ids and monsters in there
     * @param fileName - path of the csv that contains monster data
     * @return List of stages
     */
    public List<Stage> loadCampaignData(String fileName){
        List<Stage> rows = null;
        Scanner scanner;
        try{
            scanner = new Scanner(new File(fileName));
            rows = new ArrayList<>();
            scanner.nextLine();
            String currentId = "1";
            Stage s = new Stage("stageName",Integer.parseInt(currentId));
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if(!currentId.equals(parts[0])){
                    currentId = parts[0];
                    rows.add(s);
                    s = new Stage("stageName",Integer.parseInt(parts[0]));
                }
                s.addMonster(parts[1],Integer.parseInt(parts[2]));
            }
            rows.add(s);

        }catch(Exception e){
            //TODO: custom logger
            System.out.println("Something went wrong in DataLoader - loadCampaignData");
            e.printStackTrace();
        }
        return rows;
    }
}
