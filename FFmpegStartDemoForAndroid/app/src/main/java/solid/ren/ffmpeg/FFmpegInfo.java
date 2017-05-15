package solid.ren.ffmpeg;

/**
 * Created by _SOLID
 * Date:2016/11/2
 * Time:17:35
 * Desc:
 */

public class FFmpegInfo {
    public static native String urlprotocolinfo();

    public static native String avformatinfo();

    public static native String avcodecinfo();

    public static native String avfilterinfo();

    public static native String configurationinfo();

    static {
        System.loadLibrary("avutil-55");
        System.loadLibrary("swresample-2");
        System.loadLibrary("avcodec-57");
        System.loadLibrary("avformat-57");
        System.loadLibrary("swscale-4");
        System.loadLibrary("avfilter-6");
        System.loadLibrary("avdevice-57");
        System.loadLibrary("ffmpeginfo");
    }
}
