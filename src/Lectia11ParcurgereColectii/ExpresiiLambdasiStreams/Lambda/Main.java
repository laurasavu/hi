package Lectia11ParcurgereColectii.ExpresiiLambdasiStreams.Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String name = "john";
        //Lambda exemplu step by step
        MyInterface myInterface = (a) -> System.out.println("this is an annonimus class from the my interface" +
                "now becoming a lambda " + a);

        myInterface.print(name);


        // aici e importanta parcurgerea map cu for, se creaza var entry de tip Entry
        //cu entry se acceseaza getKey si GetValue
        Map<Integer, String> map = new TreeMap<>(((o1, o2) -> Integer.compare(o2, o1)));
        Map<String, Integer> map1 = new TreeMap<>(String::compareTo);
        List<MonetPaint>monetList=new ArrayList<>();
        try {
            Path path = Paths.get("src/L10/ColectiileJava/exercitiu/Monet.txt");
            List<String> paintings = Files.readAllLines(path);

            for (String paint : paintings) {

                String[] paintparts = paint.split("[\\(\\)]");

                map.put(Integer.valueOf(paintparts[1]), paintparts[0].trim());
                map1.put(paintparts[0].trim(), Integer.valueOf(paintparts[1]));
                monetList.add(new MonetPaint(paintparts[0].trim(),Integer.parseInt(paintparts[1])));

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
//        map.forEach((key, value) -> {
//            accept(key, value);
//        });

        //System.out.println(monetList);



        //STREAMS
       // List<MonetPaint>monetdupa1890=new ArrayList<>();
        monetList.stream()
                .filter(MonetPaint->MonetPaint.getYear()>1890)
                .filter(MonetPaint->MonetPaint.getName().startsWith("Water"))
                        .forEach(MonetPaint-> System.out.println(MonetPaint));

    }

    private static void accept(Integer key, String value) {
        System.out.println(key + "  " + value);
    }
}

