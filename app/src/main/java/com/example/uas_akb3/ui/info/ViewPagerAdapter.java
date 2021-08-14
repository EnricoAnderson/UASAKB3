package com.example.uas_akb3.ui.info;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;
// Dibuat oleh 10118353 Enrico Anderson IF8 pada 14 Agustus 2021
public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> pages;

    public ViewPagerAdapter(FragmentManager fm, List<Fragment> pages){
        super(fm);
        this.pages = pages;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        return this.pages.get(position);
    }

    @Override
    public int getCount() {
        return this.pages.size();
    }
}
