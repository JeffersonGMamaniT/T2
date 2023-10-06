/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t2;

/**
 *
 * @author Jefferson
 */
public class Aula {
    private String nombre;
    private Estudiante[] estudiantes;
    private Profesor[] profesores;
   
    private int proxposic;

    public Aula(String nombre) {
        this.nombre = nombre;
        this.estudiantes=new Estudiante[10];
        this.profesores=new Profesor[1];
    }
    
    public void agregarEstudiante(Estudiante estudiante) {
        
        if (proxposic < estudiantes.length) {
            estudiantes[proxposic] = estudiante;
            proxposic++;
        } else {
            System.out.println("La clase está llena.");
        }
    }

    public Estudiante[] obtenerListaEstudiantes() {
        return estudiantes;
    }
    
    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor[] getProfesores() {
        return profesores;
    }

    public void setProfesores(Profesor[] profesores) {
        this.profesores = profesores;
    }
    
}
