package Lectia13Volatile.semaphore.Stadion;

import java.util.concurrent.Semaphore;

public class Stadium {
    private final Semaphore semaphore;

    public Stadium(int maximumplaces) {
        semaphore = new Semaphore(maximumplaces);
    }
    public boolean tryToAcces(){
        return semaphore.tryAcquire();
    }
    public void exitStadium(){
        semaphore.release();
    }
    public int availablePlaces(){
        return semaphore.availablePermits();
    }
}
