/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.d_go3_poo_ejercicio_01_03;

/**
 *
 * @author USER
 */
public class Principal {
    public static void main(String[] args) {
        
        var carrera = new Carrera();
        carrera.setNombre("Computacion");
        carrera.setModalidad("Presencial");
        carrera.setFacultad("UPS");
        
        
        System.out.println("----PRINCIPAL----");
        System.out.println("     CARRERA     ");
        System.out.println("La Carrera es: "+carrera.getNombre());
        System.out.println("La modalidad es: "+carrera.getModalidad());
        System.out.println("La facultad es: "+carrera.getFacultad());
        
        System.out.println("La modalidad "+carrera.getModalidad()+" es: "+carrera.esModalidad());
        
        
        var profesor = new Profesor();
        profesor.setNombre("Andres Mejia");
        profesor.setAntiguedad(2002);
        profesor.setEspecialidad("Ingenieria");
        
        System.out.println("El profesor de la carrera: "+carrera.getNombre()+" es: "+profesor.getNombre());
        System.out.println("Especialidad : "+profesor.getEspecialidad());
        System.out.println("El profesor lleva trabajando en: "+carrera.getFacultad()+" | "+profesor.calcularAntiguedad()+" Años");
        
        
        var asignatura = new Asignatura();
        asignatura.setNombre("Programacion Orientada a Objetos");
        asignatura.setNivel(2);
        asignatura.setHorasEstudio(20);
        asignatura.setHorasPractica(55);
        
        System.out.println("El nivel de la asignatura: "+asignatura.getNombre()+" es: "+asignatura.getNivel());
        System.out.println("Las horas de estudio Teorico: "+asignatura.getHorasEstudio());
        System.out.println("Las horas de estudio Practico: "+asignatura.getHorasPractica());
        System.out.println("El total de horas de la Asignatura "+asignatura.getNombre()+" son de "+asignatura.horasTotal()+" horas");
             
    }
    
}
