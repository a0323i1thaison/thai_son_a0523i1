package testFinal.reponsitory;

import testFinal.model.SanPhamNK;

import java.util.List;

public interface ISanPhamNKReponsitory extends IRepository<SanPhamNK> {
    void delete (String id);
    List<SanPhamNK> searchByName(String searchName );
}
