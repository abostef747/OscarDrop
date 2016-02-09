package com.weebly.mustafamk.oscardrop;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
    }

    // Instansmetoder

    //vad som händer när man klickar på knappebn explore
    public void exploreAnimal(View view){
        Intent intent = new Intent(this, Detailed_information.class);
        intent.putExtra("animal", "panda");
        startActivity(intent);
    }
    // Vad som händer när man klickar på "SHARE"
    public void shareInformation(View view) {

        // Visa upp en "Toast" med att vi klickat på knappen...
        Toast.makeText(this, "Klickade på knappen!", Toast.LENGTH_LONG).show();

        // Skapa en implicit intent
        // D.v.s. skicka information som kan tas emot av en annan app
        Intent intent = new Intent();
        // Vad vill vi göra? Skicka text
        intent.setAction(Intent.ACTION_SEND);
        // Vilken text vill vi skicka?
        intent.putExtra(Intent.EXTRA_TEXT, "Red Panda är en björn");
        // Vad är det för något vi skickar?
        intent.setType("text/plain");

        // Skicka!
        // startActivity(intent);

        AnimalZoo myZoo = new AnimalZoo();
        Animal elk = myZoo.getAnimal("elk");
        if(elk != null) {
            String elkName = elk.getName();
            Toast.makeText(this, "Älgen heter " + elkName, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Det finns ingen älg!", Toast.LENGTH_SHORT).show();
        }






    }

}