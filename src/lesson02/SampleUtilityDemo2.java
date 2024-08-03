package lesson02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SampleUtilityDemo2 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        StringTokenizer tokens = new StringTokenizer(sentence," ");
        while(tokens.hasMoreTokens()){
            String word = tokens.nextToken();
            int vowels = 0;
            for(Character c:word.toCharArray()){
                c = Character.toLowerCase(c);
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    vowels++;
                }
            }
            System.out.println(" The number of vowels in word: "+word);
            System.out.println(vowels);
        }
    }
}
