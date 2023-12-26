package testFinal.controller;

import testFinal.model.Studenta;
import testFinal.service.IStudentService;
import testFinal.service.impl.StudentService;

import java.util.List;

public class StudentController {
    private IStudentService studentService = new StudentService();

    public List<Studenta> display() {
        return studentService.display();
    }

    public List<Studenta> searchByName(String searchName) {
        return studentService.searchByName(searchName);
    }


    public void add(Studenta studenta){
        studentService.add(studenta);
    }


    public void delete(String id) {
        studentService.delete(id);
    }

    public void edit(Studenta studenta) {
        studentService.edit(studenta);
    }
}
