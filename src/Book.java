import java.math.BigDecimal;

public class Book {

    //ATTRIBUTES
    private String title;
    private int pages;
    private String author;
    private String editor;

/*  Al termine dell’inserimento scrivere tutti i dati dei libri in un file e in seguito rileggerli dal file e mostrarli a video.*/

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
