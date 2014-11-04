package com.onebitmedia.pisolipet;

import android.content.Context;
import android.content.pm.PackageManager;

public class CameraUtils {
    public static boolean hasCamera(Context context) {
        return context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA);
    }
}
