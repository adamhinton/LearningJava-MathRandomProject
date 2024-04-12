package dev.lpa;

public class Main {
    public static void main(String[] args) {

//        int maxMinusFive = Integer.MAX_VALUE - 5;
//        for (int j = 0, id = maxMinusFive; j< 10; id = Math.incrementExact(id), j++){
//            System.out.printf("Assigning id %,d%n", id);


        System.out.println(Math.abs(-50));
        System.out.println(Math.abs(Integer.MIN_VALUE));
//        System.out.println(Math.absExact(Integer.MIN_VALUE));
        System.out.println(Math.abs((long) Integer.MIN_VALUE));

        System.out.println("Max = " + Math.max(10, -10));

        System.out.println("Min = " + Math.min(10.0000002, 10.001f));





        }

}
