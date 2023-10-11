package ss17_IO_BinaryFile_Serialization.MannageProductByFiles.Model;

public class Product {
    private int id ;
    private String name ;
    private String brand ;
    private int money ;
    private String describe;


    public Product(int id, String name, String brand, int money, String describe) {
        this.id= id ;
        this.name = name ;
        this.brand = brand;
        this.money=money;
        this.describe=describe;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                id +
                ", name = " + name + '\'' +
                ", brand = " + brand + '\'' +
                ", money =  " + money +
                ", describe =  " + describe + '\'';
    }
    public String getToCSV() {
        return id + "," + name + "," + brand + "," + money + "," + describe ;
    }

}
