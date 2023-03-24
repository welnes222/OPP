import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Plant> garden = new ArrayList<>();

        Plant a2 = new Plant();
        a2.setName("Blakine kalendra");
        a2.setLatinName("Coriandrum sativum");
        a2.setOneYear("Vientmetis");
        a2.setGrowthRegion("Europa");
        a2.seth(1);
        a2.setEdible("taip");

        garden.add(a2);

        Plant b2 = new Plant();
        b2.setName("Sosnovskio barštis");
        b2.setLatinName("Heracleum sosnowskyi");
        b2.setOneYear("Vientmetis");
        b2.setGrowthRegion( "Europa" );
        b2.seth(5);
        b2.setEdible("Ne");

        garden.add(b2);

        garden.add(new Plant("bambukas", "Bambugu", "not one year", "Azija", 38, "ne"));
        garden.add(new Plant("Šermukšnis", "Sorbus", " not one year", "Europa", 20, "ne"));

//        for (int i = 0; i < garden.size(); i++) {
//            System.out.println(garden.get(i));
//        }
        while(true){
            Plant.info();

        }
    }
}