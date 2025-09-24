public class Teacher extends School{

    String name;
    String subject;

    public Teacher(String name) {
        super("vivekanandha");
    }

//    public Teacher(){
//        System.out.println("im from Teacher constructor");
   // }

    public void teach(){

        System.out.println("My name is" + name + "i teach" +subject);
    }
}
