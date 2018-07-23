/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehicule;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LandoSansNom
 */
public class Garage {
    private List<Vehicule> voitures = new ArrayList();
    private final String FILENAME = "garage.txt";
    public static String breakline = System.getProperty("line.separator");
    @Override
    public String toString(){
        File file = new File(FILENAME);
        BufferedReader br = null;
        String str = "";
        FileReader fr = null;
        
        if(file.exists()){
            try {
                 fr = new FileReader(file);
                 br = new BufferedReader(fr);
                try{
                    if(fr.read() == -1){
                        str = "\033[31;1mAucune voiture sauvegardée !";
                        str = str + breakline;
                        str = str +"**************************************************";
                        str = str + breakline;
                        str = str +"*             Garage OpenClassrooms              *";
                        str = str + breakline;
                        str = str +"**************************************************";
                        System.out.println(str);
                    }else{
                        str = "";
                        str = str +"**************************************************";
                        str = str + breakline;
                        str = str +"*             Garage OpenClassrooms              *";
                        str = str + breakline;
                        str = str +"**************************************************";
                        System.out.println(str);
                             Scanner sc = new Scanner(file);
 
                                while (sc.hasNextLine())
                                System.out.println(sc.nextLine());
                               

                        }
                    
                } catch (IOException ex) {
                    Logger.getLogger(Garage.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (FileNotFoundException ex) {
            }finally{
                    
                try {

                    if (br != null)
		         br.close();

		    if (fr != null)
			 fr.close();

		     } catch (IOException ex) {
                     }
            }
            
        }else{
           str = "\033[31;1mAucune voiture sauvegardée !";
           str = str + breakline;
           str = str +"**************************************************";
           str = str + breakline;
           str = str +"*             Garage OpenClassrooms              *";
           str = str + breakline;
           str = str +"**************************************************";
           System.out.println(str);
        }
        str = "";
        return str;
    }
    
    
    public void addVoiture(Vehicule voit){
        BufferedWriter bw = null;
        FileWriter fw = null;
        voitures.add(voit);
        
        try{
        
            String content = voit.toString();
            
            fw = new FileWriter(FILENAME, true);
            bw = new BufferedWriter(fw);
            
            bw.write(content);
            bw.newLine();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            
            try{
                if(bw != null)
                    bw.close();
                
                if (fw != null)
                    fw.close();
            }catch(IOException ex){
                    ex.printStackTrace();
            }
        }
    }
}
