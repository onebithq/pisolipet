package com.onebitmedia.pisolipet;

import android.view.View;

import java.util.List;

public class ViewUtils {

    /**
     * @param view       target view
     * @param isVisible  is the view visible?
     * @param notVisible either {@link View.INVISIBLE} or {@link View.GONE}
     */
    public static void setVisibility(View view, boolean isVisible, int notVisible) {
        if (isVisible)
            view.setVisibility(View.VISIBLE);
        else
            view.setVisibility(notVisible);
    }

    public static void toggleVisibility(View view, int notVisible) {
        if (view.getVisibility() == View.VISIBLE)
            view.setVisibility(notVisible);
        else
            view.setVisibility(View.VISIBLE);
    }

    public static void apply(List<View> views, Operation operation) {
        for (View view : views)
            operation.apply(view);
    }

    public static void apply(View[] views, Operation operation) {
        for (View view : views)
            operation.apply(view);
    }

    public static interface Operation {
        public void apply(View view);
    }
}
