package ss17_IO_BinaryFile_Serialization.MannageProductByFiles.View;

import ss17_IO_BinaryFile_Serialization.MannageProductByFiles.Controller.Service.IProductService;
import ss17_IO_BinaryFile_Serialization.MannageProductByFiles.Controller.Service.ProductService;


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        IProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng :");
            System.out.println(
                    "\n 1.Add" +
                            "\n 2.Display" +
                            "\n 3.Delete" +
                            "\n 4.Search" +
                            "\n 5.edit" +
                            " \n 6. Exit "
            );
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    productService.add();
                    break;
                case 2:
                   productService.display();
                    break;
                case 3:
                  productService.delete();
                    break;
                case 4 :
                    productService.search();
                    break;
                case 5:
                    productService.edit();
                    break;
                default:
                    flag = false;
            }
        }while (flag);
    }
}
