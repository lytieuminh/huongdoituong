package buoi4;

import java.util.Scanner;

public class Shape_Test_Drive {
    public static void main(String[] args) {
        Object_Circle a = new Object_Circle();
        Object_square b = new Object_square();
        Object_Triangle c = new Object_Triangle();
        Object_Emoeba d = new Object_Emoeba();

        Scanner input = new Scanner(System.in);
            do{
                System.out.println("===========================================");
                System.out.println("======hay chon hinh ban muon xoay==========");
                System.out.println("======nhap so 1 de quay hinh tron==========");
                System.out.println("======nhap so 2 de quay hinh vuong=========");
                System.out.println("======nhap so 3 de quay hinh tam giac======");
                System.out.println("======nhap so 3 de quay hinh emoeba======");
                System.out.println("======nhap so 5 de thoat chuong trinh======");
                System.out.println("===========================================");
                System.out.println("== hay chon so de xoay hinh ===============");
                int key = input.nextInt();
                input.nextLine();
                switch(key){
                    case 1:
                        System.out.println("ban chon hinh tron");
                        a.ObjectCircle();
                        break;
                    case 2: 
                        System.out.println("ban chon hinh vuong");
                        b.Objectsquare();
                        break;
                    case 3:
                        System.out.println("ban chon hinh tam gac");
                        c.ObjectTriangle();
                        break;
                    case 4:
                        System.out.println("ban chon hinh tam gac");
                        d.ObjectEmoeba();
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
