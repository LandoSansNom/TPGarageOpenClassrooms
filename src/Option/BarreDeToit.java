/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Option;

/**
 *
 * @author LandoSansNom
 */
public class BarreDeToit implements Option{

    @Override
    public Double getPrix() {
        return 29.9;
    }
    
    @Override
    public String toString(){
        return TypeOption.BarreDeToit.toString() + " (" + this.getPrix() + " Euro)";
    }
    
}
