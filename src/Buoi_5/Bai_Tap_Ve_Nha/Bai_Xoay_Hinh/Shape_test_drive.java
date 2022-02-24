package Buoi_5.Bai_Tap_Ve_Nha.Bai_Xoay_Hinh;

import java.util.Scanner;

public class Shape_test_drive {
    public static void main(String[] args) {
        Circle a = new Circle(("ting ting......."));
        Square b = new Square("tang tang........");
        Triangle c = new Triangle("teng teng..........");
        Aomeba d = new Aomeba("ding dong........ ",2.3,6.6);

        Scanner input = new Scanner(System.in);
            do{
                System.out.println("===========================================");
                System.out.println("======hay chon hinh ban muon xoay==========");
                System.out.println("======nhap so 1 de quay hinh tron==========");
                System.out.println("======nhap so 2 de quay hinh vuong=========");
                System.out.println("======nhap so 3 de quay hinh tam giac======");
                System.out.println("======nhap so 4 de quay hinh emoeba======");
                System.out.println("======nhap so 5 de thoat chuong trinh======");
                System.out.println("===========================================");
                System.out.println("== hay chon so de xoay hinh ===============");
                int key = input.nextInt();
                input.nextLine();
                switch(key){
                    case 1:
                        System.out.println("ban chon hinh tron");
                        a.rotate();
                        a.playSound();
                        break;
                    case 2: 
                        System.out.println("ban chon hinh vuong");
                        b.rotate();
                        b.playSound();
                        break;
                    case 3:
                        System.out.println("ban chon hinh tam giac");
                        c.rotate();
                        c.playSound();
                        break;
                    case 4:
                        System.out.println("ban chon hinh tam gac");
                        d.rotate();
                        d.playSound();
                        break;    
                    case 5:
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
