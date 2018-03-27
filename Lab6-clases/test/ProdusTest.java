
import drivers.Produs;
import org.junit.Assert;
import org.junit.Test;
import drivers.*;
import java.util.ArrayList;
import java.util.Random;

import static org.hamcrest.CoreMatchers.is;


public class ProdusTest {


    @Test
    public void testAplicaReducere() {

        Produs produs1 = new Produs(20, "Aspirator");

        produs1.aplicaReducere(15);
    }
}
