package TUAN01;

// nghe lời thầy làm y chang bảng mẫu không làm trò con bò =))

import java.util.Scanner;

public class Customer {
//data 
    String name;
    int age;
    String sex;
    String country;
    int  phone_number;
    String address;

    Scanner input = new Scanner(System.in);

// function
    // insert info customer ( thêm thông tin khách hàng )
    void insert_info(){
        System.out.println("Nhap ten khach hang: ");
        name = input.nextLine();
        System.out.println("Nhap tuoi khach hang: ");
        age = input.nextInt();
        input.nextLine();
        System.out.println("Nhap gioi tinh khach hang ( male / female / other ) ");
        sex = input.nextLine();
        System.out.println("Nhap que quan khach hang ");
        country = input.nextLine();
        System.out.println("Nhap so lien lac khach hang: ");
        phone_number = input.nextInt();
        input.nextLine();
        System.out.println("Nhap dia chi khach hang: ");
        address = input.nextLine();
    }
//  show info customer ( hiển thị thông tin khác hàng )
    void info_customer(){
        System.out.println("Ten khach hang: " + name);
        System.out.println("Tuoi khach hang: " + age);
        System.out.println("Gioi tinh khach hang" + sex);
        System.out.println("Que quan khach hang" + country);
        System.out.println ("So dien thoai  khach hang: " + phone_number);
        System.out.println ("dia chi khach hang: " + address);
    }
}
