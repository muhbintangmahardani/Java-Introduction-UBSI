
package Masukan;
import java.util.Scanner;

/**
 *
 * @author CYBER
 */
public class AksiScanner {
    public static void main(String args[])

{
// Membuat objek baru
ClassScanner scan=new ClassScanner();

scan.inputScanner();
System.out.println("\nNama Anda :" + scan.getnama());
System.out.println("Nilai Anda : " + scan.rata());

}
    
}
