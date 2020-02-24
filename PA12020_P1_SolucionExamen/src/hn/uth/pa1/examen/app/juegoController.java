/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa1.examen.app;

/**
 *
 * @author Alumno
 */
public class juegoController {
    private static String _nombre;
    
    public static void setNombre(String nombre){
        _nombre=nombre;
        
    }
    public static String getNombre(){
        return _nombre;
    }
}
