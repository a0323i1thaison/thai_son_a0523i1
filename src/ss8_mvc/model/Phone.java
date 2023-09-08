package ss8_mvc.model;

public  class Phone{
    private int id ;
    private String name ;
    private double money ;
    private String describe;

    public Phone() {
    }

    public Phone(int id ,String name, double money , String describe) {
        this.id = id ;
        this.name = name;
        this.money = money;
        this.describe=describe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
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
        return  "ID :" + id + "," +
                " Name :"+ name + ","+
                " Giá Tiền :"+ money + "," +
                " Mô Tả Sản Phẩm :" + describe + " \n " ;
    }
}
