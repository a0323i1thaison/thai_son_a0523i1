package testFinal.service;

import testFinal.model.SanPhamNK;

import java.util.List;

public interface ISanPhamNKService extends IService<SanPhamNK> {
    List<SanPhamNK> searchByName(String searchName);
    void delete(String id );
}
