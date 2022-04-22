/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.d_go3_poo_ejercicio_01_03;

/**
 *
 * @author USER
 */
public class Carrera {
    
    private String nombre;
    private String modalidad;
    private String facultad;
    
    public boolean esModalidad(){
         var retorno = false;
         
         if(this.modalidad == "Presencial")
             return true;
         if(this.modalidad == "Virtual")
             return false;
         if(this.modalidad == "SemiPresencial")
             return true;
        
        return retorno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
    
    
}
