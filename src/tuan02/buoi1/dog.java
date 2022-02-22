package tuan02.buoi1;



public class dog {
    int kich_co;
    String mau_sac;
    int tuoi;

    public dog(int kich_co,int tuoi , String mau_sac) {
        this.kich_co = kich_co;
        this.tuoi = tuoi;
        this.mau_sac = mau_sac;
    }
    void nuong(){
        if(kich_co>10){
            System.out.println("dem di nuong");
        }else {
            System.out.println("nuoi tiep");
        }
    }
    void nuoi3thang(){
        kich_co +=6;
    }
    
}
