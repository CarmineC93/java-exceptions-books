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

            String title = "";
            System.out.print("Title: ");
            try{
                title = scan.nextLine();
            }catch(InputMismatchException e){
                System.out.println("Input non valido: deve essere una stringa");
            }

            int pages = 0;
            System.out.print("Pages: ");
            try{pages = Integer.parseInt(scan.nextLine());
            }catch (InputMismatchException e){
                System.out.println("Input non valido: deve essere un numero intero");
            }

            String author = "";
            System.out.print("Author: ");
            try {
                author = scan.nextLine();
            }catch(InputMismatchException e){
                System.out.println("Input non valido: deve essere una stringa");
            }

            String editor = "";
            System.out.print("Editor: ");
            try{
                 editor = scan.nextLine();
            }catch(InputMismatchException e){
                System.out.println("Input non valido: deve essere una stringa");
            }

            books[i] = new Book(title, pages, author, editor);

        }

        System.out.println(Arrays.toString(books));

    }
}