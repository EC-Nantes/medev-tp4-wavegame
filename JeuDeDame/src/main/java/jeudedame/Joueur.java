/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jeudedame;

/**
 *
 * @author bachirmasroua
 */

import java.io.Serializable;

public class Joueur implements Serializable {
    
    private String nom;
    private boolean isNoir; // true = Noir, false = Blanc
    
    // Constructor
    public Joueur(String nom, boolean isNoir) {
        this.nom = nom;
        this.isNoir = isNoir;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public boolean isNoir() {
        return isNoir;
    }

    // String representation for the Text Interface
    @Override
    public String toString() {
        String couleur = isNoir ? "Noir" : "Blanc";
        return nom + " [" + couleur + "]";
    }
}