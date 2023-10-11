package case_Study.model.furama_person;

public abstract class preson {
    private int id ;
    private String name  ;
    private int age ;
    private String sex;
    private int cmnd;
    private int phoneNumber;
    private String email ;

    public preson() {
    }

    public preson(int id, String name, int age, String sex, int cmnd, int phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.cmnd = cmnd;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "id :" + id +
                ", name :" + name + '\'' +
                ", age :" + age +
                ", sex : " + sex + '\'' +
                ", cmnd :" + cmnd +
                ", phoneNumber :" + phoneNumber +
                ", email :" + email + '\'';
    }
}
