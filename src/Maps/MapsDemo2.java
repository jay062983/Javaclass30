package Maps;

import java.util.HashMap;

public class MapsDemo2 {
    public static void main(String[] args) {
        HashMap<String, Double>fruit= new HashMap<>();
        fruit.put("Apple", 1.99);
        fruit.put("pineApple", 1.99);
        fruit.put("grapes", 1.99);
        fruit.put("orange", 1.99);
        fruit.put("Apple", 1.99);
        System.out.println(fruit);


    }
}
