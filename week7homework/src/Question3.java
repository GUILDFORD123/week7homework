/*3. Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Question3 {
    String name = "Milan";
    static String surname = "patel";


    public void m1(){
        System.out.println(name);
        System.out.println(surname);
    }

    public static void m2() {
        Question3 b = new Question3();
        System.out.println(b.name);
        System.out.println(b.surname);
    }

    public static void main(String args[]) {
        Question3 b = new Question3();
        b.m1();
        m2();

    }

}


















