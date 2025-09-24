package org;

import java.util.Scanner;

public class JavaPrograms {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        int number = sc.nextInt();

        int sum=0;
        int i=1;
        while(i<= number){
            if(i%2==0) {
                sum = sum + i;
                System.out.println(sum);
            }
                i=i+1;



        }

        System.out.println(sum);
    }

}