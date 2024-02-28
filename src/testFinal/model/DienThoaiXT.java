package testFinal.model;

public class SanPhamXK extends DienThoai {
    private String giaXK;
    private String quocGia;

    public SanPhamXK() {
    }

    public SanPhamXK(String id, String maSP, String tenSP, String gia, String soLuong, String nsx, String giaXK, String quocGia) {
        super(id, maSP, tenSP, gia, soLuong, nsx);
        this.giaXK = giaXK;
        this.quocGia = quocGia;
    }

    public String getGiaXK() {
        return giaXK;
    }

    public void setGiaXK(String giaXK) {
        this.giaXK = giaXK;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    @Override
    public String toString() {
        return
               ","+ giaXK + '\'' +
                ",'" + quocGia + '\'' +
                '}';
    }
    @Override
    public String getInfoToCSV(){
        return super.getInfoToCSV()+","+this.giaXK+","+this.quocGia ;
    }
}
