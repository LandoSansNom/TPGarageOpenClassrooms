/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehicule;

import java.io.Serializable;

/**
 *
 * @author LandoSansNom
 */
public class D4 extends Vehicule implements Serializable{
    @Override
    public String toString(){
        
        return Marque.TROEN.toString() +" : "+ this.getClass().getSimpleName() +" "+ this.getMoteur().toString() +" ("+ String.valueOf(this.getPrix())+ "Euro) " + this.getOptions().toString()+"  d'une valeur totale de " + String.valueOf(this.SumListOption() + this.getPrix()) +" Euro";                                          
    }  

    @Override
    public Double getPrix() {
        return 25147.0;
    }
}
