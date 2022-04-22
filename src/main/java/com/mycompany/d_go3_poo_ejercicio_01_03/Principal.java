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
        
        var carrera2 = new Carrera();
        carrera2.setNombre("Psicologia");
        carrera2.setModalidad("Presencial");
        carrera2.setFacultad("UPS");
        
        
        
        System.out.println("----PRINCIPAL----");
        System.out.println("     CARRERA 1     ");
        System.out.println("La Carrera es: "+carrera.getNombre());
        System.out.println("La modalidad es: "+carrera.getModalidad());
        System.out.println("La facultad es: "+carrera.getFacultad());
        
        System.out.println("La modalidad "+carrera.getModalidad()+" es: "+carrera.esModalidad());
        
        System.out.println("");
        System.out.println("     CARRERA  2   ");
        System.out.println("La Carrera es: "+carrera2.getNombre());
        System.out.println("La modalidad es: "+carrera2.getModalidad());
        System.out.println("La facultad es: "+carrera2.getFacultad());
        
        System.out.println("La modalidad "+carrera2.getModalidad()+" es: "+carrera2.esModalidad());
        System.out.println("");
        
        
        
        var profesor = new Profesor();
        profesor.setNombre("Andres Mejia");
        profesor.setAntiguedad(2002);
        profesor.setEspecialidad("Ingenieria");
        
        var profesor2 = new Profesor();
        profesor2.setNombre("Maritza Torres");
        profesor2.setAntiguedad(2015);
        profesor2.setEspecialidad("Magister");
        
        System.out.println("PROFESOR 1");
        System.out.println("El profesor de la carrera: "+carrera.getNombre()+" es: "+profesor.getNombre());
        System.out.println("Especialidad : "+profesor.getEspecialidad());
        System.out.println("El profesor lleva trabajando en: "+carrera.getFacultad()+" | "+profesor.calcularAntiguedad()+" Años");
        System.out.println("");
        
        System.out.println("PROFESOR 2");
        System.out.println("El profesor de la carrera: "+carrera2.getNombre()+" es: "+profesor2.getNombre());
        System.out.println("Especialidad : "+profesor2.getEspecialidad());
        System.out.println("El profesor lleva trabajando en: "+carrera2.getFacultad()+" | "+profesor2.calcularAntiguedad()+" Años");
        System.out.println("");
        
        var asignatura = new Asignatura();
        asignatura.setNombre("Programacion Orientada a Objetos");
        asignatura.setNivel(2);
        asignatura.setHorasEstudio(20);
        asignatura.setHorasPractica(55);
        
        var asignatura2 = new Asignatura();
        asignatura2.setNombre("Programacion Orientada a Objetos");
        asignatura2.setNivel(5);
        asignatura2.setHorasEstudio(20);
        asignatura2.setHorasPractica(0);
        
        System.out.println("ASIGNATURA 1");
        System.out.println("El nivel de la asignatura: "+asignatura.getNombre()+" es: "+asignatura.getNivel());
        System.out.println("Las horas de estudio Teorico: "+asignatura.getHorasEstudio());
        System.out.println("Las horas de estudio Practico: "+asignatura.getHorasPractica());
        System.out.println("El total de horas de la Asignatura "+asignatura.getNombre()+" son de "+asignatura.horasTotal()+" horas");
        System.out.println("");
        
        System.out.println("ASIGNATURA 2");
        System.out.println("El nivel de la asignatura: "+asignatura2.getNombre()+" es: "+asignatura2.getNivel());
        System.out.println("Las horas de estudio Teorico: "+asignatura2.getHorasEstudio());
        System.out.println("Las horas de estudio Practico: "+asignatura2.getHorasPractica());
        System.out.println("El total de horas de la Asignatura "+asignatura2.getNombre()+" son de "+asignatura2.horasTotal()+" horas");
        System.out.println("");
        
        
              
    }
    
}
