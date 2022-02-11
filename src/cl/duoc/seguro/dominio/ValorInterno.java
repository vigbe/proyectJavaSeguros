/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.seguro.dominio;

/**
 *
 * @author karen
 */
public interface ValorInterno {
    
    double BONOSEGURO = 0.05;
    double INCREMENTOCOMERCIAL = 0.5;
    int VALORUF = 30000;
    
    
    public abstract double pagoSeguro();
   
}
//CODIGO CREADO POR KAREN LUENGO TORO Y VICTOR BASTIAS ESCOBAR