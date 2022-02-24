package Buoi_5.Bai_Tap_Ve_Nha.Bai_LAB_4;

public class San_Pham_Test_Drive {
    public static void main(String[] args) {
        // Dữ liệu mồi
            San_Pham sanpham1 = new San_Pham("tivi " , 200.5 , 44.5);
            San_Pham sanpham2 = new San_Pham("tu lanh " , 250.5 , 42.5);
            San_Pham sanpham3 = new San_Pham("may vi tinh " , 2760.3 , 420.2);
            San_Pham sanpham4 = new San_Pham("loa " , 204.5 , 40.5);
            San_Pham sanpham5 = new San_Pham("lo vi song " , 25222.5 , 320.5);
            San_Pham sanpham6 = new San_Pham("lo nuong " , 202410.5 , 420.5);
            sanpham1.xuat();
            sanpham2.xuat();
            sanpham3.xuat();
            sanpham4.xuat();
            sanpham5.xuat();
            sanpham6.xuat(); 
        // du lieu nhap tu ban phim   
            San_Pham sanphamA = new San_Pham();
            sanphamA.nhap();
            sanphamA.xuat();
            San_Pham sanphamB = new San_Pham();
            sanphamB.nhap();
            sanphamB.xuat();
        }
    }