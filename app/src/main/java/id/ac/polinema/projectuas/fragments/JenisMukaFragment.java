package id.ac.polinema.projectuas.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.ac.polinema.projectuas.R;
import id.ac.polinema.projectuas.activities.WajahBerminyakActivity;
import id.ac.polinema.projectuas.activities.WajahJerawatActivity;
import id.ac.polinema.projectuas.activities.WajahKeringActivity;
import id.ac.polinema.projectuas.activities.WajahNormalActivity;

public class JenisMukaFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_jenis_muka, container, false);

        CardView kulit_normal =  view.findViewById(R.id.kulit_normal);
        kulit_normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), WajahNormalActivity.class );
                startActivity(in);
            }
        });

        CardView kulit_berminyak = view.findViewById(R.id.kulit_berminyak);
        kulit_berminyak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), WajahBerminyakActivity.class );
                startActivity(in);
            }
        });

        CardView kulit_kering = view.findViewById(R.id.kulit_kering);
        kulit_kering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), WajahKeringActivity.class );
                startActivity(in);
            }
        });

        CardView kulit_jerawat = view.findViewById(R.id.kulit_jerawat);
        kulit_jerawat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), WajahJerawatActivity.class );
                startActivity(in);
            }
        });

        return view;
    }
}
