package ss5_acessmodifier.bt;

public class Student {
    private String name = " John" ;
    private String classname= " C02" ;

    public Student() {
    }

    public Student(String name, String classname) {
        this.name = name;
        this.classname = classname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classname='" + classname + '\'' +
                '}';
    }
}
