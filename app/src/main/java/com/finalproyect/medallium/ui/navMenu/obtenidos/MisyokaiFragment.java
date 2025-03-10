package com.finalproyect.medallium.ui.navMenu.obtenidos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.finalproyect.medallium.databinding.FragmentMisyokaiBinding;

public class MisyokaiFragment extends Fragment {

    private FragmentMisyokaiBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MisyokaiViewModel slideshowViewModel =
                new ViewModelProvider(this).get(MisyokaiViewModel.class);

        binding = FragmentMisyokaiBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}