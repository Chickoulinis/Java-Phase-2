package Inheritance;

public class OliveTree extends Tree {

    private String oliveType;
    private double yieldAmount;
    private double oilContent;
    private boolean isGnarled;
    private boolean isAlternateBearing;

    public OliveTree(int id, String oliveType, int plantYear) {

        super(id, "Olive Tree", "Olea europaea",
                false, plantYear, 500);

        this.oliveType = oliveType;
        this.yieldAmount = 0;
        this.isGnarled = false;
        this.isAlternateBearing = false;

        if (oliveType.equals("Kalamata")) {
            oilContent = 0.20;
        } else if (oliveType.equals("Koroneiki")) {
            oilContent = 0.25;
        } else if (oliveType.equals("Sparti")) {
            oilContent = 0.22;
        } else {
            oilContent = 0.18;
        }
    }

    public String produceFruit() {
        if (getAge() > 3 && getHealthStatus() > 0.5) {
            return "Olives";
        } else {
            return "No olives";
        }
    }

    public double harvestOlives() {

        if (getAge() > 3 && getHealthStatus() > 0.5) {

            if (!isAlternateBearing) {
                yieldAmount = 40;
                isAlternateBearing = true;
            } else {
                yieldAmount = 20;
                isAlternateBearing = false;
            }

            return yieldAmount;
        }

        return 0;
    }

    public double calculateOilYield() {
        return yieldAmount * oilContent;
    }

    public String getOliveType() {
        return oliveType;
    }
}
