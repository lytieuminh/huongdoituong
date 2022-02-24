package Buoi_5.Bai_Tap_Ve_Nha.Bai_Xoay_Hinh;

public class Circle {

    private String soundFile;
    
    public Circle(String soundFile) {
        this.soundFile = soundFile;
    }
    
    void rotate() {
        System.out.println(" xoay hinh ");
    }
    
    void playSound() {
        System.out.println("choi nhac " + soundFile);
    }    
}