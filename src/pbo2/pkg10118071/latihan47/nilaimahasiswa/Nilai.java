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
public class Nilai {
    
    private float quiz;
    private float uts;
    private float uas;
    private float nilaiAkhir;
    private char indeks;
    private String ket;

    public void set_quiz(float quiz) {
        this.quiz = quiz;
    }

    public float get_quiz() {
        return quiz;
    }

    public void set_uts(float uts) {
        this.uts = uts;
    }

    public float get_uts() {
        return uts;
    }

    public void set_uas(float uas) {
        this.uas = uas;
    }

    public float get_uas() {
        return uas;
    }

    public char get_indeks() {
        return indeks;
    }
    
    public String get_ket() {
        return ket;
    }

    public float nilaiAkhir(float quiz, float uts, float uas) {
        nilaiAkhir = ((quiz * 20 / 100) + (uts * 30 / 100) + (uas * 50 / 100));
        return nilaiAkhir;
    }

    public char nilaiIndeks(float nilaiAkhir, char indeks) {
        if ((nilaiAkhir >= 80) && (nilaiAkhir <= 100)) {
            indeks = 'A';
        } else if ((nilaiAkhir >= 68) && (nilaiAkhir < 80)) {
            indeks = 'B';
        } else if ((nilaiAkhir >= 56) && (nilaiAkhir < 68)) {
            indeks = 'C';
        } else if ((nilaiAkhir >= 45) && (nilaiAkhir < 56)) {
            indeks = 'D';
        } else if ((nilaiAkhir >= 0) && (nilaiAkhir < 45)) {
            indeks = 'E';
        }
        this.indeks = indeks;
        return indeks;
    }

    public String nilaiKet(char indeks, String ket) {
        switch (indeks) {
            case 'A':
                ket = "Sangat Baik";
                break;
            case 'B':
                ket = "Baik";
                break;
            case 'C':
                ket = "Cukup";
                break;
            case 'D':
                ket = "Kurang";
                break;
            case 'E':
                ket = "Sangat Kurang";
                break;
            default:
                break;
        }
        return ket;
    }
    
}
