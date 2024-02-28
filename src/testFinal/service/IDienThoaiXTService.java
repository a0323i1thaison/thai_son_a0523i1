package testFinal.service;

import testFinal.model.SanPhamXK;

import java.util.List;

public interface ISanPhamXKService extends IService<SanPhamXK> {
    List<SanPhamXK> searchByName(String searchName);
    void delete(String id );
}
