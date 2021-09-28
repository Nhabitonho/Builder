public class SinhVienBuilder implements ISinhVienBuilder {
    private String tenSV;
    private String gioitinhSV;
    private String diemSV;
    private String lopSV;
    @Override
    public ISinhVienBuilder ten(String tenSV) {
        this.tenSV = tenSV;
        return this;
    }
    @Override
    public ISinhVienBuilder gioitinh(String gioitinhSV) {
        this.gioitinhSV = gioitinhSV;
        return this;
    }
    @Override
    public ISinhVienBuilder diem(String diemSV) {
        this.diemSV = diemSV;
        return this;
    }
    @Override
    public ISinhVienBuilder lop(String lopSV) {
        this.lopSV = lopSV;
        return this;

    }
    @Override
    public SinhVien build() {
    // TODO Auto-generated method stub
        return new SinhVien(tenSV, gioitinhSV, diemSV, lopSV);
    }
    
}
