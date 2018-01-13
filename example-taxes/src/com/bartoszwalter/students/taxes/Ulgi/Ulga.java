package com.bartoszwalter.students.taxes.Ulgi;

public class Ulga {

    private String NAZWA_ZWOLNIENIA;
    private Double kwotaUlgi;

    public Ulga(String nazwaZwolnienia, double wartoscUlgi) {
        this.NAZWA_ZWOLNIENIA = nazwaZwolnienia;
        this.kwotaUlgi = wartoscUlgi;
    }
}
