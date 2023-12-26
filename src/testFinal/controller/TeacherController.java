package testFinal.controller;

import testFinal.model.Studenta;
import testFinal.model.Teacher;
import testFinal.service.ITeacherService;
import testFinal.service.impl.TeacherService;

import java.util.List;

public class TeacherController {
    private ITeacherService teacherService = new TeacherService();
    public List<Teacher> display() {
        return teacherService.display();
    }

    public List<Teacher> searchByName(String searchName) {
        return teacherService.searchByName(searchName);
    }

    public void add(Teacher teacher) {
        teacherService.add(teacher);
    }
    public void delete(String id) {
        teacherService.delete(id);
    }
    public void edit(Teacher teacher) {
        teacherService.edit(teacher);
    }
}
