/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Router
 */
public class Fichero {
    
    Scanner teclado=new Scanner(System.in);
    ArrayList<Materias>arrayM;
    ArrayList<Materias> ArrayCompm=new ArrayList<Materias>();
    String DirectorioArchivoM="C:\\SoftwareGalileo\\Materias\\materias.gal";
    String DirectorioCarpetaM="C:\\SoftwareGalileo\\Materias";
    
    ArrayList<Alumnos>arrayA;
    ArrayList<Alumnos>ArrayCompa=new ArrayList<Alumnos>();
    String DirectorioArchivoA="C:\\SoftwareGalileo\\Alumnos\\alumnos.gal";
    String DirectorioCarpetaA="C:\\SoftwareGalileo\\Alumnos";
    
    File ArchivoMateria=new File(DirectorioArchivoM);
    File CarpetaMateria=new File(DirectorioCarpetaM);
    
    File ArchivoAlumno=new File(DirectorioArchivoA);
    File CarpetaAlumno=new File(DirectorioCarpetaA);
    
    

    
    

public void ComprobarMaterias(){
    
    if(ArchivoMateria.exists()){
        
    }else{
        int msj=JOptionPane.showConfirmDialog(null,"Error ,no se encuentran Materias,desea crear un nuevo Archivo?");
    
        if(msj==JOptionPane.YES_OPTION){
            
            CarpetaMateria.mkdirs();
        try{
            
           try  (FileOutputStream  salidaArchivoM= new FileOutputStream(ArchivoMateria);
                        ObjectOutputStream  objetoSalidaM =new ObjectOutputStream(salidaArchivoM)){
                            objetoSalidaM.writeObject(ArrayCompm);
                            objetoSalidaM.close();
                            
                         JOptionPane.showMessageDialog(null,"Se ha Creado un Archivo de Materias con Exito!!");
                        }             
       }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Falla al Crear Archivo");
       }
    }
    }
}
            
public void añadirMateria(String nombre, double monto){
    
        try{
                try(FileInputStream entradaArchivom=new FileInputStream(ArchivoMateria);
                    
                    ObjectInputStream objetoEntradam=new ObjectInputStream(entradaArchivom)){
                    
                    arrayM=(ArrayList<Materias>)objetoEntradam.readObject(); //Se realiza un casting
                    
                        
                                 Materias materia=new Materias(nombre,monto);
                                    arrayM.add(materia);
                                 
                                   // teclado.nextLine();// limpieza de buffer
                            guardarMateria(arrayM);
                            objetoEntradam.close();
                
                } catch (ClassNotFoundException ex) {
               
                }
            }catch(IOException e){
                              System.out.println("ererorw");
            }           
}                  


public void guardarMateria(ArrayList<Materias>materias){
    
    try{
               try  (FileOutputStream  salidaArchivom= new FileOutputStream(ArchivoMateria);
                    
                        ObjectOutputStream  objetoSalidam =new ObjectOutputStream(salidaArchivom)){
                            
                                
                                objetoSalidam.writeObject(materias);
                                
                                objetoSalidam.close();
                        }
                       
       }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Error,No se Encuentra el Archivo");
       }
}


public void comprobarelementos(){
    
    try{
                try(FileInputStream entradaArchivom=new FileInputStream(ArchivoMateria);
                    
                    ObjectInputStream objetoEntradam=new ObjectInputStream(entradaArchivom)){
                    
                    arrayM=(ArrayList<Materias>)objetoEntradam.readObject(); //Se realiza un casting
                    
                        for(int i=0;i<arrayM.size();i++){
                            
                            System.out.println("materia"+arrayM.get(i).getNombre());
                        }
                                 
                                   
                            objetoEntradam.close();
                
                } catch (ClassNotFoundException ex) {
               
                }
            }catch(IOException e){
                              System.out.println("ererorw");
            }           
    
}


public ArrayList<Materias> enviarListaMaterias(){
    
       
        try{
                try(FileInputStream entradaArchivom=new FileInputStream(ArchivoMateria);
                    
                    ObjectInputStream objetoEntradam=new ObjectInputStream(entradaArchivom)){
                    
                    arrayM=(ArrayList<Materias>)objetoEntradam.readObject(); //Se realiza un casting
                    objetoEntradam.close();
                      
                } catch (ClassNotFoundException ex) {
               
                }
                    }catch(IOException e){
                            // comprobarArchivo();
                        }
        return(arrayM);
    
    
}


public void eliminarMateria(int elemento){
    
    try{
                try(FileInputStream entradaArchivom=new FileInputStream(ArchivoMateria);
                    
                    ObjectInputStream objetoEntradam=new ObjectInputStream(entradaArchivom)){
                    
                    arrayM=(ArrayList<Materias>)objetoEntradam.readObject(); //Se realiza un casting
                    
                        arrayM.remove(elemento);    
                                   // teclado.nextLine();// limpieza de buffer
                            guardarMateria(arrayM);
                            objetoEntradam.close();
                
                } catch (ClassNotFoundException ex) {
               
                }
            }catch(IOException e){
                              System.out.println("ererorw");
            }           
    
    
}


public void editarMateria(String nombre, double monto,int elemento){
    
    
        try{
                try(FileInputStream entradaArchivom=new FileInputStream(ArchivoMateria);
                    
                    ObjectInputStream objetoEntradam=new ObjectInputStream(entradaArchivom)){
                    
                    arrayM=(ArrayList<Materias>)objetoEntradam.readObject(); //Se realiza un casting
                    
                        
                                 arrayM.get(elemento).setNombre(nombre);
                                 arrayM.get(elemento).setMonto(monto);
                                 
                                 
                                   // teclado.nextLine();// limpieza de buffer
                            guardarMateria(arrayM);
                            objetoEntradam.close();
                
                } catch (ClassNotFoundException ex) {
               
                }
            }catch(IOException e){
                              System.out.println("ererorw");
            }           
    
    
    
}








public void ComprobarAlumnos(){
    
    if(ArchivoAlumno.exists()){
        
    }else{
        int msj=JOptionPane.showConfirmDialog(null,"Error ,no se encuentran Alumnos,desea crear un nuevo Archivo?");
    
        if(msj==JOptionPane.YES_OPTION){
            
            CarpetaAlumno.mkdirs();
        try{
            
           try  (FileOutputStream  salidaArchivoA= new FileOutputStream(ArchivoAlumno);
                        ObjectOutputStream  objetoSalidaA =new ObjectOutputStream(salidaArchivoA)){
                            objetoSalidaA.writeObject(ArrayCompa);
                            objetoSalidaA.close();
                            
                         JOptionPane.showMessageDialog(null,"Se ha Creado un Archivo de Alumnos con Exito!!");
                        }             
       }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Falla al Crear Archivo");
       }
    }
    }
}


public void añadirAlumno(String nombre,String apellido, String materia,Double pago,String fecha){
    
        try{
                try(FileInputStream entradaArchivoA=new FileInputStream(ArchivoAlumno);
                    
                    ObjectInputStream objetoEntradaA=new ObjectInputStream(entradaArchivoA)){
                    
                    arrayA=(ArrayList<Alumnos>)objetoEntradaA.readObject(); //Se realiza un casting
                    
                        
                                 Alumnos alumno=new Alumnos( nombre, apellido, materia,pago, fecha);
                                    arrayA.add(alumno);
                                 
                                   // teclado.nextLine();// limpieza de buffer
                            guardarAlumno(arrayA);
                            objetoEntradaA.close();
                
                } catch (ClassNotFoundException ex) {
               
                }
            }catch(IOException e){
                              System.out.println("ererorw");
                              JOptionPane.showMessageDialog(null,"Error,No se Encuentra el Archivo");
            }           
}        


public void guardarAlumno(ArrayList<Alumnos>alumnos){
    
    try{
               try  (FileOutputStream  salidaArchivoA= new FileOutputStream(ArchivoAlumno);
                    
                        ObjectOutputStream  objetoSalidaA =new ObjectOutputStream(salidaArchivoA)){
                            
                                
                                objetoSalidaA.writeObject(alumnos);
                                
                                objetoSalidaA.close();
                        }
                       
       }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Error,No se Encuentra el Archivo");
       }
}


public ArrayList<Alumnos> enviarListaAlumnos(){
    
       
        try{
                try(FileInputStream entradaArchivoA=new FileInputStream(ArchivoAlumno);
                    
                    ObjectInputStream objetoEntradaA=new ObjectInputStream(entradaArchivoA)){
                    
                    arrayA=(ArrayList<Alumnos>)objetoEntradaA.readObject(); //Se realiza un casting
                    objetoEntradaA.close();
                      
                } catch (ClassNotFoundException ex) {
               
                }
                    }catch(IOException e){
                            // comprobarArchivo();
                        }
        return(arrayA);
    
    
}


public void eliminarAlumno(int elemento){
    
    try{
                try(FileInputStream entradaArchivoA=new FileInputStream(ArchivoAlumno);
                    
                    ObjectInputStream objetoEntradaA=new ObjectInputStream(entradaArchivoA)){
                    
                    arrayA=(ArrayList<Alumnos>)objetoEntradaA.readObject(); //Se realiza un casting
                    
                        arrayA.remove(elemento);    
                                   // teclado.nextLine();// limpieza de buffer
                            guardarAlumno(arrayA);
                            objetoEntradaA.close();
                
                } catch (ClassNotFoundException ex) {
               
                }
            }catch(IOException e){
                              System.out.println("ererorw");
            }           
    
    
}


public void editarAlumno(String nombre,String apellido, String materia,Double pago,String fecha,int elemento){
    
    
        try{
                try(FileInputStream entradaArchivoA=new FileInputStream(ArchivoAlumno);
                    
                    ObjectInputStream objetoEntradaA=new ObjectInputStream(entradaArchivoA)){
                    
                    arrayA=(ArrayList<Alumnos>)objetoEntradaA.readObject(); //Se realiza un casting
                    
                        
                                 arrayA.get(elemento).setNombre(nombre);
                                 arrayA.get(elemento).setApellido(apellido);
                                  arrayA.get(elemento).setMateria(materia);
                                  arrayA.get(elemento).setPago(pago);
                                   arrayA.get(elemento).setFecha(fecha);
                                   
                                 
                                   // teclado.nextLine();// limpieza de buffer
                            guardarAlumno(arrayA);
                            objetoEntradaA.close();
                
                } catch (ClassNotFoundException ex) {
               
                }
            }catch(IOException e){
                              System.out.println("ererorw");
            }           
    
    
    
}




public void comprobareElementosAlumnos(){
    
    try{
                try(FileInputStream entradaArchivoA=new FileInputStream(ArchivoAlumno);
                    
                    ObjectInputStream objetoEntradaA=new ObjectInputStream(entradaArchivoA)){
                    
                    arrayA=(ArrayList<Alumnos>)objetoEntradaA.readObject(); //Se realiza un casting
                    
                        for(int i=0;i<arrayA.size();i++){
                            
                            System.out.println("ALUMNOS: "+arrayA.get(i).getNombre()+arrayA.get(i).getApellido()+arrayA.get(i).getPago());
                        }
                                 
                                   
                            objetoEntradaA.close();
                
                } catch (ClassNotFoundException ex) {
               
                }
            }catch(IOException e){
                              System.out.println("ererorw");
            }           
    
}



























































































































} 
            
        
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    






































