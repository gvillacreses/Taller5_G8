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

        TareaConcreta tareaFacade = gestor.crearTarea("Taller de DDS");

        gestor.agregarCanalNotificacion(tareaFacade, "email");
        gestor.agregarCanalNotificacion(tareaFacade, "sms");

        gestor.actualizarEstadoTarea(tareaFacade, "Proxima a vencer");

        gestor.listarTareas();

        gestor.eliminarCanalNotificacion(tareaFacade, tarea.canales.get(1));
        gestor.actualizarEstadoTarea(tareaFacade, "Vencida");

        gestor.listarTareas();

        TareaFactory simpleFactory = new TareaSimpleFactory();
        TareaFactory complejaFactory = new TareaComplejaFactory();

        Tarea tarea1 = simpleFactory.crearTarea();
        tarea1.setPrioridad(1);
        tarea1.setEstado("En progreso");
        ((TareaSimple) tarea1).setAsignacion("Asignación 1");

        Tarea tarea2 = complejaFactory.crearTarea();
        tarea2.setPrioridad(2);
        tarea2.setEstado("Pendiente");
        ((TareaCompleja) tarea2).setProyecto("Proyecto Final");

        // Imprimir las tareas
        System.out.println(tarea1);
        System.out.println(tarea2);

        EstiloVisualizacion lista = new ListaVisualizacion();
        EstiloVisualizacion tablero = new TableroVisualizacion();
        EstiloVisualizacion calendario = new CalendarioVisualizacion();

        PreferenciaVisualizacion preferencia = new PreferenciaVisualizacion(lista);

        preferencia.verTareas();

        preferencia.setEstiloVisualizacion(tablero);
        preferencia.verTareas();

        preferencia.setEstiloVisualizacion(calendario);
        preferencia.verTareas();
    }
}
