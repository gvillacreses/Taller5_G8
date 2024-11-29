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
    private List<Tarea> tareas;

    public GestorTareasFacade(){
        this.tareas = new ArrayList<>();
    }

    public TareaConcreta crearTarea(String nombre){
        TareaConcreta tarea = new TareaConcreta(nombre);
        tareas.add(tarea);
        return tarea;
    }

    public void agregarCanalNotificacion(Tarea tarea, String tipoCanal){
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

    public void actualizarEstadoTarea(Tarea tarea, String nuevoEstado){
        tarea.setEstado(nuevoEstado);
    }

    public void eliminarCanalNotificacion(Tarea tarea, CanalNotificacion canal){
        tarea.eliminarcanal(canal);
    }

    public void listarTareas(){
        System.out.println("Tareas existentes: ");
        for(Tarea tarea : tareas){
            System.out.println("-Tarea: " + ((TareaConcreta) tarea).getNombre() + ", Estado: " + tarea.getEstado());
        }
    }
}