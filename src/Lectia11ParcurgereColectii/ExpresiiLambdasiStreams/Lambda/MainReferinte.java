package Lectia11ParcurgereColectii.ExpresiiLambdasiStreams.Lambda;

import java.util.ArrayList;
import java.util.Arrays;

public class MainReferinte {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3));
     list.forEach(integer -> print(integer));
    list.forEach(MainReferinte::print);
    }

    private static void print(Integer integer) {
        System.out.println("lalala some days are though"+integer);
    }

    public static void print() {

    }
}
