package testFinal.controller;

import testFinal.model.SanPhamNK;
import testFinal.service.ISanPhamNKService;
import testFinal.service.impl.SanPhamNKService;

import java.util.List;

public class SanPhamNKController1 {
    private ISanPhamNKService NKService = new SanPhamNKService();

    public List<SanPhamNK> display() {
        return NKService.display();
    }

    public List<SanPhamNK> searchByName(String searchName) {
        return NKService.searchByName(searchName);
    }


    public void add(SanPhamNK sanPhamNK){
        NKService.add(sanPhamNK);
    }

    public void delete(String id) {
        NKService.delete(id);
    }
}
