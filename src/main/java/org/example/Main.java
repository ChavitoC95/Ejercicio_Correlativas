package org.example;

public class Main {
    public static void main(String[] args) {

        // Creamos las Materias.

    Materia algoritmosYEstructurasDeDatos = new Materia("Algoritmos y Estructuras de Datos");
    Materia paradigmasDeProgramacion = new Materia("Paradigmas de Programación");
    Materia diseñoDeSistemas = new Materia("Diseño de Sistemas");

        // Agregamos las materias correlativas
        paradigmasDeProgramacion.agregarMateriaCorrelativa(algoritmosYEstructurasDeDatos);
        diseñoDeSistemas.agregarMateriaCorrelativa(paradigmasDeProgramacion);

        // Creamos Los Alumnos.

    Alumno alum1 = new Alumno("Gabriel Chavez");
    Alumno alum2 = new Alumno("Pepe Honguito");
    Alumno alum3 = new Alumno("Fulanito Guerra");

        // Agregamos las materias aprobadas

    alum2.agregarMateriaA(algoritmosYEstructurasDeDatos);
    alum2.agregarMateriaA(paradigmasDeProgramacion);

        // Creamos las Inscripciones

    Inscripcion ins = new Inscripcion (alum1, algoritmosYEstructurasDeDatos);
    ins.informeInscripcion();
    Inscripcion ins2 = new Inscripcion(alum2,diseñoDeSistemas);
    ins2.informeInscripcion();
    Inscripcion ins3 = new Inscripcion(alum3,paradigmasDeProgramacion);
    ins3.informeInscripcion();







    }
}