package Buoi_5.Bai_Tap_Ve_Nha.Bai_Xoay_Hinh;

public class Square {

    private String soundFile;

    public Square(String soundFile) {
        this.soundFile = soundFile;
    }

    void rotate() {
        System.out.println(" xoay hinh");
    }

    void playSound() {
        System.out.println("choi nhac " + soundFile);
    }
}