/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5.Interface;

/**
 *
 * @author Fiqron Rizkiawarman
 */
public class Mobil implements KomponenInterface{
    
    @Override
    public void mesin(){
        System.out.println("Kecepatan mobil: " +kecepatan);
    }
    
    @Override
    public void design(){
        System.out.println("Mobil: " +model);
    }
   
    
}
