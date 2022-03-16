package com.Harman.Project2;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Integer Lower_range, Upper_range,flag;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Lower range:");
        Lower_range = sc.nextInt();
        System.out.println("Enter the Upper range:");
        Upper_range = sc.nextInt();
        for(int i=Lower_range;i<=Upper_range;i++){
            if(i==1 || i==0)
                continue;
            flag=1;
            for(int j=2;j<=i;j++){
                if(i%j==0){
                    flag=0;
                    break;
                }
            }
            if (flag==1)
                System.out.println(i);

        }
    }
}

