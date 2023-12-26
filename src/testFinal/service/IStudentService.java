package testFinal.service;

import testFinal.model.Studenta;

import java.util.List;

public interface IStudentService extends IService<Studenta> {
    List<Studenta> searchByName(String searchName);
    void delete(String id );
}
