package case_Study.model.furama_dn;

public abstract class Furama {
    private int maDichVu ;
    private String tenDichVu ;
    private double dtSuDung;
    private double chiPhiThue ;
    private int slNguoi;
    private String loaiThue;

    public Furama() {
    }

    public int getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(int maDichVu) {
        this.maDichVu = maDichVu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public double getDtSuDung() {
        return dtSuDung;
    }

    public void setDtSuDung(double dtSuDung) {
        this.dtSuDung = dtSuDung;
    }

    public double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSlNguoi() {
        return slNguoi;
    }

    public void setSlNguoi(int slNguoi) {
        this.slNguoi = slNguoi;
    }

    public String getLoaiThue() {
        return loaiThue;
    }

    public void setLoaiThue(String loaiThue) {
        this.loaiThue = loaiThue;
    }

    public Furama(int maDichVu, String tenDichVu, double dtSuDung, double chiPhiThue, int slNguoi, String loaiThue) {
        this.maDichVu = maDichVu;
        this.tenDichVu = tenDichVu;
        this.dtSuDung = dtSuDung;
        this.chiPhiThue = chiPhiThue;
        this.slNguoi = slNguoi;
        this.loaiThue = loaiThue;
    }

    @Override
    public String toString() {
        return
                "Mã Dịch Vụ :" + maDichVu +
                "; Tên Dịch Vụ :" + tenDichVu + '\'' +
                "; Diện Tích Sử Dụng : " + dtSuDung +
                "; Chi Phí Thuê :" + chiPhiThue +
                "; Số Lượng Người :" + slNguoi +
                "; Loại Thuê :" + loaiThue + '\'';
    }
}
