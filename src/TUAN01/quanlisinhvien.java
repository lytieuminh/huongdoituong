package TUAN01;
import java.util.Scanner;
public class quanlisinhvien {

//data 
    String name;
    int age;
    String sex;
    String clas;
    int mssv;

    Scanner input = new Scanner(System.in);
        // thêm thông tin sinh viên
    void nhapthongtin(){
        System.out.println("Nhap ten sinh vien: ");
        name = input.nextLine();
        System.out.println("Nhap tuoi sinh vien: ");
        age = input.nextInt();
        input.nextLine();
        System.out.println("Nhap gioi tinh sinh vien ( male / female / other ) ");
        sex = input.nextLine();
        System.out.println("Nhap lop sinh vien :");
        clas = input.nextLine();
        System.out.println("Nhap so ma so sinh vien : ");
        mssv = input.nextInt();
        input.nextLine();
    }
        // hiển thị thông tin sinh viên
    void info_sinhvien(){
        System.out.println("Ten khach hang: " + name);
        System.out.println("Tuoi khach hang: " + age);
        System.out.println("Gioi tinh khach hang" + sex);
        System.out.println("Que quan khach hang" + clas);
        System.out.println ("So dien thoai  khach hang: " + mssv);   
    }
}