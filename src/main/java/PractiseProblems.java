import java.util.Scanner;

public class PractiseProblems {

        public static void main(String[]  args) {

        PractiseProblems p1=new PractiseProblems();
        p1.age(4,"female");

        }

        public void age(int age, String gender) {

            if ((age>0) && (age<18) ) {

                if(gender=="male") {
                    System.out.println("boy");


                }
                else {
                    System.out.println("girl");
                }
            }

            else if ((age>=18) && (age<60)){
                if(gender=="female"){
                    System.out.println("woman");
                }

                else{
                    System.out.println("man");
                }
            }

            else if (age>=60) {

                    System.out.println("scenior citizen");
                }

            else {

                System.out.println("age should be proper");
            }

            }
        }

