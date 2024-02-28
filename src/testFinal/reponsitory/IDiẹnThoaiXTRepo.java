package testFinal.reponsitory;

import testFinal.model.SanPhamXK;

import java.util.List;

public interface ISanPhamXKReponsitory extends IRepository<SanPhamXK> {
    void delete (String id);
    List<SanPhamXK> searchByName(String searchName );
}
