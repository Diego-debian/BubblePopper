package unal.todosalau.bubblepopper.helpers;

import android.content.Context;
import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics;

public class FirebaseAnalyticsHelper {private final FirebaseAnalytics firebaseAnalytics;

    public FirebaseAnalyticsHelper(Context context) {
        firebaseAnalytics = FirebaseAnalytics.getInstance(context);
    }

    public void logButtonClickEvent() {
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "Button Clicked");
        firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    }
}