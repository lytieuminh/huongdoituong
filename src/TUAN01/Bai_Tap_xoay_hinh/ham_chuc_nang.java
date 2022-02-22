package TUAN01.Bai_Tap_xoay_hinh;

import java.util.Scanner;

import TUAN01.Bai_Tap_xoay_hinh.cac_vat_the.*;


public class ham_chuc_nang {

    // menu
    void menu(){
        hinh_tron a = new hinh_tron();
        hinh_vuong b = new hinh_vuong();
        hinh_tam_giac c = new hinh_tam_giac();

        Scanner input = new Scanner(System.in);
            do{
                System.out.println("===========================================");
                System.out.println("======hay chon hinh ban muon xoay==========");
                System.out.println("======nhap so 1 de quay hinh tron==========");
                System.out.println("======nhap so 2 de quay hinh vuong=========");
                System.out.println("======nhap so 3 de quay hinh tam giac======");
                System.out.println("======nhap so 4 de thoat chuong trinh======");
                System.out.println("===========================================");
                System.out.println("== hay chon so de xoay hinh ===============");
                int key = input.nextInt();
                input.nextLine();
                switch(key){
                    case 1:
                        System.out.println("ban chon hinh tron");
                        a.hinh_tron1.xoay_hinh();
                        break;
                    case 2: 
                        System.out.println("ban chon hinh vuong");
                        b.hinh_vuong1.xoay_hinh();
                        break;
                    case 3:
                        System.out.println("ban chon hinh tam gac");
                        c.hinh_tam_giac1.xoay_hinh();
                        break;
                    case 4:
                        System.out.println(" chuong trinh ket thuc ");
                        System.exit(0);
                        break;
                    
                        default:
                        System.out.println(" chuc nang ban chon hien khong ton tai");
                        break;
                    }
                    System.out.print("Quay tro ve MENU lua chon ?(y/n): ");
                }
                    while(input.nextLine().equals("y"));       
                   
            }
        }


