package id.ac.polinema.projectuas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HalamanUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_utama);
    }

    public void handlerClickLogin(View view) {
    }

    public void handlerClickRegistrasi(View view) {
        Intent intent = new Intent(this, HalamanRegister.class);
        startActivity(intent);
    }
}
