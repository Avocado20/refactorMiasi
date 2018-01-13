package com.bartoszwalter.students.taxes.Obciazenia;

public class SkladkaZdrowotna extends Obciazenie {

    public SkladkaZdrowotna(double stopaZdrowotona, double stopaEmerytalna, double stopaRentowa, double stopaChorobowa) {
        super("SKLADKA_ZDROWOTNA", stopaChorobowa);
        double sumaSkladekOdPodstawyBrutto = stopaEmerytalna + stopaRentowa + stopaChorobowa;
        double stopaChorobowaOdPodstawyBrutto = 100 - sumaSkladekOdPodstawyBrutto;
        this.stopaObciazenia = stopaChorobowaOdPodstawyBrutto * stopaZdrowotona * 0.01;
    }
}
