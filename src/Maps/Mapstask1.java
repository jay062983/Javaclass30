package Maps;

import java.util.HashMap;

public class Mapstask1 {
    public static void main(String[] args) {
        HashMap<Integer, String> building=new HashMap<>();
        building.put(1,"Johnson&Johonson");
        building.put(2,"kystone");
        building.put(3,"PBS coding");
        building.put(4,"Amazon Inc");
        building.put(6,"Colgate inc");
        building.put(7,"NOMAD");
        System.out.println(building);
        System.out.println(building.size());
        System.out.println(building.put(4,"Hulk Industries"));
        System.out.println(building.remove(7));
        System.out.println(building);

    }
}
