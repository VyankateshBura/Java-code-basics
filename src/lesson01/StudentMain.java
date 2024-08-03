package lesson01;

class Student{
    int regNo;
    String name;
    Student(int _regNo,String _name){
        regNo = _regNo;
        name = _name;
    }
}

public class StudentMain {

    public static void main(String args[]){
        Student arr[] = new Student[6];
        arr[0] = new Student(12321,"Vyankatesh");
        arr[1] = new Student(12322,"Omkar");
        arr[2] = new Student(12323,"Dynaneshwar");
        arr[3] = new Student(12324,"Ankur");
        arr[4] = new Student(12325,"Prajwal");
        arr[5] = new Student(12326,"Swayam");


        for(int i=0;i<arr.length;i++){
            System.out.println("The student with regNo "+arr[i].regNo+" is "+arr[i].name);
        }
    }
}
