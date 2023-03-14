import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //creo array di libri
        Book [] books = new Book[2];

        //faccio riempire all'utente i dati
        Scanner scan = new Scanner(System.in);
        System.out.println("What's about this book?");

        for (int i = 0; i < books.length ; i++) {

            System.out.println("BOOK N: " + (i+1));

            System.out.print("Title: ");
            String title = scan.nextLine();

            int pages = 0;
            System.out.print("Pages: ");
            try{
                pages = Integer.parseInt(scan.nextLine());
            }catch(NumberFormatException e){
            }

            System.out.print("Author: ");
            String author = scan.nextLine();

            System.out.print("Editor: ");
            String editor = editor = scan.nextLine();

                try {
                    books[i] = new Book(title, pages, author, editor);
                }catch(IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
        }

        System.out.println(Arrays.toString(books));
        scan.close();
    }
}