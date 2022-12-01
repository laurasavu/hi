package Lectia6.exceptii;

import java.util.Objects;

public class person {
    String name;
    int age;

    public person(String name, int age) throws ChekedException{
        if( name==null | Objects.equals(name, "")) throw new ChekedException("name nonull");
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        try {
            person person=new person("",20);
        } catch (ChekedException e) {
            e.printStackTrace();
        }
    }
}
