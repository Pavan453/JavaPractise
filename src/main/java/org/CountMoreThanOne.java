package org;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountMoreThanOne {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Map<Character,Integer> m=new HashMap<>();
        char[] c=s.toCharArray();

        for(Character ch:c){

            if (m.containsKey(ch)){

                m.put(ch,m.get(ch)+1);
            }

            else{
                m.put(ch,1);
            }


        }
        System.out.println(m);
        for(Character i:m.keySet()){

            if(m.get(i)>1){
                System.out.println(i);
            }
        }




    }
}
