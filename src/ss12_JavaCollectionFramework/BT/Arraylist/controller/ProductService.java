package ss12_JavaCollectionFramework.BT.Arraylist.controller;

import ss12_JavaCollectionFramework.BT.Arraylist.model.Product;
import java.util.LinkedList;
import java.util.Scanner;

public class ProductService implements IproductService{
    private static ProductRepository productRepository = new ProductRepository();
    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập giá tiền sản phẩm ");
        int money = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, money);
        productRepository.addProduct(product);
    }
    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id sản phẩm cần sửa đổi ");
        int editid = Integer.parseInt(scanner.nextLine());
        productRepository.editProductById(editid);
    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id sản phẩm cần xoá");
        int deleteId = Integer.parseInt(scanner.nextLine());
        productRepository.deleteProductById(deleteId);
    }

    @Override
    public void display() {
        LinkedList<Product> product = productRepository.getListProduct();
        for ( int i = 0 ; i < product.size();i++){
            if ( product != null){
                System.out.println((1 + i) +"," + product +" \n "  ) ;
                break;
            }
        }
    }

    @Override
    public void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập vào tên sản phẩm cần tìm kiếm");
        String searchname = scanner.nextLine();
        productRepository.searchProductByName(searchname);
    }

    @Override
    public void arrange() {
        productRepository.arrangeProductByMoney();
    }
}
