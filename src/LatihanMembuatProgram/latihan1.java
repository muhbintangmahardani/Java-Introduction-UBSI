
package LatihanMembuatProgram;

import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
     
        Scanner input = new Scanner (System.in);
        //deklarasi objek baru
        String nama;
        int absen, uts, uas, tugas, nim;
        double jml;
     
        System.out.print("Masukkan Nama Anda : ");
        nama = input.nextLine();
        System.out.print("Masukkan NIM Anda : ");
        nim = input.nextInt();
        System.out.print("Masukkan Nilai Absen : ");
        absen = input.nextInt();
        System.out.print("Masukkan Nilai Tugas : ");
        tugas = input.nextInt();
        System.out.print("Masukkan Nilai UTS : ");
        uts = input.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        uas = input.nextInt();
     
        jml=(0.1*absen+0.2*tugas+0.3*uts+0.4*uas);
             
        System.out.println("\n\nPROGRAM NILAI MAHASISWA");
        System.out.println("-----------------------");
        System.out.println("NIM            : "+nim);
        System.out.println("Nama Mahasiswa : "+nama);
        System.out.println("Nilai Absen    : "+absen);
        System.out.println("Nilai Tugas    : "+tugas);
        System.out.println("Nilai UTS      : "+uts);
        System.out.println("Nilai UAS      : "+uas);
        System.out.println("-----------------------");
        System.out.println("Rata - Rata    : "+jml);
    }
}
