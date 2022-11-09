package LECTIA7;

public class clsinmain {
  private static final int SIZE = 3;
  private  static String[] mesaje = {"mes1", "mes2", "mes3"};
    public static void main(String[] args) {

        oclasainterioara oclasainterioara=new oclasainterioara();
        while(oclasainterioara.hasNext()){
            System.out.println(oclasainterioara.next());
        }
    }
        private static class oclasainterioara{
            private int nextIndex=0;

            public boolean hasNext(){
                return (this.nextIndex<=SIZE-1);
            }


            public String next(){
                String returnedmess=mesaje[this.nextIndex];
                this.nextIndex++;
                return returnedmess;

            }
        }
    }


