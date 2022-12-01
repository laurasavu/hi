package L10.ColectiileJava.Set.reflection;

import Lectiile8si9AdnotarisiGenerics.generics.Generics.BlocDeApartamente;
import Lectiile8si9AdnotarisiGenerics.generics.Generics.Building;
import Lectiile8si9AdnotarisiGenerics.generics.Generics.Case;
import LECTIA7.JavaSpecials.JavaSpecials.continut.invatare.DaysOfTheWeek;

public class main {
    public static void main(String[] args) {
        Class building= Building.class;
        System.out.println(building.getName());
        Class apartament= BlocDeApartamente.class;
        System.out.println(apartament.getName());
        Class enums= DaysOfTheWeek.Luni.getClass();
        System.out.println(enums.getName());
        System.out.println(Case.class.getSuperclass());
    }

}
