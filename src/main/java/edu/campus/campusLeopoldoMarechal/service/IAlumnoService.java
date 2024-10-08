package edu.campus.campusLeopoldoMarechal.service;

import edu.campus.campusLeopoldoMarechal.model.Alumno;

import java.util.List;

public interface IAlumnoService {

    //Metodo para traer todos los alumnos
    public List<Alumno> getAlumno();

    //metodo para dar de alta un alumno
    public void saveAlumno(Alumno alumno);

    //Metodo para borra un alumno
    public void deleteAlumno(Long id);

    //Metodo para encontrar un alumno
    public Alumno findAlumno(Long id);

    //Metodo para actualizar un alumno
    public Alumno updateAlumno(Long id,Alumno alumno);

    //Metodo para dar de baja alumno
    public Alumno bajaAlumno(Long id,Alumno alumno);
}
