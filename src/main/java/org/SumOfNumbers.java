package org;

public class SumOfNumbers {

    public static void main(String[] args) {

        int number=123456789;



        int sum=0;

        while(number!=0){
            int remainder=number%10;

            sum=sum+remainder;
            number=number/10;
        }
        System.out.println(sum);


    }



}
