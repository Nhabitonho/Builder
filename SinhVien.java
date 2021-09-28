public class SinhVien {
    private String tenSV;
    private String gioitinhSV;
    private String diemSV;
    private String lopSV;

    public SinhVien (String tenSV, String gioitinhSV,String diemSV,String lopSV){
        super();
        this.tenSV = tenSV;
        this.gioitinhSV = gioitinhSV;
        this.diemSV = diemSV;
        this.lopSV = lopSV;
    }
    public String toString(){
        return "SinhVien [ Ten SV : " + tenSV + " , Gioi Tinh : " + gioitinhSV
        + " , Diem : " + diemSV + " , Lop : " + lopSV;
    }
    public String getTenSV(){
        return tenSV;
    }
    public String getGioitinhSV(){
        return gioitinhSV;
    }
    public String getDiemSV(){
        return diemSV;
    }
    public String getLopSV(){
        return lopSV;
    }


}
