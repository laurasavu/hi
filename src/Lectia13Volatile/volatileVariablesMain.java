package Lectia13Volatile;

public class volatileVariablesMain {
    private volatile int c1=0;
    private volatile int c2=0;

    public synchronized void crescC(){
        c1++;
        c2++;
    }
    public synchronized void arataC(){
        System.out.println(c1+" "+c2);
    }
    public static void main(String[] args) {
        volatileVariablesMain volatileVariablesMain=new volatileVariablesMain();

        Thread t1=new Thread(getTask(volatileVariablesMain));
        Thread t2=new Thread(getTask(volatileVariablesMain));
        t1.start();
        t2.start();

    }

    private static Runnable getTask(volatileVariablesMain volatileVariablesMain) {
  return ()->{
      for (int i = 0; i <200000; i++) {
          volatileVariablesMain.crescC();
          volatileVariablesMain.arataC();
      }
  };

    }
}
