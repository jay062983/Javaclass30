package Maps;

import java.util.*;

public class MapsTask2 {
    public static void main(String[] args) {
        /*  Create a map of countries with its capital that will store
        * countries in alphabetical order.
        * Print all keys and values from a  country map using for each loop
        * and iterator
        * Print all values from a country map using for each loop
        * and iterator   */
        Map<String, String>country=new TreeMap<>();
        country.put("Canada","TOronto");
        country.put("USA","washington");
        country.put("Maxico","maxico");
        country.put("France","paris");
        country.put("Brazil","Rio");
      //
        //  Set<Map.Entry<String,String>> entrySet=country.entrySet();
        // using "var" keyword. java 10 version and over. before java 10 can not use "var" keyword
        var entrySet=country.entrySet();
        for (var entry:entrySet
        ) {
            System.out.println(entry.getKey()+" "+entry.getValue());

        }
        var iterator=country.entrySet().iterator();
        while(iterator.hasNext()){
            var entry=iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        }

    }

