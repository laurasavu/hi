package Lectia12.Fire.Callables;

import Lectia12.Fire.Callables.model.call;
import Lectia12.Fire.Model.Student;
import Lectia12.Fire.Model.Teacher;
import Lectia12.Fire.utils.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Teacher> teachers= utils.getlist();
        List<Student>students=utils.getliststud();
        List<Future<Integer>>results=new ArrayList<>();
        ExecutorService executorService= Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            results.add(executorService.submit(new call<Teacher>("thread",teachers)));
        for(Future<Integer>result:results){
            if(result.isDone()){
                System.out.println( result.get());
            }
        }
        }
        executorService.shutdown();
    }
}
