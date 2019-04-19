
package Codigo;

import Codigo.InterfazGrafica.MenuPrincipal;

/**
 *
 * @author Router
 */
public class Principal {
    
    public static void main(String[] args){
        
        MenuPrincipal menuPrincipal=new MenuPrincipal();
        menuPrincipal.setExtendedState(menuPrincipal.MAXIMIZED_BOTH);
        menuPrincipal.setVisible(true);

       Fichero fichero=new Fichero();
       fichero.ComprobarMaterias();
       fichero.ComprobarAlumnos();
   
    }

}


