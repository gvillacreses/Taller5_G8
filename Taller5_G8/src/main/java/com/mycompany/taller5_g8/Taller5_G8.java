/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller5_g8;

import java.time.LocalDate;

/**
 *
 * @author maric
 */
public class Taller5_G8 {

    public static void main(String[] args) {
       
        TareaConcreta tarea = new TareaConcreta("Taller de DDS");

        // Crea canales de notificación
        NotificacionEmail email = new NotificacionEmail(tarea);
        NotificacionSMS sms = new NotificacionSMS(tarea);


        // Cambia el estado de la tarea
        tarea.setEstado("Próxima a vencer");

        // Elimina el canal de SMS y cambia solo al email
        tarea.eliminarCanal(sms);
        tarea.setEstado("Vencida");
    }
}
