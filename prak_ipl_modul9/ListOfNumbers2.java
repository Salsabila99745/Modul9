/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak_ipl_modul9;
import java.io.*;
import java.util.Vector;
/**
 *
 * @author FauziahKhoerunnisa
 */
public class ListOfNumbers2 {
    private Vector victor;
    private static final int size = 10;

 
    public ListOfNumbers2() throws IOException{
        victor = new Vector(size);
        for (int i = 0; i < size; i++)
        victor.addElement(new Integer(i));

        this.readList("infile.txt");
        this.writeList();
    }

    public void readList(String fileName){
        String line = null;
        try{
            RandomAccessFile raf = new RandomAccessFile(fileName,"r");
            while ((line = raf.readLine()) != null){
                Integer i = new Integer (Integer.parseInt(line));
                System.out.println(i);
                victor.addElement(i);
            }
        } catch (FileNotFoundException f){ //tambahkan exception jika file tidak ditemukan
            System.err.println("File: " + fileName + " not found.");
        } catch (IOException io){ //tambahkan exception untuk output error
            System.err.println(io.toString());
        }
    }
 
    public void writeList() throws IOException{
        PrintWriter out = null;
        try{ //tambahkan Exception jika arrat melebihi batas
            out = new PrintWriter(new FileWriter("outfile.txt"));
            for (int i = 0; i < victor.size(); i++)
                out.println("Value at : " + i + " = " +victor.elementAt(i));
        } catch (ArrayIndexOutOfBoundsException e){ //Tambahkan exception untuk output error
            System.err.println("Error ArrayIndexOutOfBoundsException:" + e.getMessage()); 
        } finally {
            if(out != null){ //Tambahkan Exception untuk exception akhir menampilkan Closing print writer jika out tdk null dan Printwriter not open jika out null
                System.out.println("Closing PrintWriter");
                out.close();
            } else{
                System.out.println("PrintWriter not open");
            }
        }
    }
 
    public static void main(String [] args) throws IOException{
        new ListOfNumbers2();
    }
}
