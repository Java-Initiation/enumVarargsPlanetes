package com.company;

public class Main {

    public static void main(String[] args) {

        seDeplacerAvecItineraire(
                Planete.TERRE,
                Planete.JUPITER,
                Planete.MARS,
                Planete.SATURN
        );

    }


    public static void seDeplacerAvecItineraire(Planete... planetes){

        for (Planete planete: planetes){
            if (planete.isVivable())
                System.out.println(planete.getNom() + " est vivable");
            else
                System.out.println(planete.getNom() + " n'est pas vivable");
        }

    }
}
