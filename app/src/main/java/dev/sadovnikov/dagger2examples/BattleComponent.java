package dev.sadovnikov.dagger2examples;

import dagger.Component;

@Component
public interface BattleComponent {
    War getWar();
}
