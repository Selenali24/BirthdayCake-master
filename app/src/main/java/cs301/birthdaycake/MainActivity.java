package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeView cakeView = findViewById(R.id.cakeview);
        CakeController cakeController = new CakeController(cakeView);
        Button blowButton = findViewById(R.id.blowOutButton);
        blowButton.setOnClickListener(cakeController);
        CompoundButton candleSwitch = findViewById(R.id.candlesSwitch);
        candleSwitch.setOnCheckedChangeListener(cakeController);
        SeekBar candleSeekBar = findViewById(R.id.candlesSeekBar);
        candleSeekBar.setOnSeekBarChangeListener(cakeController);

    }

    public void goodbye(View button) {
        Log.i("button", "Goodbye");
        finishAffinity();
    }
}
