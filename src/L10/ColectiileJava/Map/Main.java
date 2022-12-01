package L10.ColectiileJava.Map;

import L10.ColectiileJava.Set.Person;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        /*HashMap
        HashMap is the implementation of Map, but it doesn't maintain any order.
        A Map cannot contain duplicate keys and each key can map to at most one value.
         Some implementations allow null key and null values like the HashMap and LinkedHashMap, but some do not like the TreeMap.
        The order of a map depends on the specific implementations.
        For example, TreeMap and LinkedHashMap have predictable orders, while HashMap does not.
        There are two interfaces for implementing Map in java.
        They are Map and SortedMap, and three classes: HashMap, TreeMap, and LinkedHashMap.
         */
        // Creating an empty HashMap
        Map<String, Integer> map = new HashMap<>();

        // Inserting entries in the Map
        // using put() method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);




        // Iterating over Map
//        for (Map.Entry<String, Integer> e : map.entrySet())
//
//            // Printing key-value pairs
//            System.out.println(e.getKey() + " "
//                    + e.getValue());


        // Creating an empty HashTable;nu accepta null nici la cheie nici la valoare
        //sincronizat
        Hashtable<Person,String> personStringHashtable=new Hashtable<>();
        personStringHashtable.put(new Person("ana",20),"adresa1");
        personStringHashtable.put(new Person("alina",30),"adresa2");
        personStringHashtable.put(new Person("dana",70),"adresa3");
        System.out.println(personStringHashtable);
        //TODO de ce le ordoneaza dupa adresa si nu dupa person care implementeaza comparable
        //nu implementeaza comparable ca treemap

        TreeMap<Person,String> personStringTree=new TreeMap<>();
        personStringTree.put(new Person("ana",20),"adresa1");
        personStringTree.put(new Person("alina",30),"adresa2");
        personStringTree.put(new Person("dana",70),"adresa3");
        System.out.println(personStringTree);

        //tree map vrea pt ca intelege ordinea
    }
}
