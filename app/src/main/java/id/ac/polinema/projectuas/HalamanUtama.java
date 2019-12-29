package id.ac.polinema.projectuas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class HalamanUtama extends AppCompatActivity {

    private EditText username, password;
    private FirebaseAuth auth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_utama);

    }

    public void handlerClickLogin(View view) {
        Intent intent = new Intent(this, MenuUtama.class);
        startActivity(intent);
    }


    public void handlerClickRegistrasi(View view) {
        Intent intent = new Intent(this, HalamanRegister.class);
        startActivity(intent);

        //menampung imputan user
        final String Username = username.getText().toString().trim();
        final String Password = password.getText().toString().trim();

        if (Username.isEmpty()) {
            username.setError("Email tidak boleh kosong");
        }
        // jika password kosong
        else if (Password.isEmpty()) {
            password.setError("Password tidak boleh kosong");
        }
        //jika password kurang dari 6 karakter
        else if (Password.length() < 6) {

        } else {
            auth.signInWithEmailAndPassword(Username, Password)
                    .addOnCompleteListener(HalamanUtama.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            // ketika gagal locin maka akan do something
                            if (!task.isSuccessful()) {
                                Toast.makeText(HalamanUtama.this,
                                        "Gagal login karena " + task.getException().getMessage()
                                        , Toast.LENGTH_LONG).show();
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putString("email", Username);
                                bundle.putString("pass", Password);
                                startActivity(new Intent(HalamanUtama.this, MainActivity.class)
                                        .putExtra("emailpass", bundle));
                                finish();
                            }
                        }
                    });
        }
    }
}
