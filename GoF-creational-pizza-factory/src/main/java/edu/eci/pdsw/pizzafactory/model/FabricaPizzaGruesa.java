/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.pizzafactory.model;

/**
 *
 * @author 2115237
 */
public class FabricaPizzaGruesa extends FabricaDePizza {
     private static FabricaPizzaGruesa fpg=null;
    public static FabricaPizzaGruesa demePizzaGruesa(){
        if(fpg==null)fpg=new FabricaPizzaGruesa();
        return fpg;
    }
      private FabricaPizzaGruesa(){
    }
    public Amasador fabriqueAmasador(){
        return (new AmasadorPizzaGruesa());
    }
    public Horneador fabriqueHorneador(){
        return(new HorneadorPizzaGruesa());
    }
    public Moldeador fabriqueMoldeador(){
        return(new MoldeadorPizzaGruesa());
    }
}
