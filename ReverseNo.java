package com.basicjava;
import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        System.out.print("Enter No : ");
        Scanner ab = new Scanner(System.in);
        int number = ab.nextInt();
        int aa = 0;
        while(number != 0){
            int rem = number%10;
            aa = aa*10+rem;
            number = number/10;
        }
        System.out.println("Reverse No :" + aa);
    }
}