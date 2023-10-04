package ss8_mvc.service.impl;

import ss8_mvc.model.Phone;
import ss8_mvc.repository.IPhoneRepository;
import ss8_mvc.repository.impl.PhoneRepository;
import ss8_mvc.service.IPhoneService;
import java.util.List;
import java.util.Scanner;

public class PhoneService implements IPhoneService {
    private static IPhoneRepository phoneRepository = new PhoneRepository();
    @Override
    public void display() {
        List<Phone> phones = phoneRepository.getListPhone();
        for ( int i = 0 ; i < phones.size();i++){
            if ( phones != null){
                System.out.println((1 + i) +"," + phones.get(i) +" \n "  ) ;
            }
        }
    }
    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập giá tiền sản phẩm ");
        int money = Integer.parseInt(scanner.nextLine());
        System.out.println(" nhập mô tả sản phẩm ");
        String describe = scanner.nextLine();
        Phone phone = new Phone(id, name, money,describe );
        phoneRepository.addPhone(phone);
    }

    @Override
    public void delete() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhập id sản phẩm cần xoá");
            int deleteId = Integer.parseInt(scanner.nextLine());
            phoneRepository.deletePhoneById(deleteId);
    }
    @Override
    public void search(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập vào tên sản phẩm cần tìm kiếm");
        String searchname = scanner.nextLine();
        phoneRepository.searchPhoneByName(searchname);
    }
    @Override
    public void edit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id sản phẩm cần sửa đổi ");
        int editid = Integer.parseInt(scanner.nextLine());
        phoneRepository.editPhoneById(editid);
    }
}
