import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    //salvo variabile del filePath
    private final static String FilePath = "./booksList.txt";

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
                //evitabile: il n. di pagine resterà 0 in caso di errore e stamperà il messaggio del catch che prende il costruttore
                System.out.println("Number of pages must be >0");
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



        //scrivo l'array di libri su file
        FileWriter myLibrary = null;
        try{
            myLibrary = new FileWriter(FilePath);
            for(Book currentBook : books){
                myLibrary.write(currentBook.toString()+ "\n");
            }

        } catch (IOException e) {
            System.out.println("Impossible to create file");
            System.out.println(e.getMessage());
        }finally {
            if(myLibrary != null){
                try{
                    myLibrary.close();
                }catch(IOException e){
                    //poichè non è possibile gestire l'assenza di file si usa questa eccezione
                    throw new RuntimeException(e);
                }
            }
        }

        //lettura del file
        Scanner fileScanner = null;
        try {
            //lettura del file tramite Scanner
            fileScanner = new Scanner( new File(FilePath));
            //finchè il file ha altre linee, andrà a leggere la successiva
            while(fileScanner.hasNext()){
             String line = fileScanner.nextLine();
             //stampo il contenuto del file
                System.out.println(line);
            }
        }catch(FileNotFoundException e){
            throw new RuntimeException(e);
        }finally {
            if (fileScanner != null) {
                try {
                    fileScanner.close();
                } catch (IllegalStateException ise) {
                    ise.printStackTrace();
                }
            }
        }

    }
}