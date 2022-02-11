/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.seguro.control;

import cl.duoc.seguro.dao.VidaDao;
import cl.duoc.seguro.dominio.Vida;
import java.util.ArrayList;

/**
 *
 * @author vykto
 */
public class ControlVida {
    
   
    
    
    public ArrayList<Vida> recuperarVida(){
    return VidaDao.recuperarVida();
    }
    
    
    public static boolean crearVida(Vida vid ){
    boolean resultado = false;
     
        resultado = VidaDao.insertarSeguroVida(vid);
    
    return resultado;
    }
    
    public static boolean borrarSeguroVida(Vida vid ){
    boolean resultado = false;
     
        resultado = VidaDao.eliminarSeguroVida(vid);
    
    return resultado;
    } 
}
//CODIGO CREADO POR KAREN LUENGO TORO Y VICTOR BASTIAS ESCOBAR