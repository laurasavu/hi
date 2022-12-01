package Lectia12.Fire.SincronizareTeste.util;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ConsumerTask implements Runnable {
    AtomicInteger counter;
    List<Integer> questionList;

    public synchronized void isEmpty() {
        while (questionList.isEmpty())

            System.out.println("no question ");

    }

    public ConsumerTask(List<Integer> questionlist) {
        this.questionList = questionlist;
        counter=new AtomicInteger();
    }

    @Override
    public void run() {
        boolean estepornit = false;
        while (!estepornit) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            isEmpty();
            System.out.println("answered " + "question" + questionList.remove(0));
            counter.addAndGet(1);
            if (counter.get() == 10) {
                estepornit = true;
            }
        }
    }
}