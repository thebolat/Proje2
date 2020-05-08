package org.bolat.javabasics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args) {
     //diziler-arrays

        String[] myStringArray =new String[4];
        myStringArray[0]="Adem";
        myStringArray[1]="Bolat";
        myStringArray[2]="Kayseri";
        myStringArray[3]="Türkiye";

        System.out.println(myStringArray[1]);

int[] myIntegerArray = new int[4];
        myIntegerArray[0]=40;
        myIntegerArray[1]=42;
        myIntegerArray[2]=36;
        myIntegerArray[3]=52;

        System.out.println(myIntegerArray[2]);

        int[] myNumberArray={1,2,3,4,5,6,7,8};
        System.out.println(myNumberArray[2]);

        //lists - listeler
        ArrayList<String> myMusicians=new ArrayList<>();
        myMusicians.add("Barış Manço");
        myMusicians.add("Burak Kut");
        myMusicians.add(0,"Ahmet Kaya");
        myMusicians.add("Ferdi Tayfur");

        System.out.println(myMusicians.get(0));
        System.out.println(myMusicians.get(1));
        System.out.println(myMusicians.get(2));
        System.out.println(myMusicians.get(3));
        System.out.println(myMusicians.size()+" eleman var");


        HashSet<String> mySet = new HashSet<String>();
        mySet.add("James");
        mySet.add("James");
        System.out.println(mySet.size());

        //hasmap
        HashMap<String,String> myHashmap = new HashMap<String, String>();
        myHashmap.put("name","James");
        myHashmap.put("enstruman","Gitar");
        System.out.println(myHashmap.get("name"));
        System.out.println(myHashmap.get("enstruman"));

        HashMap<String,Integer> myHashmap2 = new HashMap<String,Integer>();
        myHashmap2.put("Kayseri",38);
        myHashmap2.put("İstanbul",34);

        System.out.println(myHashmap2.get("Kayseri"));








    }

}
