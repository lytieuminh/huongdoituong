package Buoi_5.Bai_Tap_Ve_Nha.Bai_Xoay_Hinh;

public class Triangle {

    private String soundFile;

    public Triangle(String soundFile) {
        this.soundFile = soundFile;
    }

    void rotate() {
        System.out.println(" xoay hinh ");
    }

    void playSound() {
        System.out.println("choi nhac " + soundFile);
    }
    
}