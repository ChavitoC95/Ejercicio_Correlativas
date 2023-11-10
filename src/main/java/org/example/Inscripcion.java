package org.example;

public class Inscripcion {
    private Alumno alumno;
    private Materia materia;


    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
    }



    public Alumno getAlumno() {
        return alumno;
    }

    public Materia getMateria() {
        return materia;
    }

   public boolean aprobada(){
      return !this.materia.tenesCorrelativas() || this.materia.puedeCursar(this.alumno);
    }
    public void informeInscripcion (){
        String informe = "";
        if(!this.aprobada()){
            informe = " La inscripcion fue rechazada por no complir con las materias correlativas";
            System.out.println(getAlumno().getNombre() + informe);
        }else {
            informe =" La inscripcion se realizo correctamente";
            System.out.println(getAlumno().getNombre() + informe);

        }

      }
    }


