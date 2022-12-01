package LECTIA7.JavaSpecials.JavaSpecials.program;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;



public class VariantaCuNio {


    public static void main(String[] args) {
       ArrayList<Person> persons = new ArrayList<>();
       int index = 0;

        try {

            Path path=Paths.get("src/LECTIA7/JavaSpecials/JavaSpecials/program/persons.txt");

            List<String> LinesinFile = Files.readAllLines(path);

            for (String line : LinesinFile) {

                String[] identitati = line.split("\\|");

                Person person=new Person(identitati[0].trim(),identitati[1],Integer.parseInt(identitati[2]),identitati[3]);
              //  System.out.println(person);
                persons.add(person);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }catch (NumberFormatException e) {
            System.out.println("string empty");}


//        persons.stream().filter(Person->Person.getLastname().equals("Ionescu"))
//        .forEach(Person-> System.out.println(Person.toString()));
//        persons.stream().sorted(Comparator.comparing(Person::getAge).reversed())
//                .forEach(Person-> System.out.println(Person.toString()));


    }



    public void saysomething(){
        System.out.println("test ");
    }
}