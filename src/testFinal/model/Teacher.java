package testFinal.model;

public class Teacher extends Person{
    private String monDay;

    public Teacher() {
    }

    public Teacher(String monDay) {
        this.monDay = monDay;
    }

    public Teacher(String id, String name, String date, String monDay) {
        super(id,name, date);
        this.monDay = monDay;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "," + monDay;
    }
    @Override
    public String getInfoToCSV(){
        return super.getInfoToCSV()+","+this.monDay ;
    }
}
