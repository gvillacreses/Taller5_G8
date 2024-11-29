/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller5_g8;

/**
 *
 * @author Anthony
 */
public class TareaSimpleFactory extends TareaFactory{
    public Tarea crearTarea(){
        return new Tareasimple();
    }
}