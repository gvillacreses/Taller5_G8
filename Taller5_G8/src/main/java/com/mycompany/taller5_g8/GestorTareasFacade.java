/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller5_g8;

/**
 *
 * @author Anthony
 */
public class GestorTareasFacade{
    private List<CentroControl> tareas;

    public GestorTareasFacade(){
        this.tareas = new ArrayList<>();
    }

    public TareaConcreta crearTarea(String nombre){
        TareaConcreta tarea = new TareaConcreta(nombre);
        tareas.add(tarea);
        return tarea;
    }

    public void agregarCanalNotificacion(CentroControl tarea, String tipoCanal){
        switch (tipoCanal.toLowerCase()){
            case "email":
            new NotificacionEmail(tarea);
            break;
            case "sms":
            new NotificacionSMS(tarea);
            break;
            default:
            System.out.println("Tipo de canal no reconocido: " + tipoCanal);
        }
    }

    public void actualizarEstadoTarea(CentroControl tarea, String nuevoEstado){
        tarea.setEstado(nuevoEstado);
    }

    public void eliminarCanalNotificacion(CentroControl tarea, CanalNotificacion canal){
        tarea.eliminarcanal(canal);
    }

    public void listarTareas(){
        System.out.println("Tareas existentes: ");
        for(CentroControl tarea : tareas){
            System.out.println("-Tarea: " + ((TareaConcreta) tarea).getNombre() + ", Estado: " + tarea.getEstado());
        }
    }
}