/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Moteur;

/**
 *
 * @author LandoSansNom
 */
public abstract class Moteur {
    
    protected TypeMoteur type;
    protected String cylindre;
    protected Double prix;

    public void Moteur(String cylindre, Double prix) {
        this.cylindre = cylindre;
        this.prix = prix;
    }
    
    @Override
    public abstract String toString();

    public Double getPrix() {
        return prix;
    }
    
    public String getCylindre(){
        return this.cylindre;
    }
    
}
