/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;
import modelo.Asignatura;
import modelo.Carrera;
import modelo.Profesor;

import java.util.ArrayList;
/**
 *
 * @author Andy Abad
 */
public interface IAsignaturaServicio
{
    public Asignatura crear(Asignatura asignatura);
    public Carrera crearCarrera(Carrera carrera,String arg);
    public ArrayList<Asignatura> listar();
    /*public Carrera crearCarrera(Carrera carrera);
    public Profesor crearProfesor(Profesor profesor);*/
    public Asignatura modificarAsignatura(Asignatura asignatura, int posicion);
    public Carrera modificarCarrera(Carrera carrera, int posicionA, int posicionC);
    public Profesor modificarProfesor(Profesor profesor, int posicionA, int posicionP);
    public Asignatura eliminarAsignatura(int posicion);
    public Carrera eliminarCarrera(int posicionA, int posicionC);
    public Profesor eliminarProfesor(int posicionA, int posicionP);
    //public boolean validarCodigoAsignatura(String codigo);
    public boolean almacenarEnArchivo(Asignatura asignatura,String ruta) throws Exception;
    public ArrayList<Asignatura> recuperarDeArchivo(String rutaArvchivo) throws Exception;
    public boolean eliminarArchivo(String rutaArchivo) throws Exception;
}
