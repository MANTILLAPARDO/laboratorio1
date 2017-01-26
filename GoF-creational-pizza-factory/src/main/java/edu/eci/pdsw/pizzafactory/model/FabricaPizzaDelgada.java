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
public class FabricaPizzaDelgada extends FabricaDePizza{
    private static FabricaPizzaDelgada fpd=null;
    private FabricaPizzaDelgada(){
    }
    public static FabricaPizzaDelgada demePizzaDelgada(){
        if(fpd==null)fpd=new FabricaPizzaDelgada();
        return fpd;
    }
    public Amasador fabriqueAmasador(){
        return (new AmasadorPizzaDelgada());
    }
    public Horneador fabriqueHorneador(){
        return(new HorneadorPizzaDelgada());
    }
    public Moldeador fabriqueMoldeador(){
        return(new MoldeadorPizzaDelgada());
    }
}
