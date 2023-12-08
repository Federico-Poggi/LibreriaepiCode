package federicoPoggi;
import federicoPoggi.enteties.TerminalClassInput;
import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.reader.impl.history.DefaultHistory;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

import com.github.javafaker.Faker;
import federicoPoggi.Functional_interface.RandomDateGenerator;
import federicoPoggi.enteties.BookNew;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.logging.Logger;

public class Application {
    static TerminalClassInput getInput=new TerminalClassInput();
    private static final Logger log=Logger.getLogger(Application.class.getName());
    static Random rand=new Random();

    public static void main(String[] args) throws IOException {
        RandomDateGenerator randomData=()->{
            int yyyy=rand.nextInt(124)+1900;
            int mm=rand.nextInt(12)+1;
            int dd=rand.nextInt(LocalDate.of(yyyy, mm, 1).lengthOfMonth()) + 1;

            return LocalDate.of(yyyy,mm,dd);
        };
        Faker faker=new Faker();
        Supplier<BookNew> bookSuplier=()-> new BookNew (faker.book().title(), randomData.randomDataGen(),rand.nextInt(1,1000) ,
                faker.book().author(), faker.book().genre());
        List<BookNew> library=new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            library.add(bookSuplier.get());
            log.info("Libro creato");
        }
        library.forEach(System.out::println);
        log.warning("Creato lista libri.");

        /*------ AGGIUNTA DI UN ELEMENTO ALLA LIBRERIA ---------*/
        {
            getInput.getInput();
        }



    }
}
