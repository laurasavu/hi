package Lectia12.Fire.Model;

import java.util.List;

public class Listare<T> implements Runnable{
    //numele si lista primite pentru rularea stringului
    private String name;
    private List<T> entitati;

    public Listare(String name, List<T> entitati) {
        this.name = name;
        this.entitati = entitati;
    }

    public Listare() {

    }

    @Override
    public void run() {
        System.out.println("i am"+name);

        if (entitati.isEmpty()){
            return;
        }
        String numeleclasei= entitati.get(0).getClass().getSimpleName();
       for(int i=0;i<entitati.size();i++){
           System.out.println(numeleclasei+i+ entitati.get(i));
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}
