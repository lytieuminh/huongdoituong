package tuan02.buoi1;

public class student {
    String gioitinh;
    int tuoi;
    String ten;
    String lop;

public student(String ten , int tuoi , String gioitinh){
    this.ten = ten;
    this.tuoi = tuoi;
    this.gioitinh = gioitinh;
    this.lop = lop;
}

public student(String ten , String lop , int tuoi , String gioitinh){
    this(ten,tuoi,lop);
    this.gioitinh = gioitinh;

}


void thi(){
    System.out.println( ten + "" + " dang thi ");
}
}