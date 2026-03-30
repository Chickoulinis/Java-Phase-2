package Polymorphism;

public class Tree {

    private int id;
    private int plantYear;

    private double height;
    private double trunkDiameter;
    private double canopyRadius;
    private double rootDepth;

    private String species;
    private String scientificName;
    private boolean isDeciduous;
    private int maxAge;

    private double healthStatus;
    private boolean isFlowering;
    private double foliageDensity;
    private double waterLevel;

    public Tree(int id, String species, String scientificName,
                boolean isDeciduous, int plantYear, int maxAge) {

        this.id = id;
        this.species = species;
        this.scientificName = scientificName;
        this.isDeciduous = isDeciduous;
        this.plantYear = plantYear;
        this.maxAge = maxAge;

        this.healthStatus = 1.0;
        this.isFlowering = true;
        this.foliageDensity = 1.0;
        this.waterLevel = 1.0;
    }

    public int getAge() {
        return 2026 - plantYear;
    }

    public double harvestWood() {
        double woodAmount = trunkDiameter * 10;
        healthStatus = 0.0;
        return woodAmount;
    }

    public int getId() {
        return id;
    }

    public String getScientificName() {
        return scientificName;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public double getHealthStatus() {
        return healthStatus;
    }

    public int getPlantYear() {
        return plantYear;
    }

    public void setPlantYear(int plantYear) {
        this.plantYear = plantYear;
    }
}
