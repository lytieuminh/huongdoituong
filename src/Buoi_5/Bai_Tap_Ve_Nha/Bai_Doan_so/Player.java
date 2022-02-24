package Buoi_5.Bai_Tap_Ve_Nha.Bai_Doan_so;

public class Player {
    private int number = 0;
    //interfaces
    public int getNumber(){
        return this.number;
    }
    public void guess(){
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing "+number);
    }
    
}