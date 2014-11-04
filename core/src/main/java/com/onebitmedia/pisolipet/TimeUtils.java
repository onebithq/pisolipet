package com.onebitmedia.pisolipet;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeUtils {

    public static final String MYSQL_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static String formatMySqlTime(String dateString, String format) {
        try {
            Date date = new SimpleDateFormat(MYSQL_FORMAT, Locale.UK)
                    .parse(dateString);

            return new SimpleDateFormat(format, Locale.UK).format(date);
        } catch (Exception e) {
            return new SimpleDateFormat(format, Locale.UK).format(new Date());
        }
    }
}
