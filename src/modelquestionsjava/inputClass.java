
package modelquestionsjava;

import java.util.Scanner;

public class inputClass {
    public static String name;
    public static String ContNum;
    public static int parkingNum;
    public static String nameOfSchool  ;
    public static String student  ;

    static void display(){
        System.out.println("*******Welcome to our Parking software*******");
        System.out.println("*********************************************");
        System.out.println("Enter Customer's Name ");
        Scanner nm = new Scanner(System.in);
        name = nm.nextLine();
        System.out.println("Enter Customer's Contact Number: ");
        Scanner contNum = new Scanner(System.in);
        ContNum = contNum.nextLine();
        System.out.println("Enter Parking Number: ");
        Scanner parkNum = new Scanner(System.in);
        parkingNum = parkNum.nextInt();
        System.out.println("Student?(Y/N) ");
        Scanner std = new Scanner(System.in);
        student = std.nextLine().toUpperCase();
        if(student.toUpperCase().equals("Y")){
            System.out.println("Enter the school Name: ");
        Scanner scl = new Scanner(System.in);
        nameOfSchool = scl.nextLine().toUpperCase();
         displayClass.packageDetail();
       
    }
       
        else{
           displayClass.packageDetail();
        }
        
    } 
        
}
