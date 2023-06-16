package com.basicjava;
import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        System.out.print("Enter no : ");
        int result = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 2; i < num; i++) {
            if (num %i==0){
                result=result+1;
            }
        }
        if(result<2){
            System.out.println("Prime number");
        }
        else{
            System.out.println("NOT Prime number");
        }
    }
}
