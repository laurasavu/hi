package L10.ColectiileJava.exercitiu;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Exemplu {
    public static void main(String[] args) {
        Map< Integer,String> map = new TreeMap<>();
        Map< String,Integer> map1 = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                return o1.compareTo(o2)  ;
            }
        });
        try {
            Path path= Paths.get("src/L10/ColectiileJava/Set/exercitiu/Monet.txt");
            List<String>paintings=Files.readAllLines(path);
            for (String paint:paintings){

                   String[]paintparts= paint.split("[\\(\\)]");

                   map.put(Integer.valueOf(paintparts[1]),paintparts[0].trim());
                   map1.put(paintparts[0].trim(),Integer.valueOf(paintparts[1]));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(map1.containsKey("Wild Poppies near Argenteuil"));
        System.out.println(map);
        System.out.println(map1);

      //Le am sortat alfabetic(map1) si dupa ani(map)

    }
}
