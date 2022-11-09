package exceptii;

import java.util.Scanner;

public class tryWithRes {
    public static void main(String[] args) {
        try(Scanner scanner=new Scanner(System.in)){
            if(scanner.hasNext()){
                System.out.println("nr este"+scanner.nextDouble());
            }
        }
    }
}
