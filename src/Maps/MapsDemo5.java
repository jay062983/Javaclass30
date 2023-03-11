package Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsDemo5 {
    public static void main(String[] args) {
        Map<Integer,String>studentsMap=new HashMap<>();
        studentsMap.put(1,"dan");
        studentsMap.put(2,"kavin");
        studentsMap.put(3,"tim");
        studentsMap.put(4,"nate");
        Collection<String>values=studentsMap.values();
        Set<Integer>allkeys=studentsMap.keySet();
        allkeys.removeIf(x->x>2);

        System.out.println(studentsMap);
        System.out.println(values);
        values.removeIf(x->x.contains("i"));
        System.out.println(values);
    }
}
