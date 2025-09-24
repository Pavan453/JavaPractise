package org;



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountNoChars {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string");
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        Map<Character, Integer> m=new HashMap<>();

        for(Character s:ch) {
            if(m.containsKey(s)) {


                m.put(s,m.get(s)+1);
        }
            else {
                m.put(s,1);
            }




        }
        System.out.println(m);

        for(Character c:m.keySet()){

            if(m.get(c)>1){

                System.out.println();
            }


        }


    }
}
