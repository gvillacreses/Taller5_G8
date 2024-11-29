/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller5_g8;

/**
 *
 * @author maric
 */
public abstract class CanalNotificacion {
    protected CentroControl tarea;

    public CanalNotificacion(CentroControl tarea) {
        this.tarea = tarea;
    }

    public abstract void actualizar(); 
}