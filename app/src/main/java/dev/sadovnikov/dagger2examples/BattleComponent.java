package dev.sadovnikov.dagger2examples;

import dagger.Component;

@Component(modules = BraavosModule.class)
public interface BattleComponent {
    War getWar();

    Starks getStarks();

    Boltons getBoltons();

    Cash getCash();

    Soldiers getSoldiers();
}
