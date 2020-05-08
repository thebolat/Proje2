package org.bolat.javabasics;

public class Statements {

    public static void main(String[] args) {

Integer x = 5;
        System.out.println(x);
        x=x+1;
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);
        x=x*5;
        System.out.println(x);
        int y=4;

        System.out.println(x>y);
        System.out.println(y>x);
        y=30;
        System.out.println(x>y);
        System.out.println(x>=y);
        System.out.println(x==y);
        System.out.println(x!=y);

        //and &&
        //or ||

        x=30;
        y=130;
        int z=5;
        System.out.println(x<y && z<y);
        System.out.println(x<y || z<y);

        //if statements

        if (x<y) {
            System.out.println("y daha büyük");
        } else if (x>y) {
            System.out.println("x daha büyük");
        } else{
            System.out.println("x = y");
        }

        //switch
            int day=3;
        String dayString="";
        switch (day) {
                case 1:
                        dayString="Pazartesi";
                        break;
                case 2:
                        dayString="Salı";
                        break;
                case 3:
                        dayString="Çarşamba";
                        break;
                case 4:
                        dayString="Perşembe";
                        break;
                default:
                        dayString="Bunların dışında";
                        break;
        }
            System.out.println("Bugün="+dayString);


    }
}
