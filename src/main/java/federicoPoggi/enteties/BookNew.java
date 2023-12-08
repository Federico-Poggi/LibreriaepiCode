package federicoPoggi.enteties;

import java.time.LocalDate;

public class BookNew extends Article{
    private String authors;
    private String genres;
    public BookNew(String title, LocalDate yearPublication, int pageNumber, String authors, String genres){
        super(title,yearPublication,pageNumber);
        this.authors=authors;
        this.genres=genres;
    }

    /*GETTERS AND SETTERS*/
    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    @Override
    public String toString() {
        return   "[--------"+getTitle().toUpperCase()+"--------]\n" +
                "TITOLO: "+getTitle()+"\n"+
                "AUTORE: "+ getAuthors()+"\n"+
                "GENERE:" + getGenres()+"\n"+
                "ANNO PUBBLICAZIONE: "+getPublication_date()+"\n"+
                "PAGINE: "+getPageNumber()+
                "\nISBN: "+ getISBN()*-1+
                "\n [-------------------------]";
    }
}
