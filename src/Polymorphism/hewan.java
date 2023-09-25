
package Polymorphism;

class hewan {
public void suara (){
System.out.println("Hewan bersuara : ");
}    
} 
class kuda extends hewan {
public void suara(){
System.out.println("Kuda Kengikik...");
}
}

class kucing extends hewan {
public void suara(){
System.out.println("Kucing Mengeong...");
}
}

class ayam extends hewan {
public void suara(){
System.out.println("Ayam Berkokok...");
}
}