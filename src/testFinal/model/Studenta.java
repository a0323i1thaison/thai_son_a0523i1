package testFinal.model;

public class Studenta extends Person{
    private String className ;

    public Studenta() {
    }

    public Studenta(String className) {
        this.className = className;
    }

    public Studenta(String id,String name , String date, String className) {
        super(id,name , date);
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
        return super.toString()+
                "," + className;
    }
    @Override
    public String getInfoToCSV(){
        return super.getInfoToCSV()+","+this.className ;
    }
}
