package federicoPoggi.enteties;
import java.time.LocalDate;
import java.util.Random;
public class Article {
    Random rand=new Random(0);
    private int ISBN;
    private String title;
    private LocalDate publication_date;
    private int pageNumber;

    public Article (String title, LocalDate yearPublication, int pageNumber){
        this.ISBN= getRandomIsbn();
        this.title=title;
        this.publication_date=yearPublication;
        this.pageNumber=pageNumber;
    }

    static int getRandomIsbn(){
        Random rand=new Random();
        int randomnum;
        do {
            randomnum=rand.nextInt();
        }while(randomnum>0);
        return randomnum;
    }

    /*GTTER AND SETTER*/

    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getPublication_date() {
        return publication_date;
    }


    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}
