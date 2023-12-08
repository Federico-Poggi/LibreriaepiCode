package federicoPoggi.Functional_interface;

import java.time.LocalDate;

@FunctionalInterface
public interface RandomDateGenerator {
    public LocalDate randomDataGen();
}
