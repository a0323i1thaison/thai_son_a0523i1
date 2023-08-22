package ss5_accessmodifi.bt;

public class Student {
    private String name ;
    private String classes;
    public Student(){
        name = " john";
        classes = " C02";
    }
    public void setClasses(String classes){
        this.classes = classes;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name ;
    }
    public String getClasses(){
        return classes;
    }
}
