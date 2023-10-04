package ss8_mvc.model;

public  class Phone{
    private int id ;
    private String name ;
    private int money ;
    private String describe;

    public Phone(String[] arr) {
    }

    public Phone(int id ,String name, int money , String describe) {
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
        return  "ID :" + this.id + "," +
                " Name :"+ this.name + ","+
                " Giá Tiền :"+ this.money + "," +
                " Mô Tả Sản Phẩm :" + this.describe + " \n " ;
    }

    public String getInfoToCSV() {
        return id + "," + name + "," + money + "," +  describe ;
    }
}
