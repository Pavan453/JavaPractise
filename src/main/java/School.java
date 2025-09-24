public class School {
    String SchoolName;
    String address;
    String principal;
    int teacherCount;
    int studentCount;

    public School(String SchoolName) {

        System.out.println(SchoolName + "Im from school constructor");
    }

    public void displayResult(){

        System.out.println("every student shuould pass with flying colors");
    }

}
