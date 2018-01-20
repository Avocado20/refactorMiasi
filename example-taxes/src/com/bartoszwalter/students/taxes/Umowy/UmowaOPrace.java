package com.bartoszwalter.students.taxes.Umowy;

import com.bartoszwalter.students.taxes.Obciazenia.*;
import com.bartoszwalter.students.taxes.Skladki.ZestawSkladek;
import com.bartoszwalter.students.taxes.StopyPodatkowe.StopyPodatkowe;

public class UmowaOPrace extends Umowa {

    public UmowaOPrace(StopyPodatkowe stopyPodatkowe) {
        super(stopyPodatkowe);
        this.obciazenia.add(new SkladkaEmerytalna(stopyPodatkowe.pobierzStope("SKLADKA_EMERYTALNA")));
        this.obciazenia.add(new SkladkaRentowa(stopyPodatkowe.pobierzStope("SKLADKA_RENTOWA")));
        this.obciazenia.add(new SkladkaChorobowa(stopyPodatkowe.pobierzStope("SKLADKA_CHOROBOWA")));
        this.obciazenia.add(new SkladkaZdrowotna(stopyPodatkowe.pobierzStope("SKLADKA_ZDROWOTNA"), stopyPodatkowe.pobierzStope("SKLADKA_EMERYTALNA"),
                stopyPodatkowe.pobierzStope("SKLADKA_RENTOWA"), stopyPodatkowe.pobierzStope("SKLADKA_CHOROBOWA")));
    }

    @Override
    public void obliczSkladki() {
        ZestawSkladek zestawSkladek = new ZestawSkladek();
        for (Obciazenie obciazenie : this.obciazenia) {
            zestawSkladek.dodajSkladke(obciazenie.pobierzNazwe(), obciazenie.obliczObciazenia(this.podstawaOpodatkowa));
        }
        this.zestawSkladek = zestawSkladek;
    }
}
