package testFinal.reponsitory;

import testFinal.model.Studenta;
import testFinal.model.Teacher;

import java.util.List;

public interface IStudentReponsitory extends IRepository<Studenta> {
    void delete (String id);
    List<Studenta> searchByName(String searchName );
}
