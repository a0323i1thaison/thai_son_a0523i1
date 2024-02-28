package testFinal.model;

public class SanPhamNK extends DienThoai {
    private String giaNK ;
    private String tinhNK ;
    private String thueNK ;

    public SanPhamNK() {
    }

    public SanPhamNK(String id, String maSP, String tenSP, String gia, String soLuong, String nsx, String giaNK, String tinhNK, String thueNK) {
        super(id, maSP, tenSP, gia, soLuong, nsx);
        this.giaNK = giaNK;
        this.tinhNK = tinhNK;
        this.thueNK = thueNK;
    }

    public String getGiaNK() {
        return giaNK;
    }

    public void setGiaNK(String giaNK) {
        this.giaNK = giaNK;
    }

    public String getTinhNK() {
        return tinhNK;
    }

    public void setTinhNK(String tinhNK) {
        this.tinhNK = tinhNK;
    }

    public String getThueNK() {
        return thueNK;
    }

    public void setThueNK(String thueNK) {
        this.thueNK = thueNK;
    }

    @Override
    public String toString() {
        return
                "," + giaNK + '\'' +
                "," + tinhNK + '\'' +
                "," + thueNK + '\'' ;
    }

    @Override
    public String getInfoToCSV(){
        return super.getInfoToCSV()+","+this.giaNK+","+this.tinhNK +","+ this.thueNK ;
    }
}
