/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.pbo.tm3;

/**
 *
 * @author zahidahhanumalzahra
 */
public class Utama {
    public static void main(String[] args) {
        
        Bebek bebekSaya = new Bebek();
        bebekSaya.suara(); 
        bebekSaya.tidur(); 
        bebekSaya.terbang(); 
        bebekSaya.berenang(); 
        bebekSaya.makan();
        bebekSaya.makan("jagung");
        
        Hewan hewan = new Bebek(); 
        Bebek bebekDiCast = (Bebek) hewan; 
        bebekDiCast.suara();
    }
}