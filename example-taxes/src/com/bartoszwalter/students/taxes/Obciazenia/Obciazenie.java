package com.bartoszwalter.students.taxes.Obciazenia;

public abstract class Obciazenie {

    protected String NAZWA_OBCIĄŻENIA;
    protected double stopaObciazenia;

    public Obciazenie(String nazwaObciazenia, double kwotaObciazenia) {
        this.NAZWA_OBCIĄŻENIA = nazwaObciazenia;
        this.stopaObciazenia = kwotaObciazenia;
    }

    public String pobierzNazwe() {
        return this.NAZWA_OBCIĄŻENIA;
    }

    public double pobierzStopeObciazenia() {
        return this.stopaObciazenia;
    }

    public double obliczObciazenia(double podstawaObciazenia) {
        return podstawaObciazenia * stopaObciazenia * 0.01;
    }
}
