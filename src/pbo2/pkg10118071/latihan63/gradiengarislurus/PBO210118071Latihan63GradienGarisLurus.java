/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan63.gradiengarislurus;

/**
*
* @author 
* NAMA              : David Aditya Winarto
* KELAS             : PBO2
* NIM               : 10118071
* Deskripsi Program : Program ini berisi program untuk menghitung
*                     gradien dengan konsep interface
* 
*/
public class PBO210118071Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Koordinat k = new Koordinat();
        k.setX1(2);
        k.setX2(5);
        k.setY1(10);
        k.setY2(7);
        
        System.out.println("Garis yang melalu titik ("+k.getX1()+","+k.getY1()+") dan ("+k.getX2()+","+k.getY2()+") memiliki gradien sebesar "+k.hitungGradien());
        
        k.setX1(5);
        k.setX2(3);
        k.setY1(1);
        k.setY2(12);
        
        System.out.println("Garis yang melalu titik ("+k.getX1()+","+k.getY1()+") dan ("+k.getX2()+","+k.getY2()+") memiliki gradien sebesar "+k.hitungGradien());
    }
    
}
