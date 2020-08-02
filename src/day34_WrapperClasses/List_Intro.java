package day34_WrapperClasses;

import java.util.ArrayList;

public class List_Intro {

    public static void main(String[] args) {
        /*
        ArrayList does not support primitives; for example : byte,short,int,long,double
        it only supports non-primitives; for example: String.Also, it support wrapper classes;
        for example;Byte,Short,Integer,Long,Double,Boolean,Char,String.

                    primitives types
        ArrayList<char> b = new ArrayList<>();
        ArrayList<boolean> c = new ArrayList<>();
        ArrayList<byte> d = new ArrayList<>();
        ArrayList<short> e = new ArrayList<>();
        ArrayList<int> f = new ArrayList<>();
        ArrayList<long> g = new ArrayList<>();
        ArrayList<double> l = new ArrayList<>();

        */



        ArrayList<String> a1 = new ArrayList<>();
        ArrayList<Double> a2 = new ArrayList<>();
        ArrayList<Long> a3 = new ArrayList<>();
        ArrayList<Byte> a4 = new ArrayList<>();
        ArrayList<Short> a5 = new ArrayList<>();
        ArrayList<Float> a6 = new ArrayList<>();
        ArrayList<Character> a7 = new ArrayList<>();
        ArrayList<Boolean> a8 = new ArrayList<>();


        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(0,90); // autoboxing
        scores.add(1,60); // autoboxing
        scores.add(2,30); // autoboxing
        scores.add(3,10); // autoboxing
        scores.add(4,0);  // autoboxing
        scores.add(5,-30);// autoboxing

        System.out.println(scores);

        System.out.println(scores.get(2));
        System.out.println(scores.get(0) + scores.get(5));


    }
}
