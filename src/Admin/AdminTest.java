package Admin;

import Student_Information.Students;
import Book_Information.Book;

import java.util.Scanner;

public class AdminTest {


    String adminID = " Shreyas ";
    String adminPass = "Shreyas";

    Scanner sc = new Scanner(System.in);

    Students studentobj = new Students();
     Book bookobj = new Book();

    public void Login() {

        System.out.println("Login Page");

        System.out.println("\nEnter Id - ");
        String aID = sc.nextLine();

        System.out.println("Admin Pass - ");
        String aPass = sc.nextLine();

        if (adminID.equals(aID) || adminPass.equals(aPass)) {

            System.out.println();
            System.out.println("Login Successful : Welcome Admin");
            System.out.println();
            adminPage();
        } else {
            System.out.println(" You Have Entered Incorrect ID or Password Login Unsuccessful ");
        }
    }

    public void adminPage() {
        System.out.println();
        System.out.println("****Admin page****");
        System.out.println();

        System.out.println("1.Student Record");
        System.out.println("2.Book Record");
        System.out.println("3.Mange Book");
        System.out.println("4.Exit");
        System.out.println("\nEnter Any Option : ");

        int c = sc.nextInt();
        studentPage(c);

    }

    public void studentPage(int x) {
        int c = x;
        switch (c) {
            case 1:
                System.out.println();
                System.out.println("****Student Page****");

                System.out.println("\n1. Add Students");
                System.out.println("2. Display All Student");
                System.out.println("3. Exit");
                System.out.println("\nEnter Any Option : ");
                int d = sc.nextInt();

                switch (d) {
                    case 1:
                        studentobj.studentAdd();
                        adminPage();
                        break;

                    case 2:
                        studentobj.showStudents();
                        adminPage();
                        break;

                    case 3:
                        break;
                }

                break;

            case 2:

                System.out.println("\n****Books Page****");
                System.out.println("\n1. Add Book");
                System.out.println("2. Display All Books");
                System.out.println("3. Exit");
                System.out.println("\n4. Enter Any Option : ");

                int e = sc.nextInt();

                switch (e) {
                    case 1:
                        bookobj.addBook();
                        adminPage();
                        break;

                    case 2:
                        bookobj.showBook();
                        adminPage();
                        break;

                    case 3:
                        break;
                }
                break;

            case 3:

                System.out.println("\n****Manage Book Page****");
                System.out.println("\n1.Issue Books");
                System.out.println("2.Return Books");
                System.out.println("3. Exit");

                System.out.println("\nEnter Any Option : ");
                int f = sc.nextInt();

                switch (f) {
                    case 1:
                        bookobj.issueBook();
                        adminPage();
                        break;

                    case 2:
                        bookobj.returnBook();
                        adminPage();
                        break;

                }
                break;
        }
    }
}




