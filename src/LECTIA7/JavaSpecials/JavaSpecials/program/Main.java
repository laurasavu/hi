package LECTIA7.JavaSpecials.JavaSpecials.program;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    /**
     * @deprecated
     * am pus la punct varianta cu Nio care e mult mai eficienta
     * {@link VariantaCuNio }
     */
   @Deprecated
    public static void main(String[] args) {

        @SuppressWarnings({"deprication"})

        VariantaCuNio variantaCuNio=new VariantaCuNio();
        Person[] persons = new Person[5];
       int index = 0;
        try ( Scanner scanner = new Scanner(new FileInputStream("src/LECTIA7/program/persons.txt"))) {


            while (scanner.hasNext()) {
                String linieDinText = scanner.nextLine();
                System.out.println(linieDinText);
                String[] componenteleFiecareiPersoane = linieDinText.split("\\|");
                String noLN ="no last name";
                for (int i = 0; i < componenteleFiecareiPersoane.length; i++) {

                    System.out.println(componenteleFiecareiPersoane[i]);
                }

                String lastname = (Objects.equals(componenteleFiecareiPersoane[1], " ")) ? noLN : componenteleFiecareiPersoane[1];
                int age = "".equals(componenteleFiecareiPersoane[2]) ? 1 :
                        Integer.parseInt(componenteleFiecareiPersoane[2]);
                String job = componenteleFiecareiPersoane.length == 4 ? componenteleFiecareiPersoane[3] : "";
                Person person = new Person(componenteleFiecareiPersoane[0], lastname, age, job);
                persons[index] = person;
                index++;

                }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (Person person:persons) {
            try {
                if(person.getAge()==1){
                    throw new PersonException("varsta nu este ok");
                  }
                System.out.println(person);
                } catch (PersonException e) {
                    System.out.println("a aparut eroarea"+e.getMessage());
                }
            }

        }






}