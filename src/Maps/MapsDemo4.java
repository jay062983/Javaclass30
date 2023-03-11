package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsDemo4 {
    public static void main(String[] args) {
        Map<Integer,String>studentsMap=new HashMap<>();
        studentsMap.put(1,"kain");
        studentsMap.put(2,"main");
        studentsMap.put(3,"shain");
        studentsMap.put(4,"train");
        studentsMap.put(5,"pain");
        studentsMap.put(6,"rain");
        studentsMap.put(7,"wain");
        studentsMap.put(8,"gain");
        System.out.println(studentsMap);
        //remove all keys from above map if they are greater than 2
        Set<Integer> allkeys=studentsMap.keySet();
        allkeys.removeIf(x->x>2);
        System.out.println(studentsMap);
    }

}
