/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controlador;
import modelo.Asignatura;
import modelo.Profesor;
import modelo.Carrera;
import servicio.AsignaturaServicio;

import java.util.ArrayList;
/**
 * 
 * @author Andy Abad
 */
public class AsignaturaControl
{
    private AsignaturaServicio asignaturaServicio;
    private Asignatura asignatura;
    private Profesor profesor;
    private Carrera carrera;
    private ArrayList<Profesor> profesorList=new ArrayList();
    private ArrayList<Carrera> carreraList=new ArrayList();
    
    public AsignaturaControl()
    {
        asignaturaServicio=new AsignaturaServicio();
    }
    
    
    public Asignatura crear(String nombre, int horas, String codigoAsignatura, 
            int horasPractica, String modalidad)
    {
        asignatura=new Asignatura(nombre, horas, codigoAsignatura, horasPractica
        ,modalidad);
        this.asignaturaServicio.crear(asignatura);
        asignatura.agregarProfesor(profesorList);
        asignatura.agregarCarrera(carreraList);
        carreraList=new ArrayList();
        profesorList=new ArrayList();
        
        
        return asignatura;
    }
    public ArrayList<Asignatura> listar()
    {
        return asignaturaServicio.listar();
    }
    public Profesor crearProfesor(String nombre, String correo, String titulo,
            int dia, String mes, int anio, int aniosTrabajo )
    {
        profesor=new Profesor(nombre, correo, titulo, dia, mes, anio, aniosTrabajo);
        profesorList.add(profesor);
        return profesor;
    }
    public Carrera crearCarrera(String nombre, String codigo, String titulo,
            int horasPasantias, String directorCarrera)
    {
        carrera=new Carrera(nombre, codigo, titulo, horasPasantias, directorCarrera);
        carreraList.add(carrera);
        return carrera;
    }
}
