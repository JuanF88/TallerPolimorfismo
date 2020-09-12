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
public class ViajeTodoIncluido extends Viaje {

    public ViajeTodoIncluido(String origen, String destino, int costo, Date fechaIda, Date fechaLlegada) {
        super(origen,destino,costo,fechaIda,fechaLlegada);
    }
 // Constructores
 @Override
 public String descripcion() {
 return "Disfruta tu viaje todo incluido";
 }
 //No se sobreescribe cualquierMetodo2()
}

