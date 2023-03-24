import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Plant {
  public static Scanner sc = new Scanner(System.in);
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
        this.he = he;
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

    public int getHe(int he) {
        return this.he;
    }

    public void seth(int he) {
        this.he = he;
    }

    public String getEdible(String edible) {
        return this.edible;
    }

    public void setEdible(String edible) {
        this.edible = edible;
    }

    @Override
    public String toString() {
        return ("Augalo pavadinimas: " + name + ", lotyniskas pavadinimas: " + latinName + ", vienmetis ar nevienmetis: " +
                oneYear + ", aukstis metrais: " + he + ", ar valgomas? " + edible);

    }
        public static void info(){
            System.out.println("1. Pamatyti sarasa");
            System.out.println("2. Prideti augala");
            System.out.println("3. redaguoti augala");
            System.out.println("4. istrinti augala");
            System.out.println("5. iseiti is programos");
    }

    public static void addPlant(){
        Plant plant = new Plant();
        System.out.println("iveskite augalo pavadinima");
        plant.setName( sc.nextLine());
        System.out.println("iveskite lotyniska augalo pavadinima");
        plant.setLatinName( sc.nextLine());
        System.out.println(" iveskite ar augalas vienmetis");
        plant.setOneYear( sc.nextLine());
        System.out.println("iveskite kokiam regione auga augalas");
        plant.setGrowthRegion( sc.nextLine());
        System.out.println("iveskite augalo auksti skaiciuojant metrais");
        plant.setHe( sc.nextLine());
        System.out.println("ar augalas yra valgomas?");
        plant.setEdible( sc.nextLine());
    }

}