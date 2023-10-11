package case_Study.model.furama_dn;

import case_Study.model.furama_dn.Furama;

public class Villa extends Furama {
    private String tChuanPhong;
    private double dtTichPhong;
    private int soPhong;

    public Villa() {
    }

    public Villa(int maDichVu, String tenDichVu, double dtSuDung, double chiPhiThue, int slNguoi, String loaiThue, String tChuanPhong, double dtTichPhong, int soPhong) {
        super(maDichVu, tenDichVu, dtSuDung, chiPhiThue, slNguoi, loaiThue);
        this.tChuanPhong = tChuanPhong;
        this.dtTichPhong = dtTichPhong;
        this.soPhong = soPhong;
    }

    public String gettChuanPhong() {
        return tChuanPhong;
    }

    public void settChuanPhong(String tChuanPhong) {
        this.tChuanPhong = tChuanPhong;
    }

    public double getDtTichPhong() {
        return dtTichPhong;
    }

    public void setDtTichPhong(double dtTichPhong) {
        this.dtTichPhong = dtTichPhong;
    }

    public int getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(int soPhong) {
        this.soPhong = soPhong;
    }

    @Override
    public String toString() {
        return "Villa : " +
                ", Tiêu Chuẩn Phòng :" + tChuanPhong + '\'' +
                ", Diện Tích Phòng :" + dtTichPhong +
                ", Số Phòng :" + soPhong ;
    }
}
