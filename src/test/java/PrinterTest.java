import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(20, 20);
    }

    @Test
    public void printerHasPaper(){
        assertEquals(20, printer.getTotalPaper());
    }

    @Test
    public void canPrintCopies(){
        printer.printCopies(10);
        assertEquals(10, printer.getTotalPaper());
    }

    @Test
    public void cannotPrintUnlessEnoughPaper(){
        printer.printCopies(25);
        assertEquals(20, printer.getTotalPaper());
    }

    @Test
    public void tonerReducesWithPaper(){
        printer.printCopies(15);
        assertEquals(5, printer.getTotalToner());
    }
}
