package Lectia12.Fire.SincronizareTeste.main;

import Lectia12.Fire.SincronizareTeste.model.Secventa;
import Lectia12.Fire.SincronizareTeste.util.Task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {
    public static void main(String[] args) {
        Secventa secventa=new Secventa();
        Secventa secventa1=new Secventa();
        Thread one=new Thread(new Task( secventa,"thread1"));
        Thread two=new Thread(new Task(secventa,"thread2"));

        Task onetask=new Task( secventa,"task1");
        Task twotask=new Task( secventa1,"task2");

        ExecutorService executorService;
        executorService= Executors.newFixedThreadPool(6);
        executorService.submit(twotask);
        executorService.submit(onetask);
        executorService.shutdown();

}
}
