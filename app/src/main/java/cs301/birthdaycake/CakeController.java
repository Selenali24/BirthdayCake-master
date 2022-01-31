package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener{

    //Instance variables
    private static CakeView cakeView;
    private static CakeModel cakeModel;

    public CakeController(CakeView cView) {
        cakeModel = cView.getCakeModel();
        System.out.println(cakeModel);
        cakeView = cView;
    }

    @Override
    public void onClick(View v) {
        if(cakeModel.isLit) {
            cakeModel.isLit = false;
        }
        else {
            cakeModel.isLit = true;
        }
        Log.d("BlowButton", "Blow out!");
        cakeView.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        cakeModel.hasCandles = isChecked;
        cakeView.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        cakeModel.numCandles = progress;
        cakeView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
