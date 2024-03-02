package util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {
    static final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

    public static String formatter(LocalDateTime localDateTime){
        return timeFormatter.format(localDateTime);
    }
}
