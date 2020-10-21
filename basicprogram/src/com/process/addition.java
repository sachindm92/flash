package com.process;

import java.util.Scanner;
public class addition {

    int sum(int a, int b) {
        return (a + b);
    }

    public static void main(String args[]) {

        int a, b, s;

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first numbers:");
        a = sc.nextInt();
        System.out.print("Enter second numbers:");
        b = sc.nextInt();

        addition dd = new addition();
        s = dd.sum(a, b);

        System.out.println("Sum is:" + s);
    }
}
