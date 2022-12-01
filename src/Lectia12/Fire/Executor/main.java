package Lectia12.Fire.Executor;

import Lectia12.Fire.Model.Listare;
import Lectia12.Fire.Model.Student;
import Lectia12.Fire.Model.Teacher;
import Lectia12.Fire.utils.utils;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {
    public static void main(String[] args) {
        //cu newCachedThreadPool-mai multe threaduri odata
        List<Teacher> teachers= utils.getlist();
        List<Student>students=utils.getliststud();

        Listare<Teacher> listare=new Listare<>("thread1",teachers);
        Listare<Student> listare2=new Listare<>("thread2",students);
        ExecutorService executorService;
        executorService= Executors.newFixedThreadPool(8);
        executorService.submit(listare);
        executorService.submit(listare2);
        executorService.shutdown();
        //singlethreadPool=un sg thread odata, ca la join
        //fixedthreadpool-nr fix de threads
    }

}
