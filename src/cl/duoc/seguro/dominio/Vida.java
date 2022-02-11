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
public class Vida extends Seguro {

 

    private String nombreAsegurado;
    private int edadAsegurado;
    private int valorFallecimiento;

    public Vida(String nombreAsegurado, int edadAsegurado, int valorFallecimiento, int identificador, String nombreCliente, int costo, int fechaVigencia) {
        super(identificador, nombreCliente, costo, fechaVigencia);
        this.nombreAsegurado = nombreAsegurado;
        this.edadAsegurado = edadAsegurado;
        this.valorFallecimiento = valorFallecimiento;
    }

    public Vida() {
    }

    /**
     * @return the nombreAsegurado
     */
    public String getNombreAsegurado() {
        return nombreAsegurado;
    }

    /**
     * @param nombreAsegurado the nombreAsegurado to set
     */
    public void setNombreAsegurado(String nombreAsegurado) {
        this.nombreAsegurado = nombreAsegurado;
    }

    /**
     * @return the edadAsegurado
     */
    public int getEdadAsegurado() {
        return edadAsegurado;
    }

    /**
     * @param edadAsegurado the edadAsegurado to set
     */
    public void setEdadAsegurado(int edadAsegurado) {
        this.edadAsegurado = edadAsegurado;
    }

    /**
     * @return the valorFallecimiento
     */
    public int getValorFallecimiento() {
        return valorFallecimiento;
    }

    /**
     * @param valorFallecimiento the valorFallecimiento to set
     */
    public void setValorFallecimiento(int valorFallecimiento) {
        this.valorFallecimiento = valorFallecimiento;
    }

    @Override
    public double pagoSeguro(){

        double pagoTotalSeguroVida = getValorFallecimiento() - VALORUF;
        return pagoTotalSeguroVida;
    }
    @Override
    public String toString() {
        return
            "Datos Seguro de Vida" +
                "Nombre Cliente: "+getNombreCliente()+
                "Numero Identificador: "+ getIdentificador()+
                "Fecha de Vigencia"+getFechaVigencia()+    
                "Nombre Asegurado"+getNombreAsegurado()+
                "Edad Asegurado"+getEdadAsegurado()+
                "Monto Defuncion: "+getValorFallecimiento();
    
    
}
}//CODIGO CREADO POR KAREN LUENGO TORO Y VICTOR BASTIAS ESCOBAR