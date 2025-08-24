public class DummyRun {

    public static void main(String[] args) {

        School sc1=new School();
        sc1.SchoolName ="bal bhavan" ;
        sc1.address="noida";
        sc1.principal="kiran koor";

        Teacher t1=new Teacher();
        t1.name= "anupama";
        t1.subject="maths";

        StudentClass s1=new StudentClass();
        s1.studentName="pavan";
        s1.age=29 ;

        StudentClass s2=new StudentClass();
        s2.studentName="kumar";
        s2.age=30;

        ClassRoom c1=new ClassRoom();
        c1.seatCount=500;
        c1.floorNo=3;
    }
}
