package com.bartoszwalter.students.taxes.Skladki;

import java.util.HashMap;
import java.util.Map;

public class ZestawSkladek {

    private Map<String, Double>  zestawSkladek = new HashMap<>();

    public boolean dodajSkladke(String klucz, Double wartosc) {
        zestawSkladek.put(klucz, wartosc);
        return true;
    }

    public boolean usunSkladke(String klucz) {
        this.zestawSkladek.remove(klucz);
        return true;
    }

    public Map<String, Double> pobierzSkladki() {
        return this.zestawSkladek;
    }

    public Double get(String klucz) {
        return zestawSkladek.get(klucz);
    }
}
