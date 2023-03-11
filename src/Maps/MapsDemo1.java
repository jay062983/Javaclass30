package Maps;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo1 {
    public static void main(String[] args) {
        Map<Integer,String>studentsMap=new HashMap<>();
        studentsMap.put(1,"dan");
        studentsMap.put(2,"kavin");
        studentsMap.put(3,"tim");
        studentsMap.put(4,"nate");
        System.out.println(studentsMap);
        System.out.println(studentsMap.get(3));
        System.out.println(studentsMap.size());
        System.out.println(studentsMap.containsKey(5));
        System.out.println(studentsMap.containsValue("john"));
        System.out.println(studentsMap.remove(1));
        System.out.println(studentsMap);
    }
}
