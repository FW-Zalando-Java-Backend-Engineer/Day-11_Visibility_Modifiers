package main;

public class Counter {
    static int count = 0;


    public static  void count() {
        count++;
        System.out.println("Count: "+count);
    }

    public static void printCount(){
        System.out.println("Count: "+count);
    }
}
