package org.bolat.javabasics;

public class Degiskenler {

    public static void main(String[] args) {

     //variables
     // integer -long

        int age=20;
        int x=5;
        int y=11;
//double- float
        System.out.println(10*age);
        System.out.println(age/5);
        System.out.println(y/5);

        long mylong=10;
        System.out.println(mylong/5);
double z=5.0;
double a=11;
        System.out.println(a/z);
        float   myfloat=5.0f;
double pi=3.14;
int r=5;
        System.out.println(2*r*pi);
//z="adem";
        //string
        String name="James";
        String surname="Bolat";

        name="John";
       // name=40;

        String fullname=name+" "+surname;
        System.out.println(name);
        System.out.println(surname);
        System.out.println(fullname);

        //boolean
        boolean isAlive=true;
        isAlive=false;
        System.out.println(isAlive);

        //final
        final int myInteger=5;


        System.out.println("myInteger:"+myInteger);
        //myInteger=4;
        System.out.println("myInteger:"+myInteger);

    }
}
