package Lectia12.Fire.Model;

public class StudentCampus {
    private String students="";
    private long studentId=0;

    public synchronized long addStudent(){
        students += ("student" + studentId+" ");
   studentId++;
   return studentId;
    }
    public synchronized String getStudents(){
        return students;
    }
}
