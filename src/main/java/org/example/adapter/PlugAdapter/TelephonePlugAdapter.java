package org.example.adapter.PlugAdapter;

import org.example.adapter.ElectricHouseholdAppliances;

public class TelephonePlugAdapter implements ElectricHouseholdAppliances {

    private final Telephone telephone;

    public TelephonePlugAdapter(Telephone telephone) {
        this.telephone = telephone;
    }

    @Override
    public int plugStartWorking() {
        return telephone.chargeIt();
    }
}
