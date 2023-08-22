package ss5_accessmodifi.bt;


public class TestStudent {
    public static void main(String[]args){
        Student student = new Student();
        student.setName("Alice");
        student.setClasses("C01");
        System.out.println("Name: " + student.getName());
        System.out.println("Classes: " + student.getClasses());
    }
}
