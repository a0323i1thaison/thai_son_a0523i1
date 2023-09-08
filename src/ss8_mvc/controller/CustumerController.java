package ss8_mvc.controller;


import ss8_mvc.service.IPhoneService;

import ss8_mvc.service.impl.PhoneService;


import java.util.Scanner;

public class CustumerController {
    public static void displaymenu(){
        IPhoneService phoneService = new PhoneService();
        Scanner scanner = new Scanner(System.in);
        boolean flag=true;
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
                    phoneService.add();
                    break;
                case 2:
                    phoneService.display();
                    break;
                case 3:
                    phoneService.delete();
                    break;
                case 4 :
                    phoneService.search();
                    break;
                case 5:
                    phoneService.edit();
                    break;
                default:
                    flag = false;
            }
        }while (flag);
    }
}
