/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 *
 * @author Fiqron Rizkiawarman
 */
public class MembuatKue extends komponen{
    
    @Override
    void bahan_bahan(){
        String bahan1="terigu";
        String bahan2="gula";
        String bahan3="telur";
        System.out.println("======BAHAN-BAHAN======");
        System.out.println("1. " +bahan1);
        System.out.println("2. " +bahan2);
        System.out.println("3. " +bahan3);
}
    @Override
    void peralatan(){
        String alat1="oven";
        String alat2="mixer";
        String alat3="loyang";
        System.out.println("======ALAT-ALAT======");
        System.out.println("1. " +alat1);
        System.out.println("2. " +alat2);
        System.out.println("3. " +alat3);
    }
    
    @Override
    void proses_pembuatan(){
        System.out.println("======PROSES======");
        System.out.println("1. Aduk dan campur bahan");
        System.out.println("2. Masukan ke loyang");
        System.out.println("3. Oven sampai matang");
        System.out.println("4. Selesai");
    }
}
