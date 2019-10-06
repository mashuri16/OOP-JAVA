/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roket;

/**
 *
 * @author FAISAL
 */
public class Roket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,tinggi;
        komponen roket = new komponen();
        roket.nama = "Space X";
        roket.tujuan = "Planet Morag";
        roket.buatan = "Orang Indonesia";
        
        System.out.println("Persiapan Penerbangan");
        
        System.out.println("\nPengisian Bahan Bakar");
        for (i = 0; i <=10; i++){
            System.out.println("Bahan Bakar = " + i);
            roket.bahan_bakar++;
            
        }
        roket.terbang(i);
        System.out.println("Roket Telah Sampai di " + roket.tujuan);
        
    }
    }
