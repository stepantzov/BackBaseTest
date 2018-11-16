package utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeStamp {
    public static String getTimeStampFormatted(int daysAfter, String patternFormat) {
        Date currentDate = Calendar.getInstance().getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DATE, daysAfter);

        return new SimpleDateFormat(patternFormat).format(calendar.getTime());
    }
}