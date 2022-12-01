package L10.ColectiileJava.Set.reflection;

import L10.ColectiileJava.Set.Person;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class utils {
    public static ArrayList<Person>getlist(){
        ArrayList<Person> list=new ArrayList<>();
        list.add(new Person("suzana",44));
        list.add(new Person("ana",24));
        return list;
    }
    public static SortedSet<Person> getsortedset(){
        SortedSet<Person> set=new TreeSet<>();
        set.add(new Person("Laura",22));
        set.add(new Person("aura",2));
        return set;
    }

    public static TreeSet<String> getTreeset() {
        TreeSet<String>stringtree=new TreeSet<>();
        stringtree.add("one");
        stringtree.add("two");
        stringtree.add("five");
        return stringtree;
    }
}
