
package LatihanMembuatProgram;

import java.util.Scanner;

public class Aksi_Scanner {
    public static void main(String args[])
         
    {
        classscanner scan = new classscanner();
     
        scan.inputScanner();
        System.out.println("\n\nPROGRAM NILAI MAHASISWA");
        System.out.println("-------------------------");
        System.out.println("NIM            : "+scan.nim());
        System.out.println("Nama Mahasiswa : "+scan.getnama());
        System.out.println("Nilai Absen    : "+scan.getabsen());
        System.out.println("Nilai Tugas    : "+scan.gettugas());
        System.out.println("Nilai UTS      : "+scan.getuts());
        System.out.println("Nilai UAS      : "+scan.getuas());
        System.out.println("-------------------------");
        System.out.println("Rata - Rata    : "+scan.rata());
    }
}
