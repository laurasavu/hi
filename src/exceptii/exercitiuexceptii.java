package exceptii;

import java.util.Scanner;

public class exercitiuexceptii {
    public static void main(String[] args) {
        try(Scanner scaner=new Scanner(System.in)) {
            String primalinie = "";
            String adouainie = "";
            primalinie =getlinie(scaner, primalinie);

        System.out.println("intr linia 2");
            adouainie=getlinie(scaner, adouainie);
        System.out.println(primalinie+"si"+adouainie);
       int primulnumar=Integer.parseInt(primalinie.trim()) ;
       double aldoileanr=Double.parseDouble(adouainie.trim()) ;

            double suma=sum(primulnumar,aldoileanr);
            System.out.println(suma);

        }catch (NumberFormatException nfe){
            System.out.println(nfe.getStackTrace());
        }
        catch(Throwable throwable){
            System.out.println("exceptie"+throwable.getMessage());

        }

    }

    private static String getlinie(Scanner scaner, String linie) {
        if(scaner.hasNext()){
            linie = scaner.nextLine();
            while (linie.trim().equals("")) {
                if (scaner.hasNext()) {
                    linie = scaner.nextLine();
                }
            }
        }
        return linie;
    }

    public static double sum(Integer a, Double b) {
        return a+b ;

    }

}
