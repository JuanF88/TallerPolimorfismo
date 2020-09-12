/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.modelo;

import java.util.Date;

/**
 *
 * @author Juan
 */
public abstract class Viaje {
 protected String origen;
 protected String destino;
 protected int costo;
 protected Date fechaSalida;
 protected Date fechaLlegada;
 // Constructores, getters y setters
 
 public Viaje (String origen,String destino,int costo,Date fechaSalida,Date fechaLlegada){
   this.origen = origen;
   this.destino = destino;
   this.costo = costo;
   this.fechaSalida = fechaSalida;
   this.fechaLlegada = fechaLlegada;
 }
 
 public abstract String descripcion();
 public String cualquierMetodo() {
 return "Cualquier método implementado en la clase base";
 }
 public String cualquierMetodo2() {
 return "Cualquier método2 implementado en la clase base";
 }

    public String getOrigen() {
        return origen;    
    }

    public String getDestino() {
        return destino;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public int getCosto() {
        return costo;
    }
}