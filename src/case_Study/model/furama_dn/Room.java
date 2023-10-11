package case_Study.model.furama_dn;

import case_Study.model.furama_dn.Furama;

public class Room extends Furama {
    private String dichVuMP;

    public Room() {
    }

    public Room(String dichVuMP) {
        this.dichVuMP = dichVuMP;
    }

    public Room(int maDichVu, String tenDichVu, double dtSuDung, double chiPhiThue, int slNguoi, String loaiThue, String dichVuMP) {
        super(maDichVu, tenDichVu, dtSuDung, chiPhiThue, slNguoi, loaiThue);
        this.dichVuMP = dichVuMP;
    }

    public String getDichVuMP() {
        return dichVuMP;
    }

    public void setDichVuMP(String dichVuMP) {
        this.dichVuMP = dichVuMP;
    }

    @Override
    public String toString() {
        return "Room : " +
                " , Dịch Vụ Miễn Phí '" + dichVuMP + '\'';
    }
}
