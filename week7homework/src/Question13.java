/*13. Write a Java program to print the area and perimeter of a rectangle.
Test Data:

Width = 5.5 Height = 8.5*/



public class Question13 {
    public static void main(String[] args) {
        double w = 5.5;
        double h = 8.5;

        double area = w*h;
        double perimeter = 2* (w+h);
        System.out.println(area);
        System.out.println(perimeter);
    }
}
