package unal.todosalau.bubblepopper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import unal.todosalau.bubblepopper.activities.HomeActivity;
import unal.todosalau.bubblepopper.viewmodels.HomeViewModel;

public class MainActivity extends AppCompatActivity {
    private Button launchHomeActivityButton;
    private HomeViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        launchHomeActivityButton = findViewById(R.id.button);
        viewModel = new ViewModelProvider(this).get(HomeViewModel.class);

        launchHomeActivityButton.setOnClickListener(v -> {
            viewModel.logButtonClickEvent();
            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(intent);
        });
    }
}