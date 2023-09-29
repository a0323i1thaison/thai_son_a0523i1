package ss8_mvc.repository;

import ss8_mvc.model.Phone;

import java.util.List;

public interface IPhoneRepository {
    List<Phone> getListPhone();
    void addPhone(Phone phone);
    void deletePhoneById(int id);
    List<Phone> searchPhoneByName(String name);
    void editPhoneById(int id);
}
