//1.1 Declare two instance variables.
//1.2 Declare one instance method.
//1.3 Call both instance variables into the instance method inside the print statement.
//1.4 Declare the Main method.
//1.5 Call the above instance method into the Main method and run the programme.

public class Question1 {
    String name ="Milan";
    String name1 = "patel";


    public void m1() {
        System.out.println(name);
        System.out.println(name1);

    }

    public static void main(String[] args)  {
            Question1 Q=new Question1();
            Q.m1();



    }
}

