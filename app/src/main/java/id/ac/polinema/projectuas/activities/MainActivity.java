package id.ac.polinema.projectuas.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import id.ac.polinema.projectuas.R;
import id.ac.polinema.projectuas.fragments.JenisMukaFragment;
import id.ac.polinema.projectuas.fragments.MaskerFragment;
import id.ac.polinema.projectuas.fragments.PemesananFragment;
import id.ac.polinema.projectuas.fragments.UserFragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(new JenisMukaFragment());
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        // beri listener pada saat item/menu bottomnavigation terpilih
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .addToBackStack(null)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;
        switch (menuItem.getItemId()) {
            case R.id.action_jenisMuka:
                fragment = new JenisMukaFragment();
                break;
            case R.id.action_masker:
                fragment = new MaskerFragment();
                break;
            case R.id.action_pemesanan:
                fragment = new PemesananFragment();
                break;
//            case R.id.action_user:
//                fragment = new UserFragment();
//                break;
        }
        return loadFragment(fragment);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
