package testFinal.reponsitory.impl;



import testFinal.reponsitory.IStudentReponsitory;
import testFinal.model.Studenta;
import testFinal.until.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class StudentReponsitory implements IStudentReponsitory{
    private  final String COMMS = ",";
    private  final String MANAGE_FILE ="src/testFinal/data/manage.CSV";

    @Override
    public void add(Studenta studenta) {
        List<String> stringList = new ArrayList<>();
        stringList.add(studenta.getInfoToCSV());
        ReadAndWrite.writeListStringToCSV(MANAGE_FILE,stringList,true);
    }

    @Override
    public List<Studenta> display() {
        List<String> stringList = new ArrayList<>();
        stringList= ReadAndWrite.readFileCSV(MANAGE_FILE);
        List<Studenta> StudentList = new ArrayList<>();
        String[] array = null;
        for (String line: stringList) {
            array = line.split(",");
            Studenta student = new Studenta(array[0],array[1],array[2],array[3]);
            StudentList.add(student);
        }
        return StudentList;
    }

    @Override
    public List<Studenta> searchByName(String searchName) {
        List<Studenta> studentList = display();
        List<Studenta> searchList = new ArrayList<>();
        for (Studenta stu: studentList) {
            if (stu.getName().contains(searchName)){
                searchList.add(stu);
            }
        }
        return searchList;
    }

    @Override
    public void edit(Studenta studenta) {
        List<Studenta> studentList = display();
        for (Studenta stu : studentList) {
            if (String.valueOf(stu.getId()).equals(String.valueOf(studenta.getId()))) {
                stu.setName(studenta.getName());
                stu.setClassName(studenta.getClassName());
                stu.setDate(studenta.getDate());

            }
        }
        ReadAndWrite.writeListStringToCSV(MANAGE_FILE, convertToString(studentList),false);
    }

    @Override
    public void delete(String id) {
        List<Studenta> studentList = display();
        List<String> stringList = new ArrayList<>() ;
        for (int i = 0; i <studentList.size() ; i++) {
            if (studentList.get(i).getId()!=id){
                stringList.add(studentList.get(i).getInfoToCSV());
            }
        }
        ReadAndWrite.writeListStringToCSV(MANAGE_FILE,stringList,false);
        if (studentList.size()!=stringList.size()){
            System.out.println("xoá thành công");
        }else {
            System.out.println("Xoá không thành công");
        }

    }
    public List<String> convertToString(List<Studenta> studenta) {
        List<String> data = new ArrayList<>();
        for (Studenta stu1 : studenta) {
            data.add(stu1.getId() + COMMS
                    + stu1.getName() + COMMS + stu1.getClassName() + COMMS
                    + stu1.getDate());
        }
        return data;
    }
}
