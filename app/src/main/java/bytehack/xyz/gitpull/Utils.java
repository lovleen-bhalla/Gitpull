package bytehack.xyz.gitpull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Utils {

    public static final Map<Integer, String> TIME_FORMATS = new HashMap<>();
    private static int counter = 0;
    public static final int TIME_FORMAT_GITHUB = ++counter;
    public static final int TIME_FORMAT_DD_MM_YY = ++counter;

    static {
        TIME_FORMATS.put(TIME_FORMAT_GITHUB, "YYYY-MM-DD'T'HH:MM:SS'Z'");
        TIME_FORMATS.put(TIME_FORMAT_DD_MM_YY, "dd-MM-yy");
    }

    public static Date getDate(String date, int format) {
        SimpleDateFormat sdf = new SimpleDateFormat(TIME_FORMATS.get(format));
        try {
            return sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String convertFormat(String date, int inFormat, int outFormat) {
        SimpleDateFormat in = new SimpleDateFormat(TIME_FORMATS.get(inFormat));
        SimpleDateFormat out = new SimpleDateFormat(TIME_FORMATS.get(outFormat));
        try {
            return out.format(Objects.requireNonNull(in.parse(date)));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
