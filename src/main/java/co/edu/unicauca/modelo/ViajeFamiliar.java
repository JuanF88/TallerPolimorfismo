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
public class ViajeFamiliar extends Viaje {
 /**
 * Cantidad de integrantes de la familia
 */
 private int familia;

    public ViajeFamiliar(String origen, String destino, int costo, Date fechaIda, Date fechaLlegada, int cantidad) {
        super(origen,destino,costo,fechaIda,fechaLlegada);
        familia = cantidad;
    }
 //Constructor getters and setters
 @Override
 public String descripcion() {
 return "Viaje para disfrutar con toda tu familia";
 }
 @Override
 public String cualquierMetodo2() {
 return "Método implementado en la clase hija viaje familiar";
 }
 public int getFamilia() {
        return familia;    
    }

 public void setFamilia(int familia){
        this.familia = familia;
    }
}
