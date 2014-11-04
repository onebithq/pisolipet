package com.onebitmedia.pisolipet;

import android.content.Context;
import android.net.ConnectivityManager;

public class NetUtils {

	public static boolean isNetworkAvailable(Context context) {
		return ((ConnectivityManager) context
				.getSystemService(Context.CONNECTIVITY_SERVICE))
				.getActiveNetworkInfo() != null;
	}

}
