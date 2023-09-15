package ss12_JavaCollectionFramework.BT.Arraylist.controller;

import ss12_JavaCollectionFramework.BT.Arraylist.model.Product;


import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class ProductRepository implements IproductRepository {
    public static LinkedList<Product> Productlist = new LinkedList<>();

    static {
        Productlist.add(new Product(1, " phone ", 23000000));
        Productlist.add(new Product(2, " laptop ", 20000000));
        Productlist.add(new Product(3, " PC ", 123000000));
    }

    @Override
    public void addProduct(Product product) {
        Productlist.add(product);
    }

    @Override
    public void editProductById(int id) {
        Product editproduct = null;
        for (Product product : Productlist) {
            if (product.getId() == id) {
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
    public void deleteProductById(int id) {
        Product deleteproduct = null;
        for (Product product : Productlist) {
            if (product.getId() == id) {
                deleteproduct = product;
                break;
            }
        }
        if (deleteproduct != null) {
            Productlist.remove(deleteproduct);
            System.out.println("đã xóa sản phẩm có ID " + id);
        } else {
            System.out.println(id + ": không hợp lệ ");
        }
    }

    @Override
    public LinkedList<Product> getListProduct() {
        return Productlist;
    }


    @Override
    public void searchProductByName(String name) {
        boolean found = false;
        for (Product product : Productlist) {
            if (product.getName().equals(name)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Sản phẩm có trong danh sách.");
        } else {
            System.out.println("Sản phẩm không có trong danh sách.");
        }

    }

    @Override
    public void arrangeProductByMoney() {
        Collections.sort(Productlist, Comparator.comparingDouble(Product::getMoney));

        System.out.println("Danh sách sản phẩm tăng dần theo giá:");
        for (Product product : Productlist) {
            System.out.println(product.getName() + " - " + product.getMoney());
        }
    }
}