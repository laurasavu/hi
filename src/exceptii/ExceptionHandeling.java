package exceptii;

public class ExceptionHandeling {
    public static void main(String[] args) {

            recover(-10);

    }

    public static void recover(int a ) {

        if (a<0){
        try {
            throw new ChekedException("a>=0");
        } catch (ChekedException e) {
            e.printStackTrace();
        }
    }
        System.out.println("a valid");

    }
}
