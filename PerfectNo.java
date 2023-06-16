package com.basicjava;
import java.util.Scanner;
public class PerfectNo {
    public static void main(String[] args) {
        int result = 0;
        System.out.print("Enter no : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i < num; i++) {
            if (num %i==0){
                result=i+result;
            }
        }
        if(result==num){
            System.out.println("perfect number");
        }
        else{
            System.out.println("not perfect number");
        }
    }
}
