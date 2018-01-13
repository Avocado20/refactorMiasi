package com.bartoszwalter.students.taxes;

public interface Obliczenia {

    double obliczZaliczke(double zaliczkaNaPodatekDochdowy, double skladkiNaUbezpieczeniaZdrowotne, double kwotaZmniejszającaPodatek);
    double obliczPodatek(double podstawaOpodatkowania, double stopaPodatkowa);
    double obliczPodstawe(double podstawa, double stopaSkladekEmerytalnych, double stopaNaUbezpieczeniaRentowe);
}
