package com.gradletest;

public class Main {
    public static void main(String[] args) {
        var adder = new Adder();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println("i = " + adder.add(i,j));
            }
        }
    }
}