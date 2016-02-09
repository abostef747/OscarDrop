package com.weebly.mustafamk.oscardrop;

public class Animal {

    // Instansvariabler
    // Bild på djuret
    /*
    ID i XML:
    @drawable/image_of_panda

    ID i Java:
    R.drawable.image_of_panda
     */

    private int imageId;
    private String name;
    private String description;

    // Klassvariabler

    // Konstruktorer
    public Animal () {
        // Kod för ett "standarddjur"/"placeholderdjur"
    }

    public Animal(int imageId, String name, String desc) {
        this.imageId = imageId;
        this.name = name;
        this.description = desc;
    }

    // Instansmetoder
    public int getImageId() {
        return imageId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }



    // Klassmetoder



}