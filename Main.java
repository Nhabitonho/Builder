
public class Main {
    public static void main(String[] args) {
        SinhVien sinhvien = new SinhVienBuilder().ten("Long").gioitinh("Nam").diem("9.0").lop("10A1").build();
        SinhVien sinhvien2 = new SinhVienBuilder().ten("Nhan").gioitinh("Nam").diem("9.0").lop("10A1").build();

        System.out.println(sinhvien);
        System.out.println(sinhvien2);

    }
}
