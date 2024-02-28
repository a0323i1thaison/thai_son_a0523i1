package testFinal.reponsitory.impl;



import testFinal.reponsitory.ISanPhamNKReponsitory;
import testFinal.model.SanPhamNK;
import testFinal.until.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class SanPhamNKReponsitory implements ISanPhamNKReponsitory {
    private  final String MANAGE_FILE ="src/testFinal/data/manage.CSV";

    @Override
    public void add(SanPhamNK sanphamnk) {
        List<String> stringList = new ArrayList<>();
        stringList.add(sanphamnk.getInfoToCSV());
        ReadAndWrite.writeListStringToCSV(MANAGE_FILE,stringList,true);
    }

    @Override
    public List<SanPhamNK> display() {
        List<String> stringList = new ArrayList<>();
        stringList= ReadAndWrite.readFileCSV(MANAGE_FILE);
        List<SanPhamNK> SanPhamNKList = new ArrayList<>();
        String[] array = null;
        for (String line: stringList) {
            array = line.split(",");
            SanPhamNK sanphamnk = new SanPhamNK(array[0],array[1],array[2],array[3],array[4],array[5],array[6],array[7],array[8]);
            SanPhamNKList.add(sanphamnk);
        }
        return SanPhamNKList;
    }

    @Override
    public List<SanPhamNK> searchByName(String searchName) {
        List<SanPhamNK> sanPhamNKList = display();
        List<SanPhamNK> searchList = new ArrayList<>();
        for (SanPhamNK stu: sanPhamNKList) {
            if (stu.getTenSP().contains(searchName)){
                searchList.add(stu);
            }
        }
        return searchList;
    }



    @Override
    public void delete(String id) {
        List<SanPhamNK> studentList = display();
        List<String> stringList = new ArrayList<>() ;
        for (int i = studentList.size()-1; i >=0; i--) {
            if (studentList.get(i).getId().equals(id)){
               studentList.remove(i);
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
