package Latihanluaspersegipanjang;
public class persegipanjang {
    public static void main(String[] args) {
        // Panjang dan lebar yang diberikan
        double panjang = 5;
        double lebar = 8;

        // Menghitung luas
        double luas = hitungLuasPersegiPanjang(panjang, lebar);

        // Menampilkan hasil
        System.out.println("Luas persegi panjang adalah: " + luas);
    }

    public static double hitungLuasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }
}
