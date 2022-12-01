package L10.ColectiileJava.Set.reflection;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Expresiiregulate {
    public static void main(String[] args) {
        String expresie="Java";
        String deVerificat="Programarea in limbaju Java este interesanta";

        try{
            Pattern pattern=Pattern.compile(expresie);
            Matcher matcher= pattern.matcher(deVerificat);
            boolean match=matcher.find();
            System.out.println(match);
          /*  if(matcher.find()){
                System.out.println("stringulcautat este de la "+matcher.start()+"pana la "+matcher.end());

            }else {
                System.out.println("no match");
            }*/
        }catch (PatternSyntaxException pse){
            System.out.println(pse.getMessage());
        }



    }
}
