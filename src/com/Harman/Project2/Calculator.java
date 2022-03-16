package com.Harman.Project2;

public class Calculator {
    void add(){
        int a,b,c;
        b=5;
        c=3;
        a=b+c;
        System.out.println("add:"+a);
    }
}
class Subtraction extends Calculator {
    void sub() {
        int a, b, c;
        a = 5;
        b = 4;
        c = a - b;
        System.out.println(c);
    }
        public static void main (String[]args){
            Subtraction obj = new Subtraction();
            obj.add();
            obj.sub();
        }
}


