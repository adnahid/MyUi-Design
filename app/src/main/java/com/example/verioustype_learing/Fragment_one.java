package com.example.verioustype_learing;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

import BanglaActivity.BanglaDashbord;


public class Fragment_one extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_one, container, false);
        CardView bangla = view.findViewById(R.id.bangla);
        ImageSlider image_slider = view.findViewById(R.id.image_slider);

//======================================ImageSlider============================================//
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://i.imgur.com/DvpvklR.png", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://th.bing.com/th/id/OIP.TdWOh7jpwkPiCcayHuh6OQHaEK?rs=1&pid=ImgDetMain", ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel("https://th.bing.com/th/id/OIP.OxzBr4Qh5r3_ydeK60QJngHaE-?rs=1&pid=ImgDetMain", ScaleTypes.CENTER_CROP));
        image_slider.setImageList(slideModels);
//======================================ImageSlider============================================//




        // Picasso.get().load("https://i.imgur.com/DvpvklR.png").into(bi);
        bangla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(), "Hello", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getActivity(), BanglaDashbord.class);
                startActivity(intent);

 

            }
        });



        return view;

    }



}