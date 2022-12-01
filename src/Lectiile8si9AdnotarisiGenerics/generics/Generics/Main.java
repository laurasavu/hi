package Lectiile8si9AdnotarisiGenerics.generics.Generics;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static <T> void main(String[] args) {
        /*
         * Arraylist si generics
         */
        ArrayList<BigDecimal> arrayList = new ArrayList<>();
        arrayList.add(new BigDecimal("20.4"));
        System.out.println(arrayList.get(0));
        /*
         *   Definirea claselor si metodelor parametrizate
         */


        BlocDeApartamente bloc = new BlocDeApartamente("residence", 20);
//        Building<BlocDeApartamente> building1= new Building<>(1, 1);
//        building1.setAdresa(bloc);
//
//        System.out.println(building1.getAdresa());
//
//        AltBuilding altBuilding=new AltBuilding();
//        altBuilding.setAdresa(bloc);
//        System.out.println(altBuilding.getAdresa());

        Building<AltBuilding> building = new Building<>();

        ArrayList<Object> proprietati=new ArrayList<>();
        proprietati.add(new BlocDeApartamente("residence",10));
        proprietati.add(new BlocDeApartamente("razboieni",4));
        building.setListaProprietati(proprietati);
        Building<Case> building1 = new Building<>();
        building1.setAdresa("Gavana");
        building1.setListaProprietati(proprietati);

        ArrayList<Case>proprietati1=new ArrayList<>();
        proprietati.add(new Case("residence"));
        System.out.println(building);
        System.out.println(building1);

        /*
        generics cu limite
         */

     ArrayList<AltBuilding> buildings=new ArrayList<>();
     buildings.add(0,new AltBuilding());
     buildings.add(1,new Case());
    }
}
