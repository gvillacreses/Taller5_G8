/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller5_g8;

/**
 *
 * @author Anthony
 */
public class PreferenciaVisualizacion{
    private EstiloVisualizacion EstiloVisualizacion;
}

public void verTareas(){
    if(EstiloVisualizacion != null){
        EstiloVisualizacion.verTareas();
    }
    else{
        Sysem.out.println("No se ha configurado un estilo de visualizacion.")
    }
}