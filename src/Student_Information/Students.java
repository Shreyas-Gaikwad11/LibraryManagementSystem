package Student_Information;

import java.util.Scanner;

public class Students {

    final int total_std = 3;
    String[] sName = new String[total_std];
    int[] sRollNo  = new int[total_std];


    Scanner sobj = new Scanner(System.in);

    public void studentAdd(){
        System.out.println("Add Student Name and Roll no.");
        for (int i = 0 ; i < total_std ; i++){
            System.out.println("\nEnter Name : ");
            sName [i] = sobj.next();

            System.out.println("Enter Roll No : ");
            sRollNo [i] = sobj.nextInt();


        }

      System.out.println("\nData Save Successful");

    }
        public void showStudents(){

           System.out.println("List of Students Name and Roll No. ");

           for (int j = 0 ; j < total_std ; j++){
               System.out.println(j+1+"> "+sRollNo[j]+" - ");

               System.out.println(sName[j]);
           }

        }

}
