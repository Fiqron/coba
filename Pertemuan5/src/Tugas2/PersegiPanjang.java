/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author Fiqron Rizkiawarman
 */
public class PersegiPanjang extends Persegi {
    
    void nilai_persegipanjang(){
        int panjang=15,lebar=6, luas, keliling;
        luas = panjang * lebar;
        keliling = (2*panjang)+(2*lebar);
        System.out.println("------------PERSEGI PANJANG---------");
        System.out.println("Luas Persegi Panjang adalah = "+luas);
        System.out.println("Keliling Persegi Panjang adalah = "+keliling);
        System.out.println("");
    }
}
