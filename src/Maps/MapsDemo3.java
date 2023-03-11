package Maps;

import java.util.HashMap;
import java.util.Set;

public class MapsDemo3 {
    public static void main(String[] args) {
        HashMap<String, Double>makeup=new HashMap<>();
        makeup.put("Lipstic",34.6);
        makeup.put("facecream",30.6);
        makeup.put("facial",44.6);
        makeup.put("Blush",37.6);
        makeup.put("Eyeliner",55.6);
        makeup.put("nailcolors",74.6);
        // to get all the keys we can use keyset method from Map interface
        Set<String> allkeys=makeup.keySet();
        System.out.println(allkeys);
       // for (String s:allkeys){
        // Delete all the entries from the map for which size of key is greater than 7
            allkeys.removeIf(x->x.length()>7);// using lambda
            System.out.println(allkeys);
        System.out.println(makeup);
        }




    }

