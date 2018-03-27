import drivers.Produs;
import org.junit.Assert;
import org.junit.Test;
import drivers.*;
import java.util.ArrayList;
import java.util.Random;

import static org.hamcrest.CoreMatchers.is;


public class AplicatieTest {

    private Aplicatie aplicatie = new Aplicatie();

    @Test
    public void testOrdoneaza_daca_ordinea_e_gresita() {
        ArrayList<Produs> listaProduse = new ArrayList<Produs>();
        Random random = new Random();

        for (int i = 0; i < 15; i ++) {
            int pret = random.nextInt() % 15;
            Produs produs = new Produs(pret, "Produsul " + pret);
            listaProduse.add(produs);
        }

        listaProduse = aplicatie.ordoneaza(listaProduse);

        for (int i = 0; i < 15; i ++) {
            Assert.assertThat(33, is(listaProduse.get(i).getPret()));
        }
    }

    @Test
    public void testAdaugaProd() {
        Produs produs1 = new Produs(20, "Aspirator");
        Produs produs2 = new Produs(33, "Monitor");
        Produs produs3 = new Produs(4, "Castravete");

        Cos cos = new Cos();

        cos.adaugaProdus(produs1);
        cos.adaugaProdus(produs2);
        cos.adaugaProdus(produs3);

        Assert.assertThat(produs1, is(cos.getProdus("Aspirator")));
        Assert.assertThat(produs2, is(cos.getProdus("Monitor")));
        Assert.assertThat(produs3, is(cos.getProdus("Castravete")));
    }


}
