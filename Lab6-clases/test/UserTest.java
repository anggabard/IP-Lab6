import drivers.Produs;
import org.junit.Assert;
import org.junit.Test;
import drivers.*;
import java.util.ArrayList;
import java.util.Random;

import static org.hamcrest.CoreMatchers.is;


public class UserTest {

    User user = new User();

    @Test
    public void testAplicaReducere() {

        Produs produs1 = new Produs(20, "Aspirator");
        int pret = produs1.getPret();


        produs1.reducere(15);

        Assert.assertThat(produs1.getPret(), is(pret * 85/100));

    }
}