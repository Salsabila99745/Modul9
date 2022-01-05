/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak_ipl_modul9;

/**
 *
 * @author FauziahKhoerunnisa
 */
public class Tugas1 {
    public static void main(String [] args){
        //System.out.println(3/0);
        int a=3;
        try{
            System.out.println(a/0);
        }catch(Exception e){
            System.out.println("Cannot divide a number by 0");
        }
    }
}
