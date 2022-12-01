package Lectia12.Fire.SincronizareTeste.main;

import Lectia12.Fire.SincronizareTeste.util.ConsumerTask;
import Lectia12.Fire.SincronizareTeste.util.ProducerTask;

import java.util.ArrayList;
import java.util.List;

public class MainPCModel {
    public static void main(String[] args) {
        List<Integer> questionlist=new ArrayList<>();
        Thread t1=new Thread(new ProducerTask(questionlist));
        Thread t2=new Thread(new ConsumerTask(questionlist));
        t1.start();
        t2.start();
    }
}
