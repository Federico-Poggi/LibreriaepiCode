package federicoPoggi.enteties;

import com.sun.source.tree.BreakTree;
import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.reader.impl.history.DefaultHistory;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TerminalClassInput {
    public void getInput () throws IOException {
        try {
            Terminal terminal = TerminalBuilder.builder().build();

            LineReader lineReader = LineReaderBuilder.builder()
                    .terminal(terminal)
                    .history(new DefaultHistory())
                    .build();
            ;
            List<String> option = new ArrayList<>();
            option.add("AGGIUNGI ELEMENTO - digitare: + ");
            option.add("RIMUOVERE UN ELEMENTO - digitare - ");
            option.add("RICERCA Per anno di pubblicazione - digitare R ");
            option.add("RICERCA per Autore - digitare A ");
            System.out.println("Azioni disponibili");
            for (int i = 0; i < option.size(); i++) {
                System.out.println(i + "- " + option.get(i));
            }
            ;

            String userInput = " ";

            while (true) {
                System.out.println("Digita 'exit' per uscire.");
                userInput = lineReader.readLine("--> ");
                if ("exit".equals(userInput)) {
                    break;
                } else {
                    System.out.println("Hai scritto: " + userInput);
                }
            }
        } catch (IOException e) {
            throw new IOException(e);
        }

    }
}
