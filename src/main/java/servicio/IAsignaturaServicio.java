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
    public ArrayList<Asignatura> listar();
    /*public Carrera crearCarrera(Carrera carrera);
    public Profesor crearProfesor(Profesor profesor);*/
    public Asignatura modificar(Asignatura asignatura, int posicion);
}
