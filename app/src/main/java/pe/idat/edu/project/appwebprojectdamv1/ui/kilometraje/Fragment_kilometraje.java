package pe.idat.edu.project.appwebprojectdamv1.ui.kilometraje;

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

import pe.idat.edu.project.appwebprojectdamv1.databinding.FragmentKilometrajeBinding;


public class Fragment_kilometraje extends Fragment {

    private FragmentKilometrajeViewModel kilometrajeViewModel;
    private FragmentKilometrajeBinding binding;

    public static Fragment_kilometraje newInstance() {return new Fragment_kilometraje();}

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        kilometrajeViewModel =
                new ViewModelProvider(this).get(FragmentKilometrajeViewModel.class);

        binding = FragmentKilometrajeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textKilometraje;
        kilometrajeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

}