package Lectia12.Fire.utils;

import Lectia12.Fire.Model.Student;
import Lectia12.Fire.Model.Teacher;

import java.util.ArrayList;

public class utils {
    public static ArrayList<Teacher>getlist(){
        ArrayList<Teacher> list=new ArrayList<>();
        list.add(new Teacher("suzana",44));
        list.add(new Teacher("ana",24));
        return list;
    }
    public static ArrayList<Student>getliststud(){
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("suzana",44));
        list.add(new Student("ana",24));
        return list;
    }

}
