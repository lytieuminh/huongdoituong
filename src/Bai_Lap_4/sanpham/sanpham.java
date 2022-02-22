package Bai_Lap_4.sanpham;

import java.util.ArrayList;
import java.util.Scanner;

public class sanpham {
    String name;
    Double Price;
    Double discount;
    ArrayList <sanpham> list = new ArrayList<sanpham>();
    Scanner scanner = new Scanner(System.in);

    public sanpham( String name , Double Price , Double discount ){
        this.name = name;
        this.Price = Price;
        this.discount = discount;
    }
    public sanpham(){

    }
    private double Tien_Thue_Nhap_Khau(){
        return Price * 0.1;
    }

    public void xuat(){
        System.out.println("============= DANH SACH SAN PHAM =============");
        System.out.println("ten san pham: " + name);
        System.out.println("gia san pham: " + Price);
        System.out.println("tien giam gia: " + discount);
        System.out.println("tien thue: " + Tien_Thue_Nhap_Khau());
    }

    public void nhap() {
        System.out.println("================ NHAP THONG TIN SAN PHAM =================");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten san pham: ");
        this.name = scanner.nextLine();
        System.out.println("nhap gia san pham: ");
        this.Price = scanner.nextDouble();
        System.out.println("nhap tien giam gia: ");
        this.discount = scanner.nextDouble();
    }

    public void nhap_danh_sach_san_pham(){
        System.out.println("nhap so luong san pham co trong danh sach: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            sanpham sanpham = new sanpham(name,Price,discount);
            sanpham.nhap();
            list.add(sanpham);
            
        }
    }
    public void xuat_danh_sach_san_pham(){
        for (sanpham sanpham : list) {
            sanpham.xuat();
        }
    }
}