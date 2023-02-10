package MyLibrary;

import Admin.AdminTest;

import java.util.Scanner;

public class WelcomePage {

    Scanner sc = new Scanner(System.in);
    AdminTest adobj = new AdminTest();

    public void display(){
        System.out.println("****Library Management Application****");
        System.out.println("\n1.Login");
        System.out.println("2.Sing up");
        System.out.println("3.Exit");
        System.out.println("\nEnter Any Option : ");

        int a = sc.nextInt();

        switch(a){
            case 1 : adobj.Login();
                display();
                break;
            case 2 :
                display();
                break;
            case 3 :


                break;

        }




    }


}
