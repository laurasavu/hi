package Lectia12.Fire.Model;

public class MAinResurseDistribuite {
    public static void main(String[] args) throws InterruptedException {
        /*thredurile acceseaza aceleasi resurse
        trebuie clasele sa fie thread safe
        read modify write si check then act
         */
        StudentCampus studentCampus=new StudentCampus();
        for (int i = 0; i < 10; i++) {
            studentCampus.addStudent();
        }
        System.out.println(studentCampus.getStudents());
        //acum cu mai multe fire de executie
        StudentCampus concurrentSC=new StudentCampus();
        Thread threadOne=new Thread(getTask(concurrentSC,"task1",0,3000));
        threadOne.start();
        Thread threadtwo=new Thread(getTask(concurrentSC,"task2",3000,6000));
        threadtwo.start();
        Thread.sleep(2000);
        System.out.println(concurrentSC.getStudents());
    }

    private static Runnable getTask(StudentCampus concurrentSC,String task, int start, int fin) {
    return () -> {
        for (int i = start; i < fin; i++) {
            concurrentSC.addStudent();
           // System.out.println("studentul adaugat este" + i + " task " + task);
        }
    };


    }
}
