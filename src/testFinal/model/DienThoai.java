package testFinal.model;

public abstract class SanPham {
    private String id  ;
    private String maSP;
    private String tenSP ;
    private String gia ;
    private String soLuong ;
    private String nsx ;

    public SanPham() {
    }

    public SanPham(String id, String maSP, String tenSP, String gia, String soLuong, String nsx) {
        this.id = id;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.soLuong = soLuong;
        this.nsx = nsx;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public String getNsx() {
        return nsx;
    }

    public void setNsx(String nsx) {
        this.nsx = nsx;
    }

    @Override
    public String toString() {
        return
                 id + '\'' +
                "," + maSP + '\'' +
                "," + tenSP + '\'' +
                ",'" + gia + '\'' +
                "," + soLuong + '\'' +
                "," + nsx + '\'' +
                '}';
    }
    public String getInfoToCSV(){
        return this.id+","+this.tenSP+","+this.gia+","+this.soLuong+","+this.nsx ;
    }
}