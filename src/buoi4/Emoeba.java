package buoi4;

public class Emoeba {
    String Soundfile;


    public Emoeba( String Soundfile){
        this.Soundfile = Soundfile;

    }
    void Rotate(){
        System.out.println("xoay hinh ");
    }

    void playsound(){
        System.out.println("choi nhac " + Soundfile);   
    }
}

