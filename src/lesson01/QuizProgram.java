package lesson01;

import java.util.Scanner;

public class QuizProgram {
    public static void main(String args[]){
        System.out.println("Who is the founder of Blue Origin?");
        System.out.println("1.Bill Gates\n2.Satya Nadella\n3.Jeff Bezos\n4.Tim Cook");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice(1/2/3/4):");
        int choice = sc.nextInt();
        if(choice==3){
            System.out.println("Congratulations!! You choosed right");
        }else{
            System.out.println("Wrong Choice! Please try again");
        }
    }
}
