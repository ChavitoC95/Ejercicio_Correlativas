package org.example;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;

    private List <Materia>materiasAprobadas;


    public Alumno(String nombre) {
        this.nombre = nombre;
        this.materiasAprobadas= new ArrayList<Materia>();

    }



    public String getNombre() {
        return nombre;
    }


    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void agregarMateriaA (Materia materia){
        this.materiasAprobadas.add(materia);
    }
    public boolean tenesCorrelativas(Materia materiaCorrelativa) {
        return this.materiasAprobadas.contains(materiaCorrelativa);
    }
}
