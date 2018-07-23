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
public enum TypeMoteur {
    DIESEL("Moteur DIESEL"), ESSENCE("Moteur ESSENCE"), HYBRIDE("Moteur HYBRIDE"), ELECTRIQUE("Moteur ELECTRIQUE");
    
    private String typemoteur;
    
    TypeMoteur(String typemoteur){
        this.typemoteur = typemoteur;
    }
    
    @Override
    public String toString(){
        return this.typemoteur;
    }
}
