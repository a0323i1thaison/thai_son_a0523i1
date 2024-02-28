package testFinal.controller;

import testFinal.model.SanPhamXK;
import testFinal.service.ISanPhamXKService;
import testFinal.service.impl.SanPhamXKService;

import java.util.List;

public class SanPhamXKController {
    private ISanPhamXKService XKService = new SanPhamXKService();
    public List<SanPhamXK> display() {
        return XKService.display();
    }

    public List<SanPhamXK> searchByName(String searchName) {
        return XKService.searchByName(searchName);
    }

    public void add(SanPhamXK teacher) {
        XKService.add(teacher);
    }
    public void delete(String id) {
        XKService.delete(id);
    }
}
