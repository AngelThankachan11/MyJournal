package com.w9556358.myjournal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AddEntry extends AppCompatActivity {
    public ActionBar aBar;
    public BottomNavigationView navView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addentry);

        Button savebtn = findViewById(R.id.button5);
        savebtn.setOnClickListener(view -> {
            Intent i1 = new Intent(AddEntry.this, MainActivity.class);
            startActivity(i1);
            finish();
        });

        Button cancelbtn = findViewById(R.id.button6);
        savebtn.setOnClickListener(view -> {
            Intent i2 = new Intent(AddEntry.this, MainActivity.class);
            startActivity(i2);
            finish();
        });



        BottomNavigationView.OnNavigationItemSelectedListener selectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
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
        };
    }
}
