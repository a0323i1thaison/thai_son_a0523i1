package testFinal.reponsitory.impl;

import testFinal.reponsitory.ISanPhamXKReponsitory;
import testFinal.model.SanPhamXK;
import testFinal.until.ReadAndWrite;

import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class SanPhamXKReponsitory implements ISanPhamXKReponsitory {
    private final String MANAGE_FILE ="src/testFinal/data/manage.CSV";


    @Override
    public void add(SanPhamXK sanphamxk) {
        List<String> stringList = new ArrayList<>();
        stringList.add(sanphamxk.getInfoToCSV());
        ReadAndWrite.writeListStringToCSV(MANAGE_FILE,stringList,true);
    }

    @Override
    public List<SanPhamXK> display() {
        List<String> stringList = new ArrayList<>();
        stringList= ReadAndWrite.readFileCSV(MANAGE_FILE);
        List<SanPhamXK> SanPhamXKList = new ArrayList<>();
        String[] array = null;
        for (String line: stringList) {
            array = line.split(",");
            SanPhamXK teacher = new SanPhamXK(array[0],array[1],array[2],array[3],array[4],array[5],array[6],array[7]);
            SanPhamXKList.add(teacher);
        }
        return SanPhamXKList;
    }

    @Override
    public List<SanPhamXK> searchByName(String searchName) {
        List<SanPhamXK> sanPhamXKList = display();
        List<SanPhamXK> searchList = new ArrayList<>();
        for (SanPhamXK tea: sanPhamXKList) {
            if (tea.getTenSP().contains(searchName)){
                searchList.add(tea);
            }
        }
        return searchList;
    }
    @Override
    public void delete(String id) {
        List<SanPhamXK> teacherList = display();
        List<String> stringList = new ArrayList<>() ;
        for (int i =teacherList.size()-1 ; i >= 0 ; i--) {
            if (teacherList.get(i).getId().equals(id)){
                teacherList.remove(i);
            }
        }
        ReadAndWrite.writeListStringToCSV(MANAGE_FILE,stringList,false);
        if (stringList.isEmpty()){
            System.out.println("xoá thành công");
        }else {
            System.out.println("Xoá không thành công");
        }
    }
    }
