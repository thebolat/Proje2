package org.bolat.javabasics;

public class Loops {
    public static void main(String[] args) {

    // for döngüsü

        Integer myNumbers[]={12,15,18,33,45,7,11,9};
        System.out.println("Dizi eleman sayısı="+myNumbers.length);

        for (int i=0;i<myNumbers.length;i++) {
            int x = myNumbers[i] / 3 * 5;
            System.out.println(i+1+". işlemin sonucu="+x);
        }



    }


}
