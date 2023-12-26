package testFinal.reponsitory;

import testFinal.model.Teacher;

import java.util.List;

public interface ITeacherReponsitory extends IRepository<Teacher> {
    void delete (String id);
    List<Teacher> searchByName(String searchName );
}
