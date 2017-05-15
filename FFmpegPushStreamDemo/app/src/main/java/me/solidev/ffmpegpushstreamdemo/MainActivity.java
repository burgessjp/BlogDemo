package me.solidev.ffmpegpushstreamdemo;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import java.io.File;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String inputUrl = Environment.getExternalStorageDirectory().getAbsolutePath() +"/pushvideo.mp4";
        String outputUrl = "rtmp://www.test.com.cn/live/test";
        Log.e("zzz", inputUrl);

        File file=new File(inputUrl);
        Log.e("zzz","file:"+file.exists());
        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText(FFmpegPushStream.pushStream(inputUrl, outputUrl) + "");
    }

}
