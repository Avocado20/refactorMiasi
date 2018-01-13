package test.main.com.bartoszwalter.students.taxes;


import com.bartoszwalter.students.taxes.Skladki.ZestawSkladek;
import com.bartoszwalter.students.taxes.StopyPodatkowe.StopyPodatkowe;
import com.bartoszwalter.students.taxes.Umowy.Umowa;
import com.bartoszwalter.students.taxes.Umowy.UmowaOPrace;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UmowaOPraceTest {

    private double PODSTAWA = 4000;
    private double STOPA_UBEZPIECZENIA_EMERYTALNEGO = 9.76;
    private double STOPA_UBEZPIECZENIA_RENTOWE = 1.5;
    private double STOPA_UBEZPIECZENIA_CHOROBOWE = 2.45;
    private double STOPA_UBEZPIECZENIA_ZDROWOTNEGO = 9.00;

    private double KWOTA_WOLNA_OD_PODATKU = 3091;

    private double SPODZIIEWANA_SKLADKA_EMERYTALNA = 390.40;
    private double SPODZIEWANIA_SKLADKA_RENTOWA = 60;
    private double SPODZIEWANA_SKLADKA_CHOROBOWA = 98;
    private double SPODZIEWANA_SKLADKA_ZDROWOTNA = 310.64;

    private String SKLADKA_EMERYTALNA = "SKLADKA_EMERYTALNA";
    private String SKLADKA_RENTOWA = "SKLADKA_RENTOWA";
    private String SKLADKA_CHOROBOWA = "SKLADKA_CHOROBOWA";
    private String SKLADKA_ZDROWOTNA = "SKLADKA_ZDROWOTNA";

    @Test
    public void ubezpieczeniaEmertyalneTest() {
        StopyPodatkowe stopyPodatkowe = new StopyPodatkowe(STOPA_UBEZPIECZENIA_EMERYTALNEGO, STOPA_UBEZPIECZENIA_RENTOWE, STOPA_UBEZPIECZENIA_CHOROBOWE, STOPA_UBEZPIECZENIA_ZDROWOTNEGO);
        Umowa umowaOPrace = new UmowaOPrace(stopyPodatkowe);
        umowaOPrace.ustawPodstawe(PODSTAWA);
        umowaOPrace.obliczSkladki();
        ZestawSkladek zestawSkladek = umowaOPrace.pobierzKwotySkladek();
        assertEquals(SPODZIIEWANA_SKLADKA_EMERYTALNA, zestawSkladek.get(SKLADKA_EMERYTALNA), 0.01);
        assertEquals(SPODZIEWANIA_SKLADKA_RENTOWA, zestawSkladek.get(SKLADKA_RENTOWA), 0.01);
        assertEquals(SPODZIEWANA_SKLADKA_CHOROBOWA, zestawSkladek.get(SKLADKA_CHOROBOWA), 0.01);
        assertEquals(SPODZIEWANA_SKLADKA_ZDROWOTNA, zestawSkladek.get(SKLADKA_ZDROWOTNA), 0.01);
    }

}
