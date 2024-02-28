package testFinal.service.impl;

import testFinal.model.SanPhamNK;
import testFinal.reponsitory.ISanPhamNKReponsitory;
import testFinal.reponsitory.impl.SanPhamNKReponsitory;
import testFinal.service.ISanPhamNKService;

import java.util.List;

public class SanPhamNKService implements ISanPhamNKService {
    private ISanPhamNKReponsitory NKReponsitory = new SanPhamNKReponsitory();


    @Override
    public List<SanPhamNK> display() {

        return NKReponsitory.display();
    }

    @Override
    public List<SanPhamNK> searchByName(String searchName) {
        return NKReponsitory.searchByName(searchName);
    }

    @Override
    public void add(SanPhamNK studenta){
        NKReponsitory.add(studenta);
    }

    @Override
    public void delete(String id) {
        NKReponsitory.delete(id);
    }
}
