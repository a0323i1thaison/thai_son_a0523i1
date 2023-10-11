package case_Study.model.furama_dn;

import case_Study.model.furama_dn.Furama;

public class House extends Furama {
    private String tChuanPhong;
    private int soTang;

    public House() {
    }

    public House(int maDichVu, String tenDichVu, double dtSuDung, double chiPhiThue, int slNguoi, String loaiThue, String tChuanPhong, int soTang) {
        super(maDichVu, tenDichVu, dtSuDung, chiPhiThue, slNguoi, loaiThue);
        this.tChuanPhong = tChuanPhong;
        this.soTang = soTang;
    }

    public String gettChuanPhong() {
        return tChuanPhong;
    }

    public void settChuanPhong(String tChuanPhong) {
        this.tChuanPhong = tChuanPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "House : " +
                ", Tiêu Chuẩn Phòng :" + tChuanPhong + '\'' +
                ",  Số Tầng :" + soTang;
    }
}
