package com.company;

public enum Planete {

    TERRE("Terre", 3000, true),
    SATURN("Saturn", 5500, false),
    JUPITER("Jupiter", 1000, false),
    MARS("Mars", 1400, false)
    ;

    private String nom;
    private int distance;
    private boolean vivable;

    Planete(String nom, int distance, boolean vivable) {
        this.nom = nom;
        this.distance = distance;
        this.vivable = vivable;
    }

    public String getNom() {
        return nom;
    }

    public int getDistance() {
        return distance;
    }

    public boolean isVivable() {
        return vivable;
    }
}
