public class Plant {
    private String name;
    private String latinName;
    private String oneYear;
    private String growthRegion;
    private int h;
    private String edible;

    public Plant() {

    }

    public Plant(String name, String latinName, String oneYear, String growthRegion, int h, String edible) {
        this.name = name;
        this.latinName = latinName;
        this.oneYear = oneYear;
        this.growthRegion = growthRegion;
        this.h = h;
        this.edible = edible;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public String getOneYear(String oneYear) {
        return this.oneYear;
    }

    public void setOneYear(String oneYear) {
        this.oneYear = oneYear;
    }

    public String getGrowthregion(String growthRegion) {
        return this.growthRegion;
    }

    public void setGrowthRegion(String growthRegion) {
        this.growthRegion = growthRegion;
    }

    public int getH(int h) {
        return this.h;
    }

    public void seth(int h) {
        this.h = h;
    }

    public String getEdible(String edible) {
        return this.edible;
    }

    public void setEdible(String edible) {
        this.edible = edible;
    }

    @Override
    public String toString() {
        return ("Augalo pavadinimas: " + name + ", lotyniskas pavadinimas: "+ latinName + ", vienmetis ar nevienmetis: " +
                oneYear + ", aukstis metrais: " + h + ", ar valgomas? " + edible);


    }
}