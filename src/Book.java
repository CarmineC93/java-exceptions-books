import java.math.BigDecimal;

public class Book {

    //ATTRIBUTES
    private String title;
    private int pages;
    private String author;
    private String editor;

/*   Scrivere un programma che inserisce n libri in un array.
    Chiede i dati di un libro
     (titolo, numero pagine, autore, editore), istanzia un nuovo oggetto della classe Book e lo inserisce nell’array.
    Lo fa per il numero di elementi previsti nell’array.
    Quando vengono inseriti i dati, verificare che siano corretti
    (es. non accettare titolo o autore o editore vuoto, numero pagine ≤ 0). Se ci sono errori,
    lanciare un’eccezione e gestirla mostrando a video il tipo di errore.
    Implementare i getter e setter di tutti gli attributi del libro gestendo anche
    in questo caso eventuali errori di dati non corretti (che generano quindi eccezione).
    Al termine dell’inserimento scrivere tutti i dati dei libri in un file e in seguito rileggerli dal file e mostrarli a video.*/

    //CONSTRUCTORS

    public Book (String title, int pages, String author, String editor) throws IllegalArgumentException{
        setTitle(title);
        setPages(pages);
        setAuthor(author);
        setEditor(editor);
    }

    //GETTER & SETTER
    public void setTitle(String title){
        checkString(title);
        this.title = title;
    }

    public void setPages(int pages) {
        checkInt(pages);
        this.pages = pages;
    }

    public void setAuthor(String author) {
        checkString(author);
        this.author = author;
    }

    public void setEditor(String editor) {
        checkString(editor);
        this.editor = editor;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public String getAuthor() {
        return author;
    }

    public String getEditor() {
        return editor;
    }

    //METHOD

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                ", editor='" + editor + '\'' +
                '}';
    }

    public void checkString(String textField) throws IllegalArgumentException{
        if (textField.equals("")){
            throw new IllegalArgumentException("The field must not be void");
        }
    }
    public void checkInt(int pagesNumber) throws IllegalArgumentException{
        if (pagesNumber <= 0){
            throw new IllegalArgumentException("number of pages needs to be > 0");
        }
    }
}
