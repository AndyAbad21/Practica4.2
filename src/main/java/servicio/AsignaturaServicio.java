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
    private static ArrayList<Profesor> profesorList=new ArrayList();
    private static ArrayList<Carrera> carreraList=new ArrayList();
    
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
/*
    @Override
    public Carrera crearCarrera(Carrera carrera) 
    {
        carreraList.add(carrera);
        return carrera;
    }

    @Override
    public Profesor crearProfesor(Profesor profesor) 
    {
        profesorList.add(profesor);
        return profesor;
    }
*/
}
