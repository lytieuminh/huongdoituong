package TUAN01.Bai_Tap_xoay_hinh;

// khuon de tao ra cac hinh khac nhau 
public class data_vat_the {
    String hinh_dang;  

    public data_vat_the(String new_hinh_dang ){
        hinh_dang = new_hinh_dang;
    }
    public void xoay_hinh(){
        System.out.println( this.hinh_dang + " "+ "da xoay cuc manh XD " );
    }
}
