package org.example;

import java.util.List;

public class Memoire implements Document{
    private String titre;
    private List<Chapitre> chapitres;

    public Memoire(String titre, List<Chapitre> chapitres){
        this.titre = titre;
        this.chapitres = chapitres;
    }

    @Override
    public String titre(){
        System.out.println("Titre : " + this.titre);
        return this.titre;
    }

    @Override
    public int taille() {
        int totalPages = 0;
        for (Chapitre chapitre : chapitres) {
            totalPages += chapitre.taille();
        }
        return totalPages;
    }
}
