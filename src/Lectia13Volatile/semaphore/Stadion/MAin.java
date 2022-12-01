package Lectia13Volatile.semaphore.Stadion;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MAin {
    public static void main(String[] args) {


    int places=10;
    ExecutorService executorService= Executors.newFixedThreadPool(places);
        Stadium stadium=new Stadium(places);
        //IntStream.range(0,places).forEach(spectator->
           // executorService.execute(stadium::tryToAcces));
        for (int i = 0; i < places; i++) {
            executorService.execute(stadium::tryToAcces);
        }
         executorService.shutdown();

        System.out.println(stadium.tryToAcces());
        System.out.println("locuri libere>"+(stadium.availablePlaces()==0? "no":"yes"));

    }
}