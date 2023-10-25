/*19. Write a Java Program using below steps.
19.1 Declare one of your group member names as instance variable.
19.2 Declare one of your group member names as static variable.
19.3 Declare one instance method name with group name (e.g. selenium())and call both global
variables.
19.4 Declare static method name agile() and call both variable
19.5 Call both user defined methods into main method.*/


public class Question19 {

    String name = "Kinjal";
    static String name1 = "shikha";

    public void agile(){
        System.out.println(name);
        System.out.println(name1);

    }
    public static void selenium(){
        Question19 t = new Question19();
        System.out.println(t.name);
        System.out.println(name1);
    }

    public static void main(String[] args) {


        Question19 t = new Question19();
        t.agile();

    }
}
