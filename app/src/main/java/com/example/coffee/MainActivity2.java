package com.example.coffee;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.coffee.ui.main.SectionsPagerAdapter;
import com.example.coffee.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);

        tabs.getSelectedTabPosition();
        tabs.getTabAt(0).setIcon(R.drawable.img_1);
        tabs.getTabAt(1).setIcon(R.drawable.img_2);
        tabs.getTabAt(2).setIcon(R.drawable.img_3);
        tabs.getTabAt(3).setIcon(R.drawable.img);

        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition()==0) {
                    tab.setIcon(R.drawable.img_3);
                }else if (tab.getPosition()==1){
                        tab.setIcon(R.drawable.img_2);
                }else if (tab.getPosition()==1){
                    tab.setIcon(R.drawable.img_1);
                }else if (tab.getPosition()==1){
                    tab.setIcon(R.drawable.img);
            }}

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                if (tab.getPosition()==0) {
                    tab.setIcon(R.drawable.img_3);
                }else if (tab.getPosition()==1){
                    tab.setIcon(R.drawable.img_2);
                }else if (tab.getPosition()==1){
                    tab.setIcon(R.drawable.img_1);
                }else if (tab.getPosition()==1){
                    tab.setIcon(R.drawable.img);

            }}

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                if (tab.getPosition()==0) {
                    tab.setIcon(R.drawable.img_3);
                }else if (tab.getPosition()==1){
                    tab.setIcon(R.drawable.img_2);
                }else if (tab.getPosition()==1){
                    tab.setIcon(R.drawable.img_1);
                }else if (tab.getPosition()==1) {
                    tab.setIcon(R.drawable.img);
                }}

        });




    }

}