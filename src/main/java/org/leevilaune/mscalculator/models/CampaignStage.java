package org.leevilaune.mscalculator.models;

public class CampaignStage {

    private int id;
    private String location;
    private String stage;
    private int location_id;
    private int stage_id;
    private String type;

    public CampaignStage(int id, String location, String stage, int location_id, int stage_id, String type) {
        this.id = id;
        this.location = location;
        this.stage = stage;
        this.location_id = location_id;
        this.stage_id = stage_id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    public int getStage_id() {
        return stage_id;
    }

    public void setStage_id(int stage_id) {
        this.stage_id = stage_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CampaignStage{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", stage='" + stage + '\'' +
                ", location_id=" + location_id +
                ", stage_id=" + stage_id +
                ", type='" + type + '\'' +
                '}';
    }
}
