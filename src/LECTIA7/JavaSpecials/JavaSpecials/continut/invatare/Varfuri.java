package LECTIA7.JavaSpecials.JavaSpecials.continut.invatare;

public enum Varfuri {
    MOLDOVEANU(2544),
    VanatareaLuiButeanu(1911),
    NEGOIU(2154),
    Laitel(2100);
    final int altitudine;

    Varfuri(int altitudine) {
        this.altitudine = altitudine;
    }


    public static void main(String[] args) {
        int altMax=0;
        String max="  ";
        for(Varfuri varfuri:Varfuri.values()){
            if(varfuri.altitudine>altMax){
                altMax=varfuri.altitudine;
   } if(varfuri.altitudine==altMax){
                max= varfuri.name();}
        }
        /*for(Varfuri varfuri:Varfuri.values()){
            if(varfuri.altitudine==altMax){
                 max= varfuri.name();}}*/

        System.out.println("cel mai inalt varf din fagaras este "+altMax+"si anume  "+max);
    }
}