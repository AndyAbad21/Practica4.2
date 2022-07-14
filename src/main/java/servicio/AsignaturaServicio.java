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

    @Override
    public Asignatura modificarAsignatura(Asignatura asignatura, int posicion) 
    {
        asignaturaList.remove(posicion);
        asignaturaList.add(posicion, asignatura);
        return asignatura;
    }

    @Override
    public Carrera modificarCarrera(Carrera carrera, int posicionA, int posicionC) 
    {
        asignaturaList.get(posicionA).getCarreraList().remove(posicionC);
        asignaturaList.get(posicionA).getCarreraList().add(posicionC,carrera);
        return carrera;
    }

    @Override
    public Profesor modificarProfesor(Profesor profesor, int posicionA, int posicionP)
    {
        asignaturaList.get(posicionA).getProfesorList().remove(posicionP);
        asignaturaList.get(posicionA).getProfesorList().add(posicionP, profesor);
        return profesor;
    }

    @Override
    public Asignatura eliminarAsignatura(int posicion) 
    {
        return asignaturaList.remove(posicion); 
    }

    @Override
    public Carrera eliminarCarrera(int posicionA, int posicionC) 
    {
        return asignaturaList.get(posicionA).getCarreraList().remove(posicionC);           
    }

    @Override
    public Profesor eliminarProfesor(int posicionA, int posicionP) 
    {
        return asignaturaList.get(posicionA).getProfesorList().remove(posicionP);
    }

    /*@Override
    public boolean validarCodigoAsignatura(String codigo)
    {
        boolean llave;
        try{
            //boolean llave;
            for(int i=0;i<asignaturaList.size();i++)
            {
                Asignatura asignatura=asignaturaList.get(i);
                if(asignatura.getCodigoAsignatura().equals(codigo))
                {
                    llave=true;
                    break;
                }
            }
            return llave;
        }catch(Exception ex)
        {
            
        }
    }*/
    

}
