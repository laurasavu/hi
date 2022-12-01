package Lectia12.Fire.Callables.model;

import java.util.List;
import java.util.concurrent.Callable;

public class call<T> implements Callable<Integer> {
    private String name;
    private List<T> entitati;

    public call(String name, List<T> entitati) {
        this.name = name;
        this.entitati = entitati;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("i am"+name); int j = 0;
        if (!entitati.isEmpty()) {


            String numeleclasei = entitati.get(0).getClass().getSimpleName();
            for (int i = 0; i < entitati.size(); i++) {
                System.out.println(numeleclasei + i + entitati.get(i));
                j++;
            }

        }return j;
    }
}
