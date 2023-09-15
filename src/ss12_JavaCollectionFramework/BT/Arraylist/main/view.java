package ss12_JavaCollectionFramework.BT.Arraylist.main;

import ss12_JavaCollectionFramework.BT.Arraylist.controller.ProductService;

import java.util.Scanner;

public class view {
    public static void displaymenu (){
        ProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);
        boolean flag=true;
        do {
            System.out.println("Chọn chức năng :");
            System.out.println(
                    "\n 1. Add" +
                            "\n 2. Edit " +
                            "\n 3. Delete " +
                            "\n 4. Display " +
                            "\n 5. Sreach " +
                            "\n 6. Arrange " +
                            " \n 7. Exit "
            );
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    productService.add();
                    break;
                case 2:
                    productService.edit();
                    break;
                case 3:
                    productService.delete();
                    break;
                case 4 :
                    productService.display();
                    break;
                case 5:
                    productService.search();
                    break;
                case 6:
                    productService.arrange();
                    break;
                default:
                    flag = false;
            }
        }while (flag);
    }

    public static void main(String[] args) {
        view.displaymenu();
    }

}
