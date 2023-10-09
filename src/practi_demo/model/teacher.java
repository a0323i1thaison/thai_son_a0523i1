package practi_demo.model;

public class teacher extends person {
    private String className ;


    public teacher() {
    }

    public teacher(int id, String name, int age, String sex, String className) {
        super(id, name, age, sex);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return   " id  : " + super.getId() +
                " name : " + super.getName() +
                " age : " + super.getAge() +
                " sex : " + super.getSex() +
                "className : " + className + '\'';
    }


}
