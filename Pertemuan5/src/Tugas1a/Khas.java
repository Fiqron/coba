/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1a;

/**
 *
 * @author Fiqron Rizkiawarman
 */
public class Khas extends detail{
    
    @Override
    void duck(){
        String name="Angsa";
        String breed="Cirebon";
        String umur="1";
        System.out.print("Duck(");
        System.out.print("name="+name);
        System.out.print(", breed="+breed);
        System.out.print(", umur="+umur);
        System.out.println(")");
        System.out.println("kwek...kwek...kwek...");
    }
    @Override
    void cat(){
        String name="Si manis";
        String breed="Angora";
        String umur="5";
        System.out.print("Cat(");
        System.out.print("name="+name);
        System.out.print(", breed="+breed);
        System.out.print(", umur="+umur);
        System.out.println(")");
        System.out.println("meong...meong...meong...");
    }
     @Override
    void dog(){
        String name="Si hitam";
        String breed="Ciwawa";
        String umur="30";
        System.out.print("DOG(");
        System.out.print("name="+name);
        System.out.print(", breed="+breed);
        System.out.print(", umur="+umur);
        System.out.println(")");
         System.out.println("gok...gok...gok...");
    }
    
    
}
