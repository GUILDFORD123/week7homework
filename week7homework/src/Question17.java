/*17. Write a Java Program using below steps.
17.1 Declare your city as instance variables.
17.2 Declare your country as static variables.
17.3 Declare one instance method and call static variable in print statement
17.4 Declare static method and call instance variable in print Statement.
17.5 Call both user defined methods into main method.*/


public class Question17 {

    String name = "brookwood";
    static String name1 = "unitedKingdom";
     public void m1(){
         System.out.println(name1);
     }
     public static void m2(){
         Question17 t = new Question17();
         System.out.println(t.name);

     }

    public static void main(String[] args) {
        Question17 t = new Question17();
        t.m1();
        m2();
    }
    }


