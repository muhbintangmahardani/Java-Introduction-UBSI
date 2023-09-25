
package Polymorphism;

public class Polimorfisme {
public static void main (String[] args){
hewan HEWAN = new hewan();
kuda KUDA = new kuda();
kucing KUCING = new kucing();
ayam AYAM = new ayam();

HEWAN.suara();

HEWAN = KUDA ;
HEWAN.suara();

HEWAN = KUCING;
HEWAN.suara();

HEWAN = AYAM;
HEWAN.suara();
}

}
