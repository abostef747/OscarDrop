package com.weebly.mustafamk.oscardrop;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.*;

public class Detailed_information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_information);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //---------------------------------------------------------------------------------
        ImageView animalPortrait =(ImageView) findViewById(R.id.animal_portrait);
        TextView animalHeadline =(TextView) findViewById(R.id.animal_headline);
        TextView animalDescription =(TextView) findViewById(R.id.animal_description);

        Intent intent = getIntent();
        String animalToDisplay = intent.getStringExtra("animal");

        //skapa en Zoo

        AnimalZoo theZoo = new AnimalZoo();

        //hämta ut zoo

        Animal animal = theZoo.getAnimal(animalToDisplay);

        if(animal != null){
            animalHeadline.setText(animal.getName());

        }

        int panda = R.drawable.panda;

        // ändra animalPortrait, hur?
        animal = theZoo.getAnimal("panda");

        if(animal !=null){
         animalPortrait.setImageResource(panda);
        }



    }
}
