/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package servicio;

import java.util.ArrayList;
import modelo.Asignatura;
import modelo.Carrera;
import modelo.Profesor;

/**
 * 
 * @author Andy Abad
 */
public class AsignaturaServicio implements IAsignaturaServicio
{
    private static ArrayList<Asignatura> asignaturaList=new ArrayList();
    
    @Override
    public Asignatura crear(Asignatura asignatura)
    {
        asignaturaList.add(asignatura);
        return asignatura;
    }

    @Override
    public ArrayList<Asignatura> listar() 
    {
        return asignaturaList;
    }

    /*@Override
    public Carrera crearCarrera(Carrera carrera) 
    {
        
        return carrera;
    }

    @Override
    public Profesor crearProfesor(Profesor profesor) 
    {
        
        return profesor;
    }*/

    @Override
    public Asignatura modificar(Asignatura asignatura, int posicion) 
    {
        asignaturaList.remove(posicion);
        asignaturaList.add(posicion, asignatura);
        return asignatura;
    }

}
