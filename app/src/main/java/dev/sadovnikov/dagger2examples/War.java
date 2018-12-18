package dev.sadovnikov.dagger2examples;

import javax.inject.Inject;

public class War {

    Starks starks;
    Boltons boltons;

    @Inject
    public War(Starks starks, Boltons boltons) {
        this.starks = starks;
        this.boltons = boltons;
    }

    void prepare() {
        starks.prepareForBattle();
        boltons.prepareForBattle();
    }

    void report() {
        starks.reportForBattle();
        starks.reportForBattle();
    }
}
