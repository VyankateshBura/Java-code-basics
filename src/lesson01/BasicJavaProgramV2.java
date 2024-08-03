package lesson01;

import java.util.Scanner;

public class BasicJavaProgramV2 {
    public static void main(String args[]){
        int num1 ,num2;
        System.out.println("Arithmetic operations on two numbers:");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        num1 = sc.nextInt();
        System.out.println("Enter second number:");
        num2 = sc.nextInt();

        System.out.println("The addition of "+num1+" and "+num2+" is "+(num1+num2));
        System.out.println("The subtraction of "+num1+" and "+num2+" is "+(num1-num2));

        System.out.println("The multiplication of "+num1+" and "+num2+" is "+(num1*num2));

        System.out.println("The division of "+num1+" and "+num2+" is "+(num1/num2));

        System.out.println("The modulo of "+num1+" and "+num2+" is "+(num1%num2));
    }
}
