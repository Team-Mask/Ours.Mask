package id.ac.polinema.projectuas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HalamanRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_register);
    }

    public void handlerRegister(View view) {
        Intent intent = new Intent(this, HalamanUtama.class);
        startActivity(intent);
    }
}
