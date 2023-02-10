package Book_Information;

import Student_Information.BooK_Vo;
import Student_Information.Students;

import java.util.Scanner;

public class Book extends Students {
    int total_Books = 3;
    String[] bName = new String[total_Books];

    Scanner sc = new Scanner(System.in);
    Students students = new Students();
    BooK_Vo[] book = new BooK_Vo[3];

    public void addBook(){
        System.out.println("****Add Books****");
        for (int i = 0 ; i < total_Books ; i++){
            System.out.println("Enter Book Name : ");
            bName[i]=sc.next();
        }
        System.out.println();
        System.out.println("All Books Added Successful");
    }
    public void showBook(){
        System.out.println("List of Books Available in Library");
        for (int j = 0 ; j < total_Books ; j++){
            System.out.println(j+1+">"+bName[j]);
            
        }
    }
    public void issueBook(){
        System.out.println("\nIssue Books To Student");

        System.out.println("Enter Student Roll No.");
        int issue_std = sc.nextInt();

        System.out.println("Enter Book Name : ");
        String issue_Book = sc.next();

        boolean bookAvailable=false;

        for (int j = 0 ; j < total_Books ; j++){
            if (bName[j].equals(issue_Book)){
                bookAvailable=true;
            }
        }
        if(bookAvailable){
            System.out.println("Book Available");
        }
        else {
            System.out.println("Book Not Available");
        }
    }
    public void returnBook(){

    }
}
