/*. Write a Java program print your full name on screen and then print your  surname on a separate line.
*/


public class string1 {



    public static void main(String[] args) {
        String fullName = "John Patel";


        System.out.println("Full Name- " + fullName);
        System.out.println("Surname-   " + fullName.substring(5));

    }
}
