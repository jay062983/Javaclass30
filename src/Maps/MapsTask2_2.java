package Maps;

import java.util.Map;
import java.util.TreeMap;

public class MapsTask2_2 {
    public static void main(String[] args) {
        Map<String, String> country=new TreeMap<>();
        country.put("Canada","TOronto");
        country.put("USA","washington");
        country.put("Maxico","maxico");
        country.put("France","paris");
        country.put("Brazil","Rio");
        var values=country.values();
        for(var value:values){
            System.out.println(value);
        }
        var iterator =country.values().iterator();
        while(iterator.hasNext()){
            var value=iterator.next();
            System.out.println(value);
        }
    }
}
