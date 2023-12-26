package testFinal.service;

import testFinal.model.Studenta;
import testFinal.model.Teacher;

import java.util.List;

public interface ITeacherService extends IService<Teacher> {
    List<Teacher> searchByName(String searchName);
    void delete(String id );
}
