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
public class Vehiculo {
    
    private String patente;
    private String marca;
    private int avaluoFiscal;

    public Vehiculo() {
    }

    
    public Vehiculo(String patente, String marca, int avaluoFiscal) {
        this.patente = patente;
        this.marca = marca;
        this.avaluoFiscal = avaluoFiscal;
    }

    /**
     * @return the patente
     */
    public String getPatente() {
        return patente;
    }

    /**
     * @param patente the patente to set
     */
    public void setPatente(String patente) {
        this.patente = patente;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the avaluoFiscal
     */
    public int getAvaluoFiscal() {
        return avaluoFiscal;
    }

    /**
     * @param avaluoFiscal the avaluoFiscal to set
     */
    public void setAvaluoFiscal(int avaluoFiscal) {
        this.avaluoFiscal = avaluoFiscal;
    }
    
    
            
    
    //CODIGO CREADO POR KAREN LUENGO TORO Y VICTOR BASTIAS ESCOBAR
}
