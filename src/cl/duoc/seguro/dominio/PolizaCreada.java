/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.seguro.dominio;

import static cl.duoc.seguro.dominio.ValorInterno.VALORUF;
import java.util.ArrayList;

/**
 *
 * @author vykto
 */
public class PolizaCreada {
    ///private ArrayList<Plato> platos = new ArrayList<Plato>();
    private ArrayList<Seguro> seguros = new ArrayList<Seguro>();
    /**
     * @return the seguros
     */
    public ArrayList<Seguro> getSeguros() {
        return seguros;
    }

    /**
     * @param seguros the seguros to set
     */
    public void setSeguros(ArrayList<Seguro> seguros) {
        this.seguros = seguros;
    }
     
    public PolizaCreada() {
        seguros = new ArrayList<Seguro>();
    }
    
    
    public boolean agregar(Seguro s){
    return seguros.add(s);
    }
    
    public double totalPagar(){
        double total=0;
        for (Seguro movimiento : seguros) {
            
            total = total + ValorInterno.VALORUF;
        }
        return total;
        
    } 

    public void mostrarAsegurados(){
    
        for (Seguro movimiento : seguros) {
            
            
           
            System.out.println("Cliente"+movimiento.getNombreCliente());
            System.out.println("Numero Identificador"+movimiento.getIdentificador());
            System.out.println("Valor del Seguro" +movimiento.getCosto());
            
}
    }}//CODIGO CREADO POR KAREN LUENGO TORO Y VICTOR BASTIAS ESCOBAR