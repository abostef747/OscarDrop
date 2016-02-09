package com.weebly.mustafamk.oscardrop;


import java.util.ArrayList;

public class AnimalZoo {

    // Instansvariabler
    private ArrayList<Animal> animals = new ArrayList<>();

    // Klassvariabler

    // Konstruktorer
    public AnimalZoo() {

        Animal panda = new Animal(1, "Panda", "En Panda äter bambu!");
        Animal redPanda = new Animal(2, "Red Panda", "Ser mer ut som en räv");
        Animal fox = new Animal(3, "Fox", "Vad säger räven? Ingen vet...");
        Animal elk = new Animal(4, "Elk", "Älgen lever i svenska skogar!");

        animals.add(panda);     // index = 0
        animals.add(redPanda);  // index = 1
        animals.add(fox);       // index = 2
        animals.add(elk);       // index = 3

    }

    // Instansmetoder
    public  Animal  getAnimal(String whichAnimal) {

        int index = -1;

        // Hur kan vi hämta rätt djur?
        switch (whichAnimal) {
            case "panda": index = 0;
                break;
            case "red panda": index = 1;
                break;
            case "fox": index = 2;
                break;
            case "elk": index = 3;
                break;
        }

        if(index == -1) {
            return null;
        } else {
            return animals.get(index);
        }

    }

    // Klassmetoder


}