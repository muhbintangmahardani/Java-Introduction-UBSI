
package BufferedReader;
import java.io.*;
/**
 *
 * @author CYBER
 */
public class buffered {
    public static void main(String args[]) throws Exception
  {
// Membuat objek baru
InputStreamReader keyreader = new InputStreamReader(System.in);
BufferedReader input = new BufferedReader (keyreader);
// Deklarasi Variabel
String kata1, kata2;

System.out.print("Masukan Kata Pertama : ");
kata1 = input.readLine();
System.out.print("Masukan Kata Kedua : ");
kata2 = input.readLine();
System.out.println("\nHasil Input String " + kata1 + " " + kata2);

}

}
