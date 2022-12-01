package Lectia12.Fire.SincronizareTeste.model;

public class Secventa {
    private int numarator;

    public int getnumarator(){
        synchronized (this){numarator++;
        return numarator;}
    }
}
