package lesson01;

public class StringFunctions {

    public static void main(String args[]){
        String str1 = "Good morning everyone!";
        String str2 = "Good morning";

        //Finds character at particular position
        System.out.println("Character at index "+2+" is "+str1.charAt(2));

        //Finds unicode character at particular index
        System.out.println("Unicode character at index "+2+" is "+str1.codePointAt(2));

        //Finds unicode character at index just before the given index;
        System.out.println("Unicode character at index "+1+" is "+str1.codePointBefore(2));

        //Finds number of character between given indexes
        System.out.println("The character betweeen index "+1+" and "+6+" is "+str1.codePointCount(1,6));

        //String comparison functions
        System.out.println("Return number of different character in string "+str1.compareTo(str2));

        System.out.println("Comparion with ignoring case "+str1.compareToIgnoreCase(str2));
        //String lenth functions
        System.out.println(str1.length());

        //String contains
        System.out.println("Checks if a string is contained in another string "+str1.contains(str2));

        //String equals
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));


        //indexOf
        System.out.println(str1.indexOf("morning"));
        System.out.println(str1.startsWith("Good"));
        System.out.println(str1.endsWith("everyone!"));





    }
}
