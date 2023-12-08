package federicoPoggi.enteties;

import federicoPoggi.PERIODICITA;

import java.time.LocalDate;

public class NewsPaper extends Article{
    private PERIODICITA periodicita;
    public NewsPaper(String title, LocalDate yearPublication, int pageNumber, PERIODICITA periodicita){
        super(title,yearPublication,pageNumber);
        this.periodicita=periodicita;
    }

    /*GETTERS AND SETTERS*/

    public PERIODICITA getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(PERIODICITA periodicita) {
        this.periodicita = periodicita;
    }
}
