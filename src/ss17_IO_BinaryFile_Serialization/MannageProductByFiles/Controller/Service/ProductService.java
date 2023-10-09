package ss17_IO_BinaryFile_Serialization.MannageProductByFiles.Controller.Service;


import ss17_IO_BinaryFile_Serialization.MannageProductByFiles.Controller.Repository.ProductInterface;
import ss17_IO_BinaryFile_Serialization.MannageProductByFiles.Controller.Repository.ProductRepository;
import ss17_IO_BinaryFile_Serialization.MannageProductByFiles.Model.Product;


import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static ProductInterface productreponsitory = new ProductRepository();


    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println(" nhâpj nhãn hiệu sản phẩm ");
        String brand = scanner.nextLine();
        System.out.println("nhập giá tiền sản phẩm ");
        double money = scanner.nextDouble();
        System.out.println(" nhập mô tả sản phẩm ");
        String describe = scanner.nextLine();
        Product product = new Product(id,name,brand,money,describe);
        productreponsitory.addProduct(product);
    }

    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id sản phẩm cần sửa đổi ");
        int editById = Integer.parseInt(scanner.nextLine());
        Product editProduct = productreponsitory.editProductById(editById);
        if ( editProduct != null ){
            System.out.println("nhập lại tên ");
            String newName = scanner.nextLine();
            editProduct.setName(newName);
            productreponsitory.edit(editById,editProduct);
        }else{
            System.out.println(" Id không tìm thấy ");
        }
    }
    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id sản phẩm cần xóa ");
        int deleteById = Integer.parseInt(scanner.nextLine());
        productreponsitory.deleteProductById(deleteById);
    }
    @Override
    public void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập vào tên sản phẩm cần tìm kiếm");
        String searchname = scanner.nextLine();
        productreponsitory.searchProductByName(searchname);
    }
    @Override
    public void display() {
        List<Product> product = productreponsitory.getListProduct();
        for ( int i = 0 ; i < product.size();i++){
            if ( product != null){
                System.out.println((1 + i) +"," + product.get(i) +" \n "  ) ;
            }
        }
    }
}