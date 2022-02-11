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
public abstract class Seguro implements ValorInterno{
    
    private int identificador;
    private String nombreCliente;
    private int costo;
    private int fechaVigencia;

    public Seguro() {
    }

    
    
    
    public Seguro(int identificador, String nombreCliente, int costo, int fechaVigencia) {
        this.identificador = identificador;
        this.nombreCliente = nombreCliente;
        this.costo = costo;
        this.fechaVigencia = fechaVigencia;
    }

    /**
     * @return the identificador
     */
    public int getIdentificador() {
        return identificador;
    }
 
    /**
     * @param identificador the identificador to set
     */
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    /**
     * @return the nombreCliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * @param nombreCliente the nombreCliente to set
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * @return the costo
     */
    public int getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(int costo) {
        this.costo = costo;
    }

    /**
     * @return the fechaVigencia
     */
    public int getFechaVigencia() {
        return fechaVigencia;
    }

    /**
     * @param fechaVigencia the fechaVigencia to set
     */
    public void setFechaVigencia(int fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }
    
    
}
//CODIGO CREADO POR KAREN LUENGO TORO Y VICTOR BASTIAS ESCOBAR