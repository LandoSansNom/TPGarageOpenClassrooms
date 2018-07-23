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
public class MoteurDiesel extends Moteur{
    
    

    public MoteurDiesel(String cylindre, Double prix) {
        super.Moteur(cylindre, prix);
    }
    
   
    
    @Override
    public String toString(){
        return TypeMoteur.DIESEL.toString() +" "+ this.getCylindre();
    }
    
    
    
    
    
}
