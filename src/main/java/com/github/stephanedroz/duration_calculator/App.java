package com.github.stephanedroz.duration_calculator;

public class App {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("One argument as to be provided, i.e:\n\t14:30\n\t15h20\n\t3.5");
        }

        var convertedTime = new DurationCalculator().convertTime(args[0]);
        System.out.println(convertedTime);
    }
}