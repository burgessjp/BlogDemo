package solid.ren.ffmpeg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        tv = (TextView) findViewById(R.id.sample_text);
        findViewById(R.id.btn_urlprotocolinfo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(FFmpegInfo.urlprotocolinfo());
            }
        });
        findViewById(R.id.btn_avformatinfo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(FFmpegInfo.avformatinfo());
            }
        });
        findViewById(R.id.btn_avcodecinfo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(FFmpegInfo.avcodecinfo());
            }
        });
        findViewById(R.id.btn_avfilterinfo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(FFmpegInfo.avfilterinfo());
            }
        });
        findViewById(R.id.btn_configurationinfo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(FFmpegInfo.configurationinfo());
            }
        });
    }
}
