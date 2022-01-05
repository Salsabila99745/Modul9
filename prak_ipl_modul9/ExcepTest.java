/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Penggunaan :
    try{
        // Protected code
    } catch (ExceptionName el){
        // Catch block
    }
*/
package prak_ipl_modul9;
import java.io.*;
/**
 *
 * @author FauziahKhoerunnisa
 */
public class ExcepTest {
    public static void main(String args[]) {
        try {
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown :" + e);
            System.out.println("Out of the block");
        }
    }
}
