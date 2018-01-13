package com.bartoszwalter.students.taxes.Umowy;


import com.bartoszwalter.students.taxes.Obciazenia.Obciazenie;
import com.bartoszwalter.students.taxes.Skladki.ZestawSkladek;
import com.bartoszwalter.students.taxes.Skladki.ZestawUlg;
import com.bartoszwalter.students.taxes.StopyPodatkowe.StopyPodatkowe;

import java.util.ArrayList;
import java.util.List;

public abstract class Umowa {

    protected StopyPodatkowe stopyPodatkowe;
    protected double podstawaOpodatkowa;
    protected ZestawSkladek zestawSkladek;
    protected ZestawUlg zestawUlg = new ZestawUlg();
    protected List<Obciazenie> obciazenia;

    public Umowa (StopyPodatkowe stopyPodatkowe) {
        obciazenia = new ArrayList<>();
        this.stopyPodatkowe = stopyPodatkowe;
    }

    public boolean ustawPodstawe(double podstawa) {
        this.podstawaOpodatkowa = podstawa;
        return true;
    }

    public boolean ustawStopyPodatkowe(StopyPodatkowe stopyPodatkowe) {
        this.stopyPodatkowe = stopyPodatkowe;
        return true;
    }

    public abstract void obliczSkladki();

    public ZestawSkladek pobierzKwotySkladek() {
        return this.zestawSkladek;
    };
}
