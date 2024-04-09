/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.TreeSet;

/**
 * Clase que representa un curso.
 * Esta clase almacena información sobre un curso, incluido su nombre y una lista de alumnos.
 *
 * @author Odei
 * @version 1.0
 */
public class Curso {

    private String xnombre;
    private TreeSet<Persona> listaAlumnos;

    protected String getNombre() {
        return nombre;
    }

    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }

    @Override
    public String toString() {
        String s = "--------------------" + nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : listaAlumnos) {
            s += listaAlumno + "\n";
        }
        return s;
    }
    /**
     * Añade un alumno al curso.
     *
     * @param alumno El alumno a añadir al curso.
     */
    public void aniadirAlumno(Persona p) {
        listaAlumnos.add(p);
    }
}
