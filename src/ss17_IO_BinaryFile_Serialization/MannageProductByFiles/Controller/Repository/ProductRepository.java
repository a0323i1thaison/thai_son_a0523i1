package ss17_IO_BinaryFile_Serialization.MannageProductByFiles.Controller.Repository;

import ss12_JavaCollectionFramework.BT.Arraylist.model.Product;

import java.util.LinkedList;
import java.util.Scanner;

public class ProductRepository implements ProductInterface{
    public static LinkedList<Product> Productlist = new LinkedList<>();
    static {
        Productlist.add(new Product(1,"samsum","hàn quốc ", 20000000 , " Điện thoại thông minh" ));
    }


    @Override
    public void addProduct(Product product) {
        Productlist.add(product);
    }

    @Override
    public void deleteProductById() {


    }

    @Override
    public void editProductById(int id) {
        Product editproduct = null;
        for (Product product : Productlist) {
            if (product.getId() == id ) {
                editproduct = product;
                break;
            }
        }
        if (editproduct != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập thông tin mới cho sản phẩm có ID " + id + ":");

            System.out.print("Tên sản phẩm: ");
            String newName = scanner.nextLine();
            editproduct.setName(newName);

            System.out.print("Giá sản phẩm: ");
            int newMoney = scanner.nextInt();
            editproduct.setMoney(newMoney);

            System.out.println("Thông tin sản phẩm đã được cập nhật.");
        } else {
            System.out.println(id + ": không hợp lệ ");
        }
    }

    @Override
    public void displayProduct() {

    }
}
