package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestMémoire {

    @Test
    void testTailleMémoire() {
        // Création des chapitres avec leurs titres et leurs pages
        Chapitre c1 = new Chapitre("Introduction", new ArrayList<>(Arrays.asList("...", "...")));
        Chapitre c2 = new Chapitre("Patrons", new ArrayList<>(Arrays.asList("...", "...", "...")));
        Chapitre c3 = new Chapitre("Anti-Patrons", new ArrayList<>(Arrays.asList("...", "...")));
        Chapitre c4 = new Chapitre("Conclusion", new ArrayList<>(Arrays.asList("...")));

        // Création de la mémoire contenant ces chapitres
        ArrayList<Chapitre> chapitres = new ArrayList<>(Arrays.asList(c1, c2, c3, c4));
        Memoire mémoireAlice = new Memoire("Patrons et Anti-Patrons", chapitres);

        // Vérification de la méthode taille()
        int tailleMémoire = mémoireAlice.taille();
        
        assertEquals(8, tailleMémoire); // Attendu : 8
    }
}
