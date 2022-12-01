package Lectia12.Fire;

import Lectia12.Fire.Model.Listare;
import Lectia12.Fire.Model.ListingLamba;
import Lectia12.Fire.Model.Student;
import Lectia12.Fire.Model.Teacher;
import Lectia12.Fire.utils.utils;

import java.util.List;

public class Main {

    public static void main(String[] args)  {
         List<Teacher>teacher= utils.getlist();
        List<Student> student= utils.getliststud();
        ListingLamba<Teacher>obiectlistare=new ListingLamba<>();
        ListingLamba<Student>obiectlistarestudent=new ListingLamba<>();
        //varianta in care se face o clasa separata care fie implementeaza runnable fie mosteneste Threads
        //iar apo scris codul pe care l am scris direct intr o expresie lambda, pare mai avantajoasa var cu lambda
        //dupa implementare tot trebuie mutata in alta clasa cica de incapsulare deci tot cam acolo ajung cu codul;vezi listingLambda.class
        //sa zicem da pt 2 expresii nu fac mare branza
        //  new Thread(new Listare<>(" fir cu profi",teacher)).start();
        // new Thread(new Listare<>(" fir cu studenti",student)).start();
       /* new Thread(()->{
            System.out.println("i am"+Thread.currentThread().getName());

            if (teacher.isEmpty()){
                return;
            }
            String numeleclasei= teacher.get(0).getClass().getSimpleName();
            for(int i=0;i<teacher.size();i++){
                System.out.println(numeleclasei+i+ teacher.get(i));
            }
        }).start();

    new Thread(()-> {
        System.out.println("i am" + Thread.currentThread().getName());
        if (!student.isEmpty()) {
            for (int i = 0; i < student.size(); i++) {
                String numeleCLasei1 = student.get(0).getClass().getSimpleName();
                System.out.println(numeleCLasei1 + i + student.get(i));
            }
        }

    }).start();*/
      //  new Thread(()->{obiectlistare.modelptTread(teacher,Thread.currentThread().getName());}).start();
       // new Thread(()->{obiectlistarestudent.modelptTread(student,Thread.currentThread().getName());}).start();
        //folosesc crearea de thread cu implements runnable din clasa Listare la care adaug sleep
        Thread threadone=new Thread(new Listare<Student>(" student task",student));
        Thread threadtwo=new Thread(new Listare<Teacher>(" teacher task",teacher));
        threadone.start();threadexception(threadone);
        threadtwo.start(); threadexception(threadtwo);



        //adaugarea comenzii yield;
        // daca nu stiu cat timp un thread are de executat chestii pot ceda executia unui al thread
        //yield e un hint

}
    //pt a trata exceptia aruncata de join
    //join implica ca acest thread nu va fi intrerupt pana la incheierea taskului din el
    public static void threadexception(Thread thread){
    try {
        thread.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
}
