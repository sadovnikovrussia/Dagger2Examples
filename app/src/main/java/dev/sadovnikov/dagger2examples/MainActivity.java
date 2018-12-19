package dev.sadovnikov.dagger2examples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cash cash = new Cash();
        Soldiers soldiers = new Soldiers();
        BattleComponent battleComponent = DaggerBattleComponent.builder().braavosModule(new BraavosModule(cash, soldiers)).build();
        War war = battleComponent.getWar();
        war.prepare();
        war.report();

        battleComponent.getCash();
    }

}
