package ss8_mvc.repository.impl;

import ss8_mvc.model.Phone;
import ss8_mvc.repository.IPhoneRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneRepository implements IPhoneRepository {
    private static ArrayList<Phone> phoneArrayList = new ArrayList<>();

    static {
        phoneArrayList.add(new Phone(1, "samsum", 12000000, "sản phẩm sản xuất hàn quốc "));
        phoneArrayList.add(new Phone(2, "iphone", 20000000, "sản phẩm sản xuất tại mỹ"));
        phoneArrayList.add(new Phone(3, "nokia", 7000000, " sản phẩm sản xuất tại nhật bản "));
    }
    @Override
    public ArrayList<Phone> getListPhone() {
        return phoneArrayList;
        }

    @Override
    public void addPhone(Phone phone) {
        phoneArrayList.add(phone);
    }

    @Override
    public void deletePhoneById(int id) {
        Phone deletephone = null;
        for (Phone phone : phoneArrayList) {
            if (phone.getId() == id) {
                deletephone = phone;
                break;
            }
        }
        if ( deletephone!=null){
            phoneArrayList.remove(deletephone);
            System.out.println("đã xóa sản phẩm có ID " + id);
        }else{
            System.out.println(id+": không hợp lệ ");
        }
    }

    @Override
    public void searchPhoneByName(String name) {
        boolean found = false;
        for (Phone phone : phoneArrayList) {
            if (phone.getName().equals(name)) {
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
    public void editPhoneById(int id) {
        Phone editphone = null;
        for (Phone phone : phoneArrayList) {
            if (phone.getId() == id) {
                editphone = phone;
                break;
            }
        }
        if ( editphone!=null){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập thông tin mới cho sản phẩm có ID " + id + ":");

            System.out.print("Tên sản phẩm: ");
            String newName = scanner.nextLine();
            editphone.setName(newName);

            System.out.print("Giá sản phẩm: ");
            int newMoney = scanner.nextInt();
            editphone.setMoney(newMoney);

            System.out.print("Mô Tả sản phẩm: ");
            String newDescribe = scanner.nextLine();
            editphone.setDescribe(newDescribe);

            System.out.println("Thông tin sản phẩm đã được cập nhật.");
        }else{
            System.out.println(id+": không hợp lệ ");
        }
    }
}
