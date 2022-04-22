/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.d_go3_poo_ejercicio_01_03;

/**
 *
 * @author USER
 */
    public class Asignatura extends Carrera{
        
        private int nivel;
        private int horasEstudio;
        private int horasPractica;
        
        public int horasTotal(){
            
            return this.horasEstudio + this.horasPractica;
            
        }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getHorasEstudio() {
        return horasEstudio;
    }

    public void setHorasEstudio(int horasEstudio) {
        this.horasEstudio = horasEstudio;
    }

    public int getHorasPractica() {
        return horasPractica;
    }

    public void setHorasPractica(int horasPractica) {
        this.horasPractica = horasPractica;
    }
    
        
}
