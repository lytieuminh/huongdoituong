package Bai_Lap_4.sanpham;

public class sanphamtestdrive {
    public static void main(String[] args) {
    /* Dữ liệu mồi
        sanpham sanpham1 = new sanpham("tivi " , 200.5 , 44.5);
        sanpham sanpham2 = new sanpham("tu lanh " , 250.5 , 42.5);
        sanpham sanpham3 = new sanpham("may vi tinh " , 2760.3 , 420.2);
        sanpham sanpham4 = new sanpham("loa " , 204.5 , 40.5);
        sanpham sanpham5 = new sanpham("lo vi song " , 25222.5 , 320.5);
        sanpham sanpham6 = new sanpham("lo nuong " , 202410.5 , 420.5);
        sanpham1.xuat();
        sanpham2.xuat();
        sanpham3.xuat();
        sanpham4.xuat();
        sanpham5.xuat();
        sanpham6.xuat(); */
    // du lieu nhap    
        sanpham sanpham = new sanpham();
        sanpham.nhap_danh_sach_san_pham();
        sanpham.xuat_danh_sach_san_pham(); 
    }
}