/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller5_g8;

/**
 *
 * @author maric
 */
public class NotificacionSMS extends CanalNotificacion {

     public NotificacionSMS(CentroControl tarea) {
        super(tarea);
        tarea.agregarCanal(this);
    }

    @Override
    public void actualizar() {
        System.out.println("Notificación por SMS: La tarea '" + ((TareaConcreta) tarea).getNombre() +
                "' cambió su estado a: " + tarea.getEstado());
    }
}
