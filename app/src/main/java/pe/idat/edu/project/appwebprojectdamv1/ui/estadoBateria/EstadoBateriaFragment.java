package pe.idat.edu.project.appwebprojectdamv1.ui.estadoBateria;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;

import pe.idat.edu.project.appwebprojectdamv1.databinding.FragmentEstadoBateriaBinding;


public class EstadoBateriaFragment extends Fragment {

    private EstadoBateriaViewModel estadoBateriaViewModel;
    private FragmentEstadoBateriaBinding binding;

    public static EstadoBateriaFragment newInstance() {
        return new EstadoBateriaFragment();
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        estadoBateriaViewModel =
                new ViewModelProvider(this).get(EstadoBateriaViewModel.class);

        binding = FragmentEstadoBateriaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textEstadoBateria;
        estadoBateriaViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;

        }

    }