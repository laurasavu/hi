package Lectia12.Fire.Model;

import java.util.List;

public class ListingLamba <T>{
    public void modelptTread(List<T>entitati,String name){
        System.out.println("i am"+name);

        if (entitati.isEmpty()){
            return;
        }
        String numeleclasei= entitati.get(0).getClass().getSimpleName();
        for(int i=0;i<entitati.size();i++){
            System.out.println(numeleclasei+i+ entitati.get(i));
        }
    }

}
