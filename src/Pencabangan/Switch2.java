package Pencabangan;

public class Switch2 {
    public static void main(String[] args) {
        char nilai ='D';
        switch (nilai){
            case 'A':
                System.out.println("Mhs      :\"Terima Kasih pak\"");
                System.out.println("Dosen    :\"Selamat Ya !!\"");
                break;
            case 'B':
                System.out.println("Mhs      :\"Pak kenapa nilai ulun 100?\"");
                System.out.println("Dosen    :\"iya , karena kamu pintar nak ae !!\"");
                break;
            case 'C':
                System.out.println("Mhs      :\"bapak hari ini sibuk gak?\"");
                System.out.println("Dosen    :\"gak bapak lagi free!!\"");
                System.out.println("Mhs      :\"ayo mancing  pak hihihhihi\"");
                break;
            default:
                System.out.println("Dosen    :\"Mau mancing dimana \"");
                System.out.println("Mhs      :\"Bebas dah , yang peting macing \"");
                System.out.println("Dosen    :\"oke kalo gitu bapak siap siap dulu \"");
                System.out.println("Mhs      :\"siap pak \"");
                System.out.println("Mhs      :\"ayo barangkat pakk\"");
                break;
        }
    }
}
