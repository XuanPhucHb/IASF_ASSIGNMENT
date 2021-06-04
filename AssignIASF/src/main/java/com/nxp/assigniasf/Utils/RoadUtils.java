package com.nxp.assigniasf.Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RoadUtils {
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public static final int BUIDING = 0;
    public static final int USING = 1;
    public static final int REPARING = 2;

    public static String convertMLS2String(Long timeMLS) {
        return sdf.format(new Date(timeMLS));
    }

    public static String convertStatus(int status) {
        return status == BUIDING ? "Building" : (status == USING ? "Using" :
                (status == REPARING ? "Reparing" : "Undefine"));
    }
}
