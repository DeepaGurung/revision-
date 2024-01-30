// To write a program in java that takes two numbers as input and displays the product of two numbers.
import java.util.Scanner;
class Product{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        int product = num1*num2;
        System.out.println("The product is:"+product);
              
    }
}