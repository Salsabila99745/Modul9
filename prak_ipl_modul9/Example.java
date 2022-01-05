/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak_ipl_modul9;
import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author FauziahKhoerunnisa
 */
public class Example {
    public static void main(String [] args){
        int age = 14;
        assert age <= 18 : "Cannot Vote";
        System.out.println("The voter's age is " + age);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ur age ");
        int value;
        value = scanner.nextInt();
        assert value>=18: "Not Valid";
        System.out.println("value is " +value);
    }
}
