package com.tts.io.exceptions;

public class Main {

    // there are two main ideas on how to handle exceptions

    // LBYL = look before you leap
    // you test and check code implementation before properly writing and executing

    private static int dividLBYL(int x, int y) {
        if(y != 0){
            return x/y;
        }else {
            return;
        }
    }

    // EAFP = Easier to ask for forgiveness than permission
    // this means when you write and execute your code, something goes wrong

    private static int divideEAFP(int x, int y){
        try {
            return x/y;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int divide(int x, int y){
        return x / y;
    }

    public static void main(String[] args) {

        // attempting a piece of code
        // "trying" it
        try {
            int x = 100;
            int y = 0;
            System.out.println(divide(x, y));
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("I am in a finally block! I will always run!");
        }
    }
}
