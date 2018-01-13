package com.bartoszwalter.students.taxes.Obciazenia;

public abstract class Obciazenie {

    protected String NAZWA_OBCIĄŻENIA;
    protected double stopaObciazenia;

    public Obciazenie(String nazwaObciazenia, double stopaObciazenia) {
        this.NAZWA_OBCIĄŻENIA = nazwaObciazenia;
        this.stopaObciazenia = stopaObciazenia;
    }

    public String pobierzNazwe() {
        return this.NAZWA_OBCIĄŻENIA;
    }

    public double pobierzStopeObciazenia() {
        return this.stopaObciazenia;
    }

    public double obliczObciazenia(double podstawaObciazenia) {
        return podstawaObciazenia * this.stopaObciazenia * 0.01;
    }
}
