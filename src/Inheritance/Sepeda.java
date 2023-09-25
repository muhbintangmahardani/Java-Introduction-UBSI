
package Inheritance;

/**
 *
 * @author CYBER
 */
class Sepeda {
int kecepatan = 0;
int gir = 0;
// method
void ubahGir (int pertambahanGir) {
gir= gir+ pertambahanGir;
System.out.println("Gir:" + gir);
}
void tambahKecepatan (int pertambahanKecepatan) {
kecepatan = kecepatan+ pertambahanKecepatan;
System.out.println("Kecepatan:" + kecepatan);
}    
}
