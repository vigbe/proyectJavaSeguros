/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.seguro.control;

import cl.duoc.seguro.dao.AutomotrizDao;
import cl.duoc.seguro.dominio.Automotriz;
import java.util.ArrayList;

/**
 *
 * @author vykto
 */
public class ControlAutomotriz {
    
    
    
    
    
    public ArrayList<Automotriz> recuperarDatoAutomotriz(){
    return AutomotrizDao.RecuperarDatoAutomotriz();
    }
    
    
    public static boolean crearAutomotriz(Automotriz aut ){
    boolean resultado = false;
     
        resultado = AutomotrizDao.insertarSeguroAutomotriz(aut);
    
    return resultado;
    }
    
    public static boolean borrarSeguroAutomotriz(Automotriz aut ){
    boolean resultado = false;
     
        resultado = AutomotrizDao.eliminarSeguroAutomotriz(aut);
    
    return resultado;
    } 
}
//CODIGO CREADO POR KAREN LUENGO TORO Y VICTOR BASTIAS ESCOBAR