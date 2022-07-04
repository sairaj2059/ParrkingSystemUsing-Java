/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelquestionsjava;

import java.util.Scanner;

/**
 *
 * @author Sairaj
 */
public class EndClass {
    
    public static void last(){
        System.out.println("Do you want to continue?(Y/N)");
        Scanner cont = new Scanner(System.in);
        String yesNo = cont.nextLine();
        
        if(yesNo.toUpperCase().equals("Y")){
            inputClass.display();
        }
        else{
            displayClass.lastLine();
        }

        
    }
}
