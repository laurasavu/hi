package Lectiile8si9AdnotarisiGenerics.generics.Generics;

public class AltBuilding {
    private BlocDeApartamente etaj;
    private BlocDeApartamente adresa;

    public BlocDeApartamente getEtaj() {
        return etaj;
    }

    public void setEtaj(BlocDeApartamente etaj) {
        this.etaj = etaj;
    }

    public BlocDeApartamente getAdresa() {
        return adresa;
    }

    public void setAdresa(BlocDeApartamente adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "AltBuilding{" +
                "etaj=" + etaj +
                ", adresa=" + adresa +
                '}';
    }
}
