package testFinal.service.impl;

import testFinal.model.Studenta;
import testFinal.reponsitory.IRepository;
import testFinal.reponsitory.IStudentReponsitory;
import testFinal.reponsitory.impl.StudentReponsitory;
import testFinal.service.IStudentService;

import java.util.List;

public class StudentService implements IStudentService {
    private IStudentReponsitory studentReponsitory = new StudentReponsitory();


    @Override
    public List<Studenta> display() {

        return studentReponsitory.display();
    }

    @Override
    public List<Studenta> searchByName(String searchName) {
        return studentReponsitory.searchByName(searchName);
    }

    @Override
    public void add(Studenta studenta){
        studentReponsitory.add(studenta);
    }

    @Override
    public void delete(String id) {
        studentReponsitory.delete(id);
    }

    @Override
    public void edit(Studenta studenta) {
        studentReponsitory.edit(studenta);
    }
}
