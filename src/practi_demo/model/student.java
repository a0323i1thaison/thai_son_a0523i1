package practi_demo.model;

public class student extends person {
    private String classroom ;

    public student(String classroom) {
        this.classroom = classroom;
    }

    public student(int id, String name, int age, String sex, String classroom) {
        super(id, name, age, sex);
        this.classroom = classroom;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return    " id  : " + super.getId() +
                " , name : " + super.getName() +
                " , age : "  + super.getAge() +
                " , sex : " + super.getSex() +
                " , classroom : " + classroom ;
    }
}
