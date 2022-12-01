package Lectia12.Fire.SincronizareTeste.util;

import Lectia12.Fire.SincronizareTeste.model.Secventa;

public class Task implements Runnable {
    Secventa secventa = null;
    String name = "";

    public Task(Secventa secventa, String name) {
        this.secventa = secventa;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
           // Thread.currentThread().setName(name);
            System.out.println(secventa.getnumarator() + Thread.
                    currentThread().getName());

        }
    }
}
