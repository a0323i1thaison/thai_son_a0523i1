package testFinal.reponsitory.impl;

import testFinal.reponsitory.ITeacherReponsitory;
import testFinal.model.Teacher;
import testFinal.until.ReadAndWrite;
import java.util.ArrayList;
import java.util.List;

public class TeacherReponsitory implements ITeacherReponsitory {
    private final String COMMS = ",";
    private final String MANAGE_FILE ="src/testFinal/data/manage.CSV";


    @Override
    public void add(Teacher teacher) {
        List<String> stringList = new ArrayList<>();
        stringList.add(teacher.getInfoToCSV());
        ReadAndWrite.writeListStringToCSV(MANAGE_FILE,stringList,true);
    }

    @Override
    public List<Teacher> display() {
        List<String> stringList = new ArrayList<>();
        stringList= ReadAndWrite.readFileCSV(MANAGE_FILE);
        List<Teacher> TeacherList = new ArrayList<>();
        String[] array = null;
        for (String line: stringList) {
            array = line.split(",");
            Teacher teacher = new Teacher(array[0],array[1],array[2],array[3]);
            TeacherList.add(teacher);
        }
        return TeacherList;
    }

    @Override
    public List<Teacher> searchByName(String searchName) {
        List<Teacher> teacherList = display();
        List<Teacher> searchList = new ArrayList<>();
        for (Teacher tea: teacherList) {
            if (tea.getName().contains(searchName)){
                searchList.add(tea);
            }
        }
        return searchList;
    }



    @Override
    public void edit(Teacher teacher) {
        List<Teacher> teacherList = display();
        for (Teacher tea : teacherList) {
            if (String.valueOf(tea.getId()).equals(String.valueOf(tea.getId()))) {
                tea.setName(teacher.getName());
                tea.setMonDay(teacher.getMonDay());
                tea.setDate(tea.getDate());
            }
        }
        ReadAndWrite.writeListStringToCSV(MANAGE_FILE, convertToString(teacherList),false );
    }


    @Override
    public void delete(String id) {
        List<Teacher> teacherList = display();
        List<String> stringList = new ArrayList<>() ;
        for (int i = 0; i <teacherList.size() ; i++) {
            if (teacherList.get(i).getId().equals(id)){
                stringList.add(teacherList.get(i).getInfoToCSV());
            }
        }
        ReadAndWrite.writeListStringToCSV(MANAGE_FILE,stringList,false);
        if (teacherList.size()!=stringList.size()){
            System.out.println("xoá thành công");
        }else {
            System.out.println("Xoá không thành công");
        }
    }
    public List<String> convertToString(List<Teacher> teacher) {
        List<String> data = new ArrayList<>();
        for (Teacher tea1 : teacher) {
            data.add(tea1.getId() + COMMS
                    + tea1.getName() + COMMS
                    + tea1.getDate() + COMMS
                     + tea1.getMonDay());
        }
        return data;
    }
    }
