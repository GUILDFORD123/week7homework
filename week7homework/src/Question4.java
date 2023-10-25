/*4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Question4 {
    String name ="Krishna";
    String city ="Guildford";
    static String surmane="patel";
    static String town ="brookwood";



    public void m1(){
        System.out.println(name);
        System.out.println(city);
        System.out.println(surmane);
        System.out.println(town);}
        public static void m2(){
        Question4 a= new Question4();

            System.out.println(a.name);
            System.out.println(a.city);
            System.out.println(surmane);
            System.out.println(town);


        }
public static void main(String args[]){

    Question4 a= new Question4();
    a.m1();
    m2();




}

    }







