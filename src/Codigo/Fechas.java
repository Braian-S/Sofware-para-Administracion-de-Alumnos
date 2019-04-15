/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Fechas {
 
   
    
      public  String ObtenerfechaActual(){
        Date fecha=new Date();
        SimpleDateFormat formatoFecha=new SimpleDateFormat("DD/MM/YY");
        return formatoFecha.format(fecha);
    }
}
