package Polymorphism;

public class OliveTree extends Tree implements Harvestable {

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

        this.oilContent = 0.25;
    }

    public double collectYield() {
        return 300;
    }

    public double harvestFruit() {

        double product = 0;
        int age = getAge();
        int month = 12;

        if (age > 5 &&
           (month == 11 || month == 12 || month == 1 || month == 2 || month == 3)) {

            double olives = collectYield();
            product = olives * oilContent;

            setPlantYear(2000);
        }

        return product;
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
