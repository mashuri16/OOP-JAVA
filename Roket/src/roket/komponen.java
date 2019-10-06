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
public class komponen {
    int bahan_bakar,tinggi,jarak = 10000;
    String nama;
    int kecepatan = 200;
    String tujuan;
    String buatan;
    
    public void terbang(int x){
       if (bahan_bakar == x){
           System.out.println("Bahan bakar Sudah Terisi Penuh");
           System.out.println("Bahan Bakar Full");
           System.out.println("\nRoket = " + nama);
           System.out.println("Tujuan = " + tujuan);
           System.out.println("Buatan = " + buatan);
           System.out.println("Siap Meluncur");
           
           
           System.out.println("Roket Meluncur Dalam : ");
           
           for (int j = 10; j >= 0; j--){
               System.out.print(j + "\n");
           }
           System.out.println("\nRoket Meluncur ");
           
           for (tinggi = 0; tinggi <= 10000; tinggi += 100 ){
               System.out.print("Tinggi = " + tinggi + "mil");
               System.out.println("\nKecepatan Roket = " + kecepatan + "Km/S\n");
               System.out.print("Jarak = " + jarak + " mil \n");
               
               
               if (tinggi <= 500){
                   kecepatan += 100;
                   jarak-=50;
               }
               else if (tinggi <= 1500){
                   kecepatan += 250;
                   jarak -= 100;
               }
               else if (tinggi <= 4500){
                   kecepatan += 5000;
                   jarak -= 200;
               }
               else if (tinggi < 6400){
                   kecepatan += 10000;
                   jarak -= 150;
                   
                }
               else if (tinggi > 6400) {
                   kecepatan += 20000;
               }
                   
            }
                System.out.println("Roket Sampai Tujuan Dalam : ");
                   
                for (int k = 10; k >= 0; k--){
                    System.out.println(k + "\n");
                }
               
       }
    }
}
