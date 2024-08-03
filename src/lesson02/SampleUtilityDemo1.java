package lesson02;

import java.util.ArrayList;
import java.util.function.Consumer;

class MyConsumer<T> implements Consumer<T> {

    @Override
    public void accept(T t) {
        System.out.println("Working on the number :"+t);
        System.out.println("The number formed after adding 5 to it is :"+((int)t+5));
    }
}

public class SampleUtilityDemo1 {
    public static void main(String args[]){
        ArrayList nums = new ArrayList();
        MyConsumer mycons = new MyConsumer();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        nums.add(500);
        nums.forEach(mycons);
    }
}
