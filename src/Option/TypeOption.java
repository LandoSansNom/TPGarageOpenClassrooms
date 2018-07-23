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
public enum TypeOption {
    GPS("GPS"), SiegeChauffant("Siège Chauffant"), BarreDeToit("Barre de toit"), Climatisation("Climatisation"), VitreElectrique("Vitre electrique"); 

    private String typeoption;
    
    TypeOption(String typeoption){
        this.typeoption = typeoption;
    }
    
    @Override
    public String toString(){
        return typeoption;
    }
}
