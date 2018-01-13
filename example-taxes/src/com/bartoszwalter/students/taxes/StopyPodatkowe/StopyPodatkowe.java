package com.bartoszwalter.students.taxes.StopyPodatkowe;

import java.util.HashMap;
import java.util.Map;

public class StopyPodatkowe {

    protected Map<String, Double> stopyObciazen = new HashMap<>();
    protected double stopaUbezpieczeniaEmerytalnego;
    protected double stopaUbezpieczeniaRentowego;
    protected double stopaUbezpieczeniaChorobowego;

    public StopyPodatkowe(double stopaUbezpieczeniaEmerytalnego, double stopaUbezpieczeniaRentowego, double stopaUbezpieczeniaChorobowego, double stopaUbezpieczenZdrowotnych) {
        stopyObciazen.put("SKLADKA_EMERYTALNA", stopaUbezpieczeniaEmerytalnego);
        stopyObciazen.put("SKLADKA_RENTOWA", stopaUbezpieczeniaRentowego);
        stopyObciazen.put("SKLADKA_CHOROBOWA", stopaUbezpieczeniaChorobowego);
        stopyObciazen.put("SKLADKA_ZDROWOTNA", stopaUbezpieczenZdrowotnych);
    }

    public Double pobierzStope(String klucz) {
        return stopyObciazen.get(klucz);
    }

}
