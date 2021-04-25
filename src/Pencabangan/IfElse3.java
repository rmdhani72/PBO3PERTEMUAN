package Pencabangan;

public class IfElse3 {
    public static void main(String[] args) {
        double totalBelanja = 288000 ;
        double uangDiDompet = 50000 ;

        if (uangDiDompet<totalBelanja){
            System.out.println("Uang Kurang, Kurangi Jajan Anda");
        }else if(uangDiDompet>totalBelanja){
            double Kembalian  = uangDiDompet-totalBelanja;
            System.out.println("Uang Cukup, Kembalian :" + Kembalian);
        }else{
            System.out.println("uang pas...uwuw..");
        }

    }
}
