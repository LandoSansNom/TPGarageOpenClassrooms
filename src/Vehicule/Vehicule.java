/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehicule;

import Moteur.Moteur;
import Option.Option;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LandoSansNom
 */
public abstract class Vehicule implements Serializable{
    
    //Liste des attributs
    private Double prix;
    private String nom;
    private transient List<Option> options = new ArrayList<>();
    private transient Marque nomMarque;
    private transient Moteur moteur;
    
    //Liste des méthodes
    @Override
    public abstract String toString();
    
    public void addOption(Option opt){
        options.add(opt); 
    }
    
    public Marque getMarque(){
        return this.nomMarque;
    }
    
    public List<Option> getOptions(){
        return this.options;
    }

    public abstract Double getPrix();

    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
    }
    
    public Moteur getMoteur(){
        return moteur;
    }
    
    //To get the sum of values of the ArrayList
    
    public double SumListOption(){
    
        double sum = 0;
        for(int i = 0; i < options.size(); i++)
            sum += options.get(i).getPrix();
        return sum;
    }
    
}
