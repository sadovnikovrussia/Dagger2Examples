package dev.sadovnikov.dagger2examples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BattleComponent battleComponent = DaggerBattleComponent.create();
        War war = battleComponent.getWar();
        war.prepare();
        war.report();
    }

}
