package com.kodilla.exception.test;

public class FirstChallenge {
    private double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();
        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("You almost destroyed a world! Don't divide by 0! " + e);
        }
    }
}
