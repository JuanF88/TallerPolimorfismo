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
public class ViajeIncentivo extends Viaje {
 /**
 * Empresa que patrocina el viaje al empleado
 */
 private String empresa;

    public ViajeIncentivo(String origen, String destino, int costo, Date fechaIda, Date fechaLlegada, String empresa) {
        super(origen,destino,costo,fechaIda,fechaLlegada);
        this.empresa = empresa;
    }
    
 //Constructor, getters and setters
 @Override
 public String descripcion() {
 return "Viaje incentivo que te envia la empresa " + empresa;
 }

 public String cualquierMetodo2() {
 return "Método implementado en la clase hija viaje de incentivo";
 }
 public String getEmpresa() {
        return empresa;    
    }

 public void setFamilia(String empresa){
        this.empresa = empresa;
    }
}
