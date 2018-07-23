/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehicule;

/**
 *
 * @author LandoSansNom
 */
public enum Marque {
    RENO("Voiture RENO"), PIGEOT("Voiture PIGEOT"), TROEN("Voiture TROEN");
    
    private String marque;
    
    Marque(String marque){
        this.marque = marque;
    }
    
    @Override
    public String toString(){
        return marque;
    }
}
