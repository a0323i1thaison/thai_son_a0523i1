package testFinal.model;

public abstract class Person {
    private String name ;
    private String id ;
    private String date ;

    public Person() {
    }

    public Person(String id,String name , String date) {
        this.name = name;
        this.id = id;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return
                name  +
                 ","+id +
                "," + date ;
    }
    public String getInfoToCSV(){
        return this.id+","+this.name+","+this.date ;
    }
}