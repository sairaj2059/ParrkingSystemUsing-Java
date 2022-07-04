
package modelquestionsjava;

import java.util.Scanner;
import static modelquestionsjava.inputClass.ContNum;
import static modelquestionsjava.inputClass.name;
import static modelquestionsjava.inputClass.nameOfSchool;
import static modelquestionsjava.inputClass.parkingNum;
import static modelquestionsjava.inputClass.student;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class displayClass {
//    public static String student;
    public static int packageNum;
    
    static void packageDetail(){
        System.out.println("*********************************************");
        System.out.println("*********************************************");
        System.out.println("Select your package type: ");
        System.out.println("1. Full Day ");
        System.out.println("2. One Night ");
        System.out.println("3. Office Hours ");
        System.out.println("4. Full Week");
        
        Scanner pkg = new Scanner(System.in);
        packageNum = pkg.nextInt();
        finaldis();    
    }
    static void display2(){
            
            switch (packageNum){
            case 1:
                System.out.println("Service Name: Full Day");
                if(student.toUpperCase().equals("Y")){
                    System.out.println("Day Fee: 200");
                 
        }
                else{
                   System.out.println("Day Fee: 400"); 
                }
                 break; 
            case 2:
                System.out.println("Service Name: One Night");
                if(student.toUpperCase().equals("Y")){
                    System.out.println("Day Fee: 400");
                    
        }
                else{
                   System.out.println("Day Fee: 500"); 
                }
                 break; 
            case 3:
                System.out.println("Service Name: Office Hours");
                if(student.toUpperCase().equals("Y")){
                    System.out.println("Day Fee: 100");
                    
        }
                else{
                   System.out.println("Day Fee: 200"); 
                }
                 break; 
            case 4:
                System.out.println("Service Name: Full Week");
                if(student.toUpperCase().equals("Y")){
                    System.out.println("Day Fee: 1000");
                    
        }
                else{
                   System.out.println("Day Fee: 2000"); 
                }
                 break; 
            default:
                System.out.println("Invalid selection");
                packageDetail();
        }
            
     

        }
    static void finaldis(){
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();  
    System.out.println("*********************************************");
    System.out.println("*********************************************");
    System.out.println("Here are the customer's details: ");
    System.out.println("Name: "+ name);
    System.out.println("Mobile No: "+ ContNum);
    System.out.println("Parking Number: "+ parkingNum);
    System.out.println("School name: "+ nameOfSchool);
    display2();
    System.out.println("The date and time of entry is " + dtf.format(now));
    EndClass.last();
    
    
}
    static void lastLine(){
    System.out.println("*********************************************");
    System.out.println("******************Thank You******************");
    System.out.println("ABC Parking Masters");
    System.out.println("Dhobidhara, Kathmandu");
    System.out.println("9812345678, 01-254645");
    }
}
