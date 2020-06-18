/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1b;

/**
 *
 * @author Fiqron Rizkiawarman
 */
public class Khas implements detail{
    @Override
    public void duck(){
        System.out.print("Duck(");
        System.out.print("name="+nama1);
        System.out.print(", breed="+breed1);
        System.out.print(", umur="+umur1);
        System.out.println(")");
        System.out.println("kwek...kwek...kwek...");
    }
    
    @Override
    public void cat(){
        System.out.print("Cat(");
        System.out.print("name="+nama2);
        System.out.print(", breed="+breed2);
        System.out.print(", umur="+umur2);
        System.out.println(")");
        System.out.println("meong...meong...meong...");
    } 
    public void dog(){
        System.out.print("Dog(");
        System.out.print("name="+nama3);
        System.out.print(", breed="+breed3);
        System.out.print(", umur="+umur3);
        System.out.println(")");
        System.out.println("gok...gok...gok...");
    } 
}
