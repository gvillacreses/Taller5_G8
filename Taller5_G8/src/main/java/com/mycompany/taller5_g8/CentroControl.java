/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller5_g8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maric
 */
public abstract class CentroControl {
    private String nombre;
    private String estado;
    protected List<CanalNotificacion> canales = new ArrayList<>(); 

    public void agregarCanal(CanalNotificacion canal) {
        canales.add(canal); 
    }

    public void eliminarCanal(CanalNotificacion canal) {
        canales.remove(canal); 
    }

    public void setEstado(String estado) {
        this.estado = estado;
        notificarCanales(); 
    }

    public String getEstado() {
        return estado; 
    }

    private void notificarCanales() {
        for (CanalNotificacion canal : canales) {
            canal.actualizar(); 
        }
    }
}
