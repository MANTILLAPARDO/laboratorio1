
package edu.eci.pdsw.pizzafactory.consoleview;

import edu.eci.pdsw.pizzafactory.model.*;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;
/**
 *
 * @author hcadavid
 */
public class PreparadorPizza {

    public static void main(String args[])throws IOException{
        try {
            Ingrediente[] ingredientes=new Ingrediente[]{new Ingrediente("queso",1),new Ingrediente("jamon",2)};            
            PreparadorPizza pp=new PreparadorPizza(); 
            pp.prepararPizza(ingredientes, Tamano.MEDIANO,'i');
        } catch (ExcepcionParametrosInvalidos ex) {
            Logger.getLogger(PreparadorPizza.class.getName()).log(Level.SEVERE, "Problema en la preparacion de la Pizza", ex);
        }
                
    }
    
    
    public void prepararPizza(Ingrediente[] ingredientes, Tamano tam,char tipoPizza)
            throws ExcepcionParametrosInvalidos {
        Amasador am = FabricaDePizza.demeFabrica(tipoPizza).fabriqueAmasador();
        Horneador hpd =FabricaDePizza.demeFabrica(tipoPizza).fabriqueHorneador();
        Moldeador mp = FabricaDePizza.demeFabrica(tipoPizza).fabriqueMoldeador();
        am.amasar();
        if (tam == Tamano.PEQUENO) {
            mp.moldearPizzaPequena();
        } else if (tam == Tamano.MEDIANO) {
            mp.moldearPizzaMediana();
        } else {
            throw new ExcepcionParametrosInvalidos("Tamano de piza invalido:"+tam);
        }
	aplicarIngredientes(ingredientes);
        hpd.hornear();
    }

    private void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "APLICANDO INGREDIENTES!:{0}", Arrays.toString(ingredientes));
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
        
        
        
    }


}
