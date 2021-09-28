public interface ISinhVienBuilder {
    ISinhVienBuilder ten(String tenSV);
    ISinhVienBuilder gioitinh(String gioitinhSV);
    ISinhVienBuilder diem(String diemSV);
    ISinhVienBuilder lop(String lopSV);

    SinhVien build();
}
