/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
    Penggunaan :
    try{
        // Protected Code
    } catch (ExceptionType1 e1){
        // Catch Block
    } catch (ExceptionType2 e2){
        // Catch Block
    } catch (ExceptionType3 e3){
        // Catch Block
    } Finally {
        // The Finally block always execute
    }
*/

package prak_ipl_modul9;

/**
 *
 * @author FauziahKhoerunnisa
 */
public class FinallyBlock {
    public static void main(String args []){
        int a[] = new int[2];
        try{
            System.out.println("Access element three :" + a[3]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown :" + e);
        } finally{
            a[0] = 6;
            System.out.println("First element value : " + a[0]);
            System.out.println("The finally statement is executed");
        }
    }
}
