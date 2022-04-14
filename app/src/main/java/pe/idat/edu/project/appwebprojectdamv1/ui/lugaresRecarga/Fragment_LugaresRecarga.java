package pe.idat.edu.project.appwebprojectdamv1.ui.lugaresRecarga;

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

import pe.idat.edu.project.appwebprojectdamv1.databinding.FragmentLugaresRecargaBinding;


public class Fragment_LugaresRecarga extends Fragment {

    private FragmentLugaresRecargaViewModel lugaresRecargaViewModel;
    private FragmentLugaresRecargaBinding binding;

    public static Fragment_LugaresRecarga newInstance() {return new Fragment_LugaresRecarga();}

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        lugaresRecargaViewModel =
                new ViewModelProvider(this).get(FragmentLugaresRecargaViewModel.class);

        binding = FragmentLugaresRecargaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textLugaresRecarga;
        lugaresRecargaViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }



}