package TUAN01;

import java.util.Scanner;

public class employer {
//data    
    String name;
    int age;
    String sex;
    String country;
    int  phone_number;
    String address;
    double wage_per_month = 16700.500;
    int absence;
    double salary_deduction_per_days = 500.430;
    double total_wage = 0 ;
    Scanner input = new Scanner(System.in);


    // function
    // insert info employer ( thêm thông tin nhân viên)
    void insert_info(){
        System.out.println("Nhap ten nhan vien: ");
        name = input.nextLine();
        System.out.println("Nhap tuoi nhan vien: ");
        age = input.nextInt();
        input.nextLine();
        System.out.println("Nhap gioi tinh nhan vien ( male / female / other ) ");
        sex = input.nextLine();
        System.out.println("Nhap que quan nhan vien ");
        country = input.nextLine();
        System.out.println("Nhap so lien lac nhan vien: ");
        phone_number = input.nextInt();
        input.nextLine();
        System.out.println("Nhap dia chi nhan vien: ");
        address = input.nextLine();
        }


// caculate wage ( tính tiền lương ) 
// em lười quá nên công ty này không có nghỉ phép luôn cứ nghỉ buổi nào trừ tiền buổi đó 
    void pay_wage(){
        System.out.println("so ngay nghi trong thang : ");
        absence = input.nextInt();
        input.nextLine();
        total_wage = wage_per_month - ( salary_deduction_per_days * absence) ;
    }      


// show info employer ( hiển thị thông tin và lương thông tin nhân trong tháng )
    void info_employer(){
        System.out.println("Ten nhan vien: " + name);
        System.out.println("Tuoi nhan vien: " + age);
        System.out.println("Gioi tinh nhan vien" + sex);
        System.out.println("Que quan nhan vien" + country);
        System.out.println("So đien thoai  nhan vien: " + phone_number);
        System.out.println("Đia chi nhan vien: " + address);
        System.out.println("luong thang nay : " + total_wage );

    }
}