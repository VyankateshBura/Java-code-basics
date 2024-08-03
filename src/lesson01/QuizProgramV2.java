package lesson01;

import java.util.Scanner;

public class QuizProgramV2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Who is the founder of Blue Origin?");
            System.out.println("1.Bill Gates\n2.Satya Nadella\n3.Jeff Bezos\n4.Tim Cook");

            System.out.println("Enter the choice(1/2/3/4/5):");
            int choice = sc.nextInt();
            if(choice==3){
                System.out.println("Congratulations!! You choosed right");
            }else if(choice==5){
                break;
            }
            else{
                System.out.println("Wrong Choice! Please try again");
            }
        }
    }
}
