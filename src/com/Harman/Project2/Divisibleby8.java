package com.Harman.Project2;

import java.util.Scanner;

public class Divisibleby8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        Integer a =sc.nextInt();
        if(a%8==0){
            System.out.println("The given number is divisible by 8");
        }
        else{
            System.out.println("The given number is not divisible by 8");
        }
    }
}
