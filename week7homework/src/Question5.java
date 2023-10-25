//5. Write a program for a calculator with addition, subtraction, multiplication, and division
//methods all with parameters and use string concatenation methods. (Note: Two static
//and Two instance methods.)


public class Question5 {

    public static void main(String[] args){
Question5 qus05 = new Question5();
qus05.addition(20,10);
qus05 .substraction(10, 5);
multipliction(6, 2);
division( 10, 2);

    }
    public void addition(int a,int b){
        System.out.println("10 "+(a+b));

    }
    public void substraction(int a, int b){
        System.out.println(a-b);

    }
    public static void multipliction(int a, int b){
        System.out.println(a*b);
    }
    public static void division(int a, int b){
        System.out.println(a/b);
    }

}





