package lesson02;

public class ExceptionHandling {

    public static void main(String args[]){
        try{
            int num = 10/0;
            int arr[] = {10,20};
            System.out.println(arr[3]);
            String str = null;
            System.out.println(str.length());

        }
        catch(ArithmeticException e){
            System.out.println("Divide by Zero error ");
            System.out.println("Error: "+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("This error occurs when access array with out of bound index");
            System.out.println("Error :"+e);
        }
        catch(NullPointerException e){
            System.out.println("This occures when object value is null");
            System.out.println("Error :"+e);
        }
        finally{
            System.out.println("This block always executes");
        }
    }
}
