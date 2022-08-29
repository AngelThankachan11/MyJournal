package com.w9556358.myjournal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.FragmentTransaction;




public class MainActivity extends AppCompatActivity {


    public ActionBar aBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
                btn.setOnClickListener(view -> {
                    Intent i = new Intent(MainActivity.this, AddEntry.class);
                    startActivity(i);
                    finish();
                });
        }


            @SuppressLint("NonConstantResourceId")
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {

                    case R.id.nav_home:
                        aBar.setTitle("Home");
                        HomeFragment fragment = new HomeFragment();
                        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.control, fragment, "");
                        fragmentTransaction.commit();
                        return true;

                    case R.id.nav_add:
                        aBar.setTitle("Profile");
                        AddNavFragment fragment1 = new AddNavFragment();
                        FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction1.replace(R.id.control, fragment1);
                        fragmentTransaction1.commit();
                        return true;

                }
                return false;
            }

}