package pingan.com.demo_4203;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private MyPopSeekBar selectstand_layout04_seekBar01;
    private TextView selectstand_layout04_text01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        selectstand_layout04_seekBar01 = (MyPopSeekBar)  findViewById(R.id.selectstand_layout04_seekBar01);
        selectstand_layout04_text01 = (TextView)  findViewById(R.id.selectstand_layout04_text01);
        selectstand_layout04_seekBar01.setProgress(50);

        selectstand_layout04_seekBar01.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                selectstand_layout04_seekBar01.setSeekBarText(String.valueOf(progress));
//                selectstand_layout04_text01.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
//        aaa.setProgress(50);
//        aaa.setText(70+"%");
    }
//    public void onProgressChanged(SeekBar seekBar, int progress,
//                                  boolean fromUser) {
//        // TODO Auto-generated method stub
//        selectstand_layout04_seekBar01.setSeekBarText(String.valueOf(progress));
//        selectstand_layout04_text01.setText(String.valueOf(progress));
//    }

//    // 当用户开始滑动滑块的时候，调用此方法
//    @Override
//    public void onStartTrackingTouch(SeekBar seekBar) {
//        // TODO Auto-generated method stub
//    }
//
//    // 当用户停止滑动滑块的时候，调用此方法
//    @Override
//    public void onStopTrackingTouch(SeekBar seekBar) {
//        // TODO Auto-generated method stub
//    }

}
