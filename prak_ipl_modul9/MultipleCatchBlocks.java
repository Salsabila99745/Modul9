/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
    Peggunaan :
        try{
            // Protected Code
        } catch (ExceptionType1 e1){
            // Catch Block
        } catch (ExceptionType2 e2){
            // Catch Block
        } catch (ExceptionType3 e3){
            // Catch Block
        }
*/
package prak_ipl_modul9;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author FauziahKhoerunnisa
 */
public class MultipleCatchBlocks {
    public static void main (String [] args){
        FileInputStream fileInput = null;
        int [] array = {0,1,2,3};
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("Nilai array ke : ");
        int index = userInput.nextInt();
        try{
            System.out.printf("Index ke - %d adalah %d\n", index,array[index]);
            fileInput = new FileInputStream("C:\\Users\\FauziahKhoerunnisa\\Documents\\NetBeansProjects\\Prak_IPL_Modul9");
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        } catch (IOException e){
            System.err.println(e);
        }
        System.out.println("Selesai");
    }
}
