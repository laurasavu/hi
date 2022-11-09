import LECTIA7.DaysOfTheWeek;
import org.w3c.dom.ls.LSOutput;

public class Main {


    public static void main(String[] args) {
      //enums
        DaysOfTheWeek day=DaysOfTheWeek.Luni;
        switch (day){
            case Luni:
                System.out.println("O e luni");
                break;
            case marti:
                System.out.println("O e marti");
                break;
            default:
                System.out.println("wtf");

        }
        int[] vector={1,2,3,4,5,6,7,8,9,10};
     try{
         System.out.println(appLogic(vector,10,"22"));
     }catch(ArrayIndexOutOfBoundsException aiob){
         System.out.println("out of bound");
     }


    }
    public static int appLogic (int[] vector, int index, String number)throws
            ArrayIndexOutOfBoundsException, NumberFormatException{
        return vector[index]+Integer.parseInt(number);
    }


}
