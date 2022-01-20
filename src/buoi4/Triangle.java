package buoi4;

public class Triangle {
    String Soundfile;

    public Triangle( String Soundfile){
    this.Soundfile = Soundfile;
    }
    public void Rotate(){
        System.out.println("xoay hinh ");
    }

    public void playsound(){

        System.out.println("choi nhac " + Soundfile);   
    }


}
