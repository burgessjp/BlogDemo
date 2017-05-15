package me.solidev.ffmpegpushstreamdemo;

/**
 * Created by _SOLID
 * Date:2017/5/15
 * Time:15:13
 * Desc:
 */

public class FFmpegPushStream {
    static {
        System.loadLibrary("avutil-55");
        System.loadLibrary("swresample-2");
        System.loadLibrary("avcodec-57");
        System.loadLibrary("avformat-57");
        System.loadLibrary("swscale-4");
        System.loadLibrary("avfilter-6");
        System.loadLibrary("avdevice-57");
        System.loadLibrary("ffmpegpushstream");
    }
    public static native int pushStream(String inputUrl, String outputUrl);
}
