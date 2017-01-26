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
public class FabricaPizzaIntegral extends FabricaDePizza
{
    private static FabricaPizzaIntegral fpi=null;
      private FabricaPizzaIntegral(){
    }
       
    public static FabricaPizzaIntegral demePizzaIntegral(){
        if(fpi==null)fpi=new FabricaPizzaIntegral();
        return fpi;
    }
    public Amasador fabriqueAmasador(){
        return (new AmasadorPizzaIntegral());
    }
    public Horneador fabriqueHorneador(){
        return(new HorneadorPizzaIntegral());
    }
    public Moldeador fabriqueMoldeador(){
        return(new MoldeadorPizzaIntegral());
    }
}
