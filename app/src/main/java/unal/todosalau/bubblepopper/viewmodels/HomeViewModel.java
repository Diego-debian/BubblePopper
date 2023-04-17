package unal.todosalau.bubblepopper.viewmodels;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.google.firebase.analytics.FirebaseAnalytics;

import unal.todosalau.bubblepopper.helpers.FirebaseAnalyticsHelper;

public class HomeViewModel extends ViewModel {
    private FirebaseAnalytics firebaseAnalytics;
    private String eventoEnviado;

    public HomeViewModel() {
        // constructor sin argumentos
    }

    public HomeViewModel(Application application) {
        firebaseAnalytics = FirebaseAnalytics.getInstance(application);
    }

    public void registrarEvento(String nombreEvento) {
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, nombreEvento);
        firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
        eventoEnviado = "Evento registrado en Firebase: " + nombreEvento;
        Log.d("Firebase", eventoEnviado );
    }

    public void logButtonClickEvent() {

        Log.d("Firebase", "Evento registrado en Firebase.");
    }
}
