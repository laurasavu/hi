package Lectiile8si9AdnotarisiGenerics.generics.Generics;

public class BlocDeApartamente extends AltBuilding{
    String denumire;
    int etaje;

    public BlocDeApartamente() {
    }

    public BlocDeApartamente(String denumire, int etaje) {
        this.denumire = denumire;
        this.etaje = etaje;
    }


    public String getDenumire() {
        return denumire;
    }

    public int getEtaje() {
        return etaje;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setEtaje(int etaje) {
        this.etaje = etaje;
    }

    @Override
    public String toString() {
        return "BlocDeApartamente{" +
                "denumire='" + denumire + '\'' +
                ", etaje=" + etaje +
                '}';
    }
}
