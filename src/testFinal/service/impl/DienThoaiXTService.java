package testFinal.service.impl;

import testFinal.model.SanPhamXK;
import testFinal.reponsitory.ISanPhamXKReponsitory;
import testFinal.reponsitory.impl.SanPhamXKReponsitory;
import testFinal.service.ISanPhamXKService;

import java.util.List;

public class SanPhamXKService implements ISanPhamXKService {
         private ISanPhamXKReponsitory XKReponsitory = new SanPhamXKReponsitory();

    @Override
    public List<SanPhamXK> display() {
        return XKReponsitory.display();
    }

    @Override
    public List<SanPhamXK> searchByName(String searchName) {
        return XKReponsitory.searchByName(searchName);
    }

    @Override
    public void add(SanPhamXK teacher) {
        XKReponsitory.add(teacher);
    }
    @Override
    public void delete(String id) {
        XKReponsitory.delete(id);
    }
}
