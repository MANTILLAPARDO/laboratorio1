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
public abstract class FabricaDePizza {
    private static FabricaDePizza fabrica=null;
    public static FabricaDePizza demeFabrica(char caracter){
        if (fabrica==null){
            if(caracter=='d')fabrica=FabricaPizzaDelgada.demePizzaDelgada();
            else if(caracter=='g')fabrica= FabricaPizzaGruesa.demePizzaGruesa();
            else if(caracter=='i')fabrica=FabricaPizzaIntegral.demePizzaIntegral();
        }
        return fabrica;
    } 
    public abstract Amasador fabriqueAmasador();
    public abstract Horneador fabriqueHorneador();
    public abstract Moldeador fabriqueMoldeador();
}
