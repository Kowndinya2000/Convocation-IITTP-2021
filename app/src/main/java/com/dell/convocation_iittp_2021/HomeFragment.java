package com.dell.convocation_iittp_2021;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        CardView cardView1 = view.findViewById(R.id.c1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ConvocationProgramme.class);
                startActivity(intent);
            }
        });
        CardView cardView2 = view.findViewById(R.id.c2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ChiefGuest.class);
                startActivity(intent);
            }
        });
        CardView cardView3 = view.findViewById(R.id.c3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BoardOfGovernors.class);
                startActivity(intent);
            }
        });
        CardView cardView4 = view.findViewById(R.id.c4);
        cardView4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Senate.class);
                startActivity(intent);
            }
        });
        CardView cardView5 = view.findViewById(R.id.c5);
        cardView5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), GraduandsList.class);
                startActivity(intent);
            }
        });
        CardView cardView6 = view.findViewById(R.id.c6);
        cardView6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://iittp.ac.in/convocation2021"));
                startActivity(intent);
            }
        });
        CardView cardView7 = view.findViewById(R.id.c7);
        cardView7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AboutIITTirupati.class);
                startActivity(intent);
            }
        });
        CardView cardView8 = view.findViewById(R.id.c8);
        cardView8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), InstituteAwards.class);
                startActivity(intent);
            }
        });
        CardView cardView9 = view.findViewById(R.id.c9);
        cardView9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), OurLogo.class);
                startActivity(intent);
            }
        });
        CardView cardView10 = view.findViewById(R.id.c10);
        cardView10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Pledge.class);
                startActivity(intent);
            }
        });
        CardView cardView11 = view.findViewById(R.id.c11);
        cardView11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ConvocationCommittee.class);
                startActivity(intent);
            }
        });
        CardView cardView12 = view.findViewById(R.id.c12);
        cardView12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DirectorsReport.class);
                startActivity(intent);
            }
        });
        CardView cardView22 = view.findViewById(R.id.c22);
        cardView22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ChiefGuestsAddress.class);
                startActivity(intent);
            }
        });
        CardView cardView13 = view.findViewById(R.id.c13);
        cardView13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ConvocationAttire.class);
                startActivity(intent);
            }
        });

        return view;
    }
}