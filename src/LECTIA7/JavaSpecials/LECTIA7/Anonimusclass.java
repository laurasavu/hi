package LECTIA7.JavaSpecials.LECTIA7;

public class Anonimusclass {
    public static void main(String[] args) {
        Animal caine=new Animal();
        caine.makenoise();
        //acum fac un sg obiect ca subclasa
        Animal animal=new Animal(){
            @Override
            public void makenoise() {
                System.out.println("orice animal comunica");
            }
        };
        animal.makenoise();

        Iinterface interfata= new Iinterface() {
            @Override
            public void run() {
                System.out.println("anonimus");
            }
        };
        interfata.run();
    }



}
