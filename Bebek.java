/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pbo.tm3;

/**
 *
 * @author zahidahhanumalzahra
 */
class Bebek extends Hewan implements BisaTerbang, BisaBerenang {
    
    @Override
    void suara() {
        System.out.println("Kwek!");
    }
    
    @Override
    public void terbang() {
        System.out.println("Bebek sedang terbang.");
    }
    
    @Override
    public void berenang() {
        System.out.println("Bebek sedang berenang.");
    }
    
    void makan() {
        System.out.println("Bebek sedang makan.");
    }
    
    void makan(String makanan) {
        System.out.println("Bebek sedang makan " + makanan + ".");
    }
}
