package Buoi_5.Bai_Tap_Ve_Nha.Bai_Xoay_Hinh;

public class Aomeba {

        private String fileSound;
        private double xPoint, yPoint;
    
        public void setFileSound(String fileSound) {
            this.fileSound = fileSound;
        }

        public void setxPoint(double xPoint) {
            this.xPoint = xPoint;
        }

        public void setyPoint(double yPoint) {
            this.yPoint = yPoint;
        }

        public String getfileSound() {
            return fileSound;
        }

        public double getyPoint() {
            return yPoint;
        }

        public double getxPoint() {
            return xPoint;
        }
            
        public Aomeba() {
    
        }

        public Aomeba(String fileSound, double xPoint, double yPoint) {
            this.fileSound = fileSound;
            this.xPoint = xPoint;
            this.yPoint = yPoint;
        }
        public void rotate() { 
            System.out.println("Amoeba xoay hinh tai toa do x la " + xPoint + " va y la " + yPoint);
        }

        public void playSound() {
            System.out.println(" choi nhac  " + fileSound );
        }
    }

