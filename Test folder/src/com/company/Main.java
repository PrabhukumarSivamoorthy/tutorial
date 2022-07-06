package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World");
        System.out.println("hello java");

        // adding 3 numbers
        int a = 10;
        int b = 22;
        float c = (float) a + b;
        System.out.println(c);

        // Control statements
        // If statements
        // check whether given age is greater than 18
        int age = 10;
        if (age > 17) {
            System.out.println("legal age to vote");
        } else {
            System.out.println("Need to wait until age of 18 to vote");
        }
        // Verifying the nested if
        if (age < 18) {
            System.out.println("Need to wait until you became 18 years old");
        } else if (age == 18) {
            System.out.println("Get Ready and start your application to get your voter ID");
        } else {
            System.out.println("Bring your voter ID during election day");
        }
        // Verify the switch statement
        String day = "FRI";
        switch (day) {
            case "MON": {
                System.out.println(" Today is Monday");
                break;
            }
            case "TUE": {
                System.out.println("Today is Tuesday");
                break;
            }
            case "WED": {
                System.out.println("Today is Wednesday");
                break;
            }
            case "THRUS": {
                System.out.println("Today is Thrusday");
                break;
            }
            default: {
                System.out.println(" Great work; Agenda is met");
            }
        }
        // Use the for loop to print the values in the string list
        String names[] = {"mon", "tues", "Wed"};
        for (String name : names) {
            System.out.println(name);
        }
        // Print the star using for loop
        int n = 4;
        for (int i = 0; i < 4; i++) {
            for (int j = n; j > 0; j--) {
                System.out.print("*");
            }
            n--;
            System.out.println("");
        }
        // print the above star in upside down
        int m = 4;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        // Print the fibbonaci series 0	1	1	2	3	5	8	13
        int num_of_fibbonaci_series = 6;
        System.out.println(print_fibbonaci_series(num_of_fibbonaci_series));
    }
    public static int print_fibbonaci_series(int n){
            switch (n) {
                case 0: {
                    return 0;
                }
                case 1: {
                    return 1;
                }
                default: {
                    return print_fibbonaci_series(n - 1) + print_fibbonaci_series(n - 2);
                }
            }


        }
}

