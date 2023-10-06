/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t2;
import java.util.List;

/**
 *
 * @author Jefferson
 */
public class Estudiante {
    private String nombre;
    private List<Aula> aulas;
    private boolean presente;

    public Estudiante(){};
    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.presente = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public List<Aula> getAulas() {
        return aulas;
    }

    public void setAula(List<Aula> aulas) {
        this.aulas = aulas;
    }
    
    public boolean estaPresente() {
        return presente;
    }

    public void marcarAsistencia() {
        presente = true;
    }
    
    
}
