/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package jeudedame;

/**
 * @author vdufo
 */
public class JeuDeDame { 

    public static void main(String[] args) {
        System.out.println("=== DÉMARRAGE DU JEU DE DAMES ===");
        
        Jeu partie = new Jeu();
        System.out.println("\n1. État initial du plateau :");
        partie.getPlateau().afficher();

        System.out.println("\n2. Déplacement du pion en [1;6] vers [0;5]...");
        partie.getPlateau().bougerPiece(1, 6, 0, 5);
        partie.getPlateau().afficher();

        System.out.println("\n3. Sauvegarde de la partie en cours...");
        partie.sauvegarder("partie_test.save");

        System.out.println("\n4. Modification supplémentaire (ne doit pas être dans la sauvegarde)...");
        partie.getPlateau().bougerPiece(3, 6, 2, 5);
        partie.getPlateau().afficher();

        System.out.println("\n5. Chargement de la partie précédente...");
        Jeu partieChargee = Jeu.charger("partie_test.save");

        if (partieChargee != null) {
            System.out.println("Plateau restauré (On doit retrouver l'état de l'étape 3) :");
            partieChargee.getPlateau().afficher();
        }
        
        System.out.println("\n=== TEST TERMINÉ ===");
    }
}
