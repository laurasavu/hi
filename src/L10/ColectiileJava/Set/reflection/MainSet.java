package L10.ColectiileJava.Set.reflection;

import L10.ColectiileJava.Set.Person;
import L10.ColectiileJava.Set.PersonfaraComparable;

import java.util.*;

public class MainSet {
    public static void main(String[] args) {
        Set<String> strings=new HashSet<>();

        strings.add("one");
        strings.add("two");
        strings.add("three");

        strings.addAll(Arrays.asList("one","two","four","five"));

        System.out.println(strings);

        Set<Integer> integers = new HashSet<>(Arrays.asList(1, 2, 3,4,5,6,7,8));
        integers.addAll(Arrays.asList(9,10));
        Arrays.asList(2,3,4).forEach(integers::remove);
        System.out.println(integers);
        // System.out.format("integers are elem 3 %b\n si marimea %d",integers.contains(3),integers.size());

        /* pana aici sets ar trebui sa fie tot ca listele doar ca nu accepta dubluri
              //TODO care e faza cu add all de ce nu le adauga la final
              Soted set care e un set ordonat
        */


        TreeSet<String> stringtree=utils.getTreeset();
        System.out.println(stringtree);
        //aranjare alfabetica


        SortedSet<Person> personSortedSet=utils.getsortedset();

        System.out.println(personSortedSet);

        //comparator e o interfata si se face o clasa anonima
        SortedSet<PersonfaraComparable> personfaracomparable=new TreeSet<>(new Comparator<>() {

            @Override
            public int compare(PersonfaraComparable o1, PersonfaraComparable o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });

        personfaracomparable.add(new PersonfaraComparable("iulia",23));
        personfaracomparable.add(new PersonfaraComparable("iuliana",28));
        personfaracomparable.add(new PersonfaraComparable("Ana",25));
        System.out.println(personfaracomparable);

        //Sortare lista
        List<Person> list=utils.getlist();

        Collections.sort(list);
        System.out.println("sorted list"+list);
    }
}
