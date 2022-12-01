package Lectia12.Fire.SincronizareTeste.util;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ProducerTask implements Runnable{
    List<Integer> questionList=null;
    final int LIMIT=5;
    AtomicInteger questionno;
    private int anInt=2;

    public ProducerTask(List<Integer> questionList) {
        this.questionList = questionList;
        questionno = new AtomicInteger();
    }

    public synchronized void iffull(){
     while (questionList.size() == LIMIT) {
         System.out.println("prea multe intrebri nerezolvate");
     }
 }
    @Override
    public void run() {
        producequestion(anInt);

    }

    private void producequestion(int anInt) {
        boolean estepornit = false;
        while(!estepornit) {
                iffull();
                System.out.println("new question" + anInt);
                questionList.add(anInt);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                questionno.addAndGet(1);
                if(questionno.get()==10){
                    estepornit=true;
                }
            }
    }

}


