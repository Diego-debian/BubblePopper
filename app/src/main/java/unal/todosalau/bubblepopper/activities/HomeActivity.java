package unal.todosalau.bubblepopper.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import unal.todosalau.bubblepopper.databinding.ActivityHomeBinding;
import unal.todosalau.bubblepopper.viewmodels.HomeViewModel;

public class HomeActivity extends AppCompatActivity {

    private ActivityHomeBinding binding;
    private HomeViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = new ViewModelProvider(this).get(HomeViewModel.class);

        binding.button.setOnClickListener(v -> {
            viewModel.logButtonClickEvent();
        });
    }
}