package ss17_IO_BinaryFile_Serialization.MannageProductByFiles.Controller.Service;

import ss12_JavaCollectionFramework.BT.Arraylist.model.Product;
import ss17_IO_BinaryFile_Serialization.MannageProductByFiles.Controller.Repository.ProductInterface;
import ss17_IO_BinaryFile_Serialization.MannageProductByFiles.Controller.Repository.ProductRepository;

import java.util.Scanner;

public class ProductService implements IProductService{
    private static ProductInterface productreponsitory = new ProductRepository();

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println(" nhập nhà sản xuất ");
        String brand = scanner.nextLine();
        System.out.println("nhập giá tiền sản phẩm ");
        double money = Integer.parseInt(scanner.nextLine());
        System.out.println(" nhâp mô tả sản phẩm  ");
        String describe = scanner.nextLine();
        Product product = new Product(id, name, brand, money ,describe);
        productreponsitory.addProduct(product);
    }

    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id sản phẩm cần sửa đổi ");
        int editid = Integer.parseInt(scanner.nextLine());
        productreponsitory.editProductById(editid);
    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {

    }
}
