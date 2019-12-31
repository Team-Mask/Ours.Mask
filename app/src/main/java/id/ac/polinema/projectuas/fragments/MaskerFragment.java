package id.ac.polinema.projectuas.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import id.ac.polinema.projectuas.R;
import id.ac.polinema.projectuas.activities.DetailActivity;

public class MaskerFragment extends Fragment
{

    TextView judul1, judul2, judul3, judul4, judul5, judul6, judul7;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_masker, container, false);

        judul1 = view.findViewById(R.id.judul1);
        judul2 = view.findViewById(R.id.judul2);
        judul3 = view.findViewById(R.id.judul3);
        judul4 = view.findViewById(R.id.judul4);
        judul5 = view.findViewById(R.id.judul5);
        judul6 = view.findViewById(R.id.judul6);
        judul7 = view.findViewById(R.id.judul7);

        judul1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra("code_image", "1");
                i.putExtra("title", "Mud Exclusive");
                i.putExtra("desc", " Masker ini memiliki kelebihan yaitu seperti : " +
                        "Menghilangkan kemerahan pada wajah, " +
                        "Menstimulasi Sel Kulit," +
                        "Mengeluarkan Racun yang di hasilkan oleh sisa sisa Make up pada wajah");
                startActivity(i);
            }
        });

        judul2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra("code_image", "2");
                i.putExtra("title", "Avocado Recipes");
                i.putExtra("desc", " Masker ini memiliki kelebihan yaitu seperti : " +
                        "Mencegah kerutan, " +
                        "Menyamarkan kerutan," +
                        "Menghaluskan kerutan");
                startActivity(i);
            }
        });

        judul3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra("code_image", "3");
                i.putExtra("title", "Ice Sorbet");
                i.putExtra("desc", " Masker ini memiliki kelebihan yaitu seperti : " +
                        "Melembabkan Wajah, " +
                        "Membuat wajah menjadi lebih rileks," +
                        "Mencerahkan Wajah(super)");
                startActivity(i);
            }
        });

        judul4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra("code_image", "4");
                i.putExtra("title", "Greentea Clay");
                i.putExtra("desc", " Masker ini memiliki kelebihan yaitu seperti : " +
                        "Peremajaan Kulit, " +
                        "Mengatasi Permasalahan Jerawat," +
                        "Mencerahkan Kulit," +
                        "Melembabkan Kulit");
                startActivity(i);
            }
        });

        judul5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra("code_image", "5");
                i.putExtra("title", "Honey");
                i.putExtra("desc", " Masker ini memiliki kelebihan yaitu seperti : " +
                        "Peremajaan Kulit, " +
                        "Mengatasi Permasalahan Jerawat," +
                        "Mencerahkan Kulit," +
                        "Melembabkan Kulit");
                startActivity(i);
            }
        });

        judul6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra("code_image", "6");
                i.putExtra("title", "Aloe Vera");
                i.putExtra("desc", " Masker ini memiliki kelebihan yaitu seperti : " +
                        "Peremajaan Kulit, " +
                        "Mengatasi Permasalahan Jerawat," +
                        "Mencerahkan Kulit," +
                        "Melembabkan Kulit");
                startActivity(i);
            }
        });

        judul7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra("code_image", "7");
                i.putExtra("title", "Aloe vera");
                i.putExtra("desc", " Masker ini memiliki kelebihan yaitu seperti : " +
                        "Peremajaan Kulit, " +
                        "Mengatasi Permasalahan Jerawat," +
                        "Mencerahkan Kulit," +
                        "Melembabkan Kulit");
                startActivity(i);
            }
        });
        return view;
    }
}

