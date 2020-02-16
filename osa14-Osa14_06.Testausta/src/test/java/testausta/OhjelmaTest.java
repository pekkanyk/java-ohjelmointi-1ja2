package testausta;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class OhjelmaTest {

    // toteuta tänne testit luokkaa Ohjelma-varten
    @Test
    public void yksiOppilasYksiPullo(){
        assertEquals("Pulloja: 1\nOppilaita: 1\nKeskiarvo: 1.0", Ohjelma.suorita(new Scanner("1\n-1")));
    }
    @Test
    public void yksiOppilasYksiPulloJaVirhelyoti(){
        assertEquals("Pulloja: 1\nOppilaita: 1\nKeskiarvo: 1.0", Ohjelma.suorita(new Scanner("1\n-3\n-1")));
    }
    @Test
    public void nollaLasketaanMukaan(){
        assertEquals("Pulloja: 1\nOppilaita: 2\nKeskiarvo: 0.5", Ohjelma.suorita(new Scanner("1\n0\n-1")));
    }
    @Test
    public void jaetaankoNollalla(){
        assertEquals("Pulloja: 0\nOppilaita: 0\nKeskiarvoa ei voida laskea", Ohjelma.suorita(new Scanner("-1")));
    }
}
