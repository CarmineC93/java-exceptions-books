import java.util.Arrays;
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

            System.out.print("Pages: ");
            int pages = Integer.parseInt(scan.nextLine());

            System.out.print("Author: ");
            String author = scan.nextLine();

            System.out.print("Editor: ");
            String editor = scan.nextLine();

            books[i] = new Book(title, pages, author, editor);

        }

        System.out.println(Arrays.toString(books));

    }
}