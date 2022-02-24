package Buoi_5.Bai_Tap_Ve_Nha.Bai_LAB_4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class San_Pham {
    private String name;
    private double Price;
    private double discount;
    List<San_Pham> danhsachsanpham = new ArrayList<San_Pham>();
    Scanner scanner = new Scanner(System.in);

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return Price;
    }

    public void setPrice(double price){
        this.Price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount){
        this.discount = discount;
    }

    public San_Pham(){

    }

    public San_Pham(String name, double price, double discount){
        this.name = name;
        this.Price = price;
        this.discount = discount;
    }

    public San_Pham(String name, double price){
        this.name = name;
        this.Price = price;
        this.discount = 0;
    }

    private double Tien_Tra_San_Pham(){
        return Price - discount + Tien_Thue_Nhap_Khau() ;
    }
    
    private double Tien_Thue_Nhap_Khau(){
        return Price *10/100;
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
    
    public void xuat(){
        System.out.println("============= DANH SACH SAN PHAM =============");
        System.out.println("ten san pham: " + name);
        System.out.println("gia san pham: " + Price);
        System.out.println("tien giam gia: " + discount);
        System.out.println("tien thue: " + Tien_Thue_Nhap_Khau());
        System.out.println("so tien phai tra : " + Tien_Tra_San_Pham());
    }
}

