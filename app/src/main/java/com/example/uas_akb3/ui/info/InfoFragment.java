package com.example.uas_akb3.ui.info;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.uas_akb3.R;

import java.util.ArrayList;
import java.util.List;
// Dibuat oleh 10118353 Enrico Anderson IF8 pada 14 Agustus 2021

public class InfoFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private ViewPager viewPager;
    private PagerAdapter Adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_info, container, false);

        viewPager = root.findViewById(R.id.viewpager);

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        List<Fragment> fragment = new ArrayList<>();
        fragment.add(new test1());
        fragment.add(new test2());

        Adapter = new ViewPagerAdapter(requireActivity().getSupportFragmentManager(), fragment);

        viewPager.setAdapter(Adapter);
    }
}