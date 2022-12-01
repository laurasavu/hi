package Lectiile8si9AdnotarisiGenerics.generics.Generics;

import java.util.ArrayList;

public class Building <T extends AltBuilding> {

    private String adresa="Pitesti";
    private ArrayList<Object> listaProprietati;

    public Building() {
    }

    public Building(String adresa, ArrayList<T> listaProprietati) {
        this.adresa = adresa;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public ArrayList<Object> getListaProprietati() {
        return listaProprietati;
    }

    public void setListaProprietati(ArrayList<Object> listaProprietati) {
        this.listaProprietati = listaProprietati;
    }

    @Override
    public String toString() {
        return "Building{" +
                "adresa=" + adresa +
                ", listaProprietati=" + listaProprietati +
                '}';
    }
}