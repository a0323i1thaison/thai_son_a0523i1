package ss8_mvc.repository;

import ss8_mvc.model.Phone;

import java.util.ArrayList;

public interface IPhoneRepository {
    void addPhone(Phone phone);
    void deletePhoneById(int id);
    void searchPhoneByName(String name);
    void editPhoneById(int id);
    ArrayList<Phone> getListPhone();
}
