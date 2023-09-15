package ss12_JavaCollectionFramework.BT.Arraylist.model;

public class Product {
    private int id ;
    private String name;
    private int money ;


    public Product() {
    }
    public Product(int id, String name , int money) {
        this.id = id;
        this.name = name ;
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
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

    @Override
    public String toString() {
        return
                "id :" + id + " , " +
                "name :" + name  + " , "+
                "money :" + money + "\n"
                ;
    }
}
