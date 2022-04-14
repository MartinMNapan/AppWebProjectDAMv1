package pe.idat.edu.project.appwebprojectdamv1.ui.pagos;

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

import pe.idat.edu.project.appwebprojectdamv1.databinding.FragmentPagosBinding;


public class Fragment_pagos extends Fragment {

    private FragmentPagosViewModel pagosViewModel;
    private FragmentPagosBinding binding;

    public static Fragment_pagos newInstance() {return new Fragment_pagos();}

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        pagosViewModel =
                new ViewModelProvider(this).get(FragmentPagosViewModel.class);

        binding = FragmentPagosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textPagos;
        pagosViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }



}