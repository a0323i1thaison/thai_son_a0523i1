package ss8_mvc.repository.impl;

import ss8_mvc.model.Phone;
import ss8_mvc.repository.IPhoneRepository;
import ss8_mvc.util.ReadingWritingFile;

import java.util.ArrayList;
import java.util.List;

public class PhoneRepository implements IPhoneRepository {
    private final String PATH_PHONE = "D:\\codegym\\module2\\module2_a0523i1\\src\\ss8_mvc\\data\\phone.csv";

    @Override
    public List<Phone> getListPhone() {
        List<Phone> phoneList = new ArrayList<>();
        // đọc  file ở đây hoặc kết nối DB
        List<String> stringList = ReadingWritingFile.readCSVFile(PATH_PHONE);
        // chuyển thành list student
        String[] arr ;
        for (String string: stringList) {
            arr = string.split(",");
            Phone phone = new Phone(arr);
            phoneList.add(phone);
        }
        return phoneList;
        }

    @Override
    public void addPhone(Phone phone) {
        List<String> stringList = new ArrayList<>();
        stringList.add(phone.getInfoToCSV());
        ReadingWritingFile.writeToCSV(PATH_PHONE,stringList,true);
    }

    @Override
    public void deletePhoneById(int id) {
        List<Phone> phoneList = getListPhone();
        for (int i = 0 ; i <phoneList.size() ; i++) {
            if (phoneList.get(i).getId()==id){
                phoneList.remove(i);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Phone phone: phoneList) {
            stringList.add(phone.getInfoToCSV());
        }
        ReadingWritingFile.writeToCSV(PATH_PHONE ,stringList,false);

    }

    @Override
    public List<Phone> searchPhoneByName(String name) {
        List<Phone> phoneList = getListPhone();
        List<Phone> searchList = new ArrayList<>();
        for (int i = 0; i < phoneList.size(); i++) {
            if (phoneList.get(i).getName().contains(name)){
                searchList.add(phoneList.get(i));
            }
        }
        return searchList;
    }
    @Override
    public void editPhoneById(int id) {

    }
}
