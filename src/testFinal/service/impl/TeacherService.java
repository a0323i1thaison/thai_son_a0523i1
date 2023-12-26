package testFinal.service.impl;

import testFinal.model.Teacher;
import testFinal.reponsitory.ITeacherReponsitory;
import testFinal.reponsitory.impl.TeacherReponsitory;
import testFinal.service.ITeacherService;

import java.util.List;

public class TeacherService implements ITeacherService {
         private ITeacherReponsitory teacherReponsitory = new TeacherReponsitory();

    @Override
    public List<Teacher> display() {
        return teacherReponsitory.display();
    }

    @Override
    public List<Teacher> searchByName(String searchName) {
        return teacherReponsitory.searchByName(searchName);
    }

    @Override
    public void add(Teacher teacher) {
        teacherReponsitory.add(teacher);
    }
    @Override
    public void delete(String id) {
        teacherReponsitory.delete(id);
    }

    @Override
    public void edit(Teacher teacher) {
        teacherReponsitory.edit(teacher);
    }
}
