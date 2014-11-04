package com.onebitmedia.pisolipet;

import java.util.Arrays;
import java.util.List;

/**
 * Created by akhyar
 */
public class StringUtils {

    public static String implode(String delimiter, List<String> strings) {
        StringBuilder b = new StringBuilder();
        if (strings != null && strings.size() > 0) {
            if (strings.get(0) != null)
                b.append(strings.get(0));
            for (int i = 1; i < strings.size(); i++) {
                b.append(delimiter);
                if (strings.get(i) != null)
                    b.append(strings.get(i));
            }
        }

        return b.toString();
    }

    public static String implode(String delimiter, String... strings) {
        return implode(delimiter, Arrays.asList(strings));
    }

    public static boolean isEmpty(String string) {
        return string == null || string.isEmpty();
    }
}
