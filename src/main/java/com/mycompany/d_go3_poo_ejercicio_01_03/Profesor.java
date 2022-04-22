/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.d_go3_poo_ejercicio_01_03;

/**
 *
 * @author USER
 */
public class Profesor extends Carrera{
    
    
    private int antiguedad;
    private String especialidad;

    
    
   
    
    public int calcularAntiguedad(){
        return 2022 - this.antiguedad;
    }




    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    
    
}
