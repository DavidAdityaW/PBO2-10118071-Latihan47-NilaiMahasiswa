/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan47.nilaimahasiswa;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menghitung
 *                     dan menentukkan nilai mahasiswa
 * 
 */
public class PBO210118071Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Nilai n = new Nilai();
        
        n.set_quiz(75);
        n.set_uts(45);
        n.set_uas(34);
        
        System.out.println("QUIZ \t\t = " + n.get_quiz());
        System.out.println("UTS \t\t = " + n.get_uts());
        System.out.println("UAS \t\t = " + n.get_uas());
        
        System.out.println("\nNILAI AKHIR \t = " + n.nilaiAkhir(n.get_quiz(), n.get_uts(), n.get_uas()));
        System.out.println("\nIndex = " + n.nilaiIndeks(n.nilaiAkhir(n.get_quiz(), n.get_uts(), n.get_uas()), n.get_indeks()));
        System.out.println("Keterangan = " + n.nilaiKet(n.get_indeks(), n.get_ket()));
        
    }
    
}
