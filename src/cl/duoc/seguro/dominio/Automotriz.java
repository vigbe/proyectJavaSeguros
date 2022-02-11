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
public class Automotriz extends Seguro {

    public int deducibleUf;
    public Vehiculo vehiculo;

    public Automotriz(int deducibleUf, Vehiculo vehiculo, int identificador, String nombreCliente, int costo, int fechaVigencia) {
        super(identificador, nombreCliente, costo, fechaVigencia);
        this.deducibleUf = deducibleUf;
        this.vehiculo = vehiculo;
    }

    public Automotriz() {
            
            vehiculo = new Vehiculo();
    }

    /**
     * @return the deducibleUf
     */
    public int getDeducibleUf() {
        return deducibleUf;
    }

    /**
     * @param deducibleUf the deducibleUf to set
     */
    public void setDeducibleUf(int deducibleUf) {
        this.deducibleUf = deducibleUf;
    }

    /**
     * @return the vehiculo
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * @param vehiculo the vehiculo to set
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public double pagoSeguro() {
        double pagoPerdidaTotal = this.vehiculo.getAvaluoFiscal()-(this.vehiculo.getAvaluoFiscal() + (this.vehiculo.getAvaluoFiscal() / INCREMENTOCOMERCIAL)) - getDeducibleUf();
        return pagoPerdidaTotal;

    }
    ///"Cuenta{" + "tipo=" + tipo + ", numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente + '}'
    @Override
    public String toString() {
        return
            "Datos Vehiculo Asegurado" +
                "Nombre Cliente: "+getNombreCliente()+
                "Numero Identificador: "+ getIdentificador()+
                "Fecha de Vigencia"+getFechaVigencia()+               
                "Deducible: "+this.getDeducibleUf()+
                "Patente: "+vehiculo.getPatente()+
                "Marca: "+vehiculo.getMarca()+
                "Avaluo: "+vehiculo.getAvaluoFiscal()+
                "Costo: "+getCosto();  
}}//CODIGO CREADO POR KAREN LUENGO TORO Y VICTOR BASTIAS ESCOBAR