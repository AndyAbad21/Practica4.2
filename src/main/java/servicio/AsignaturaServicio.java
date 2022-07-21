/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package servicio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        try{
            this.almacenarEnArchivo(asignatura,"C:/Carpeta1/ArchivoAsignaturas.obj");
        }catch(Exception e1)
        {
            System.out.println("Error general");
        }
        return asignatura;
    }

    @Override
    public Carrera crearCarrera(Carrera carrera,String arg)
    { 
        try{
            //Asignatura asignatura=this.listar().get(this.buscarAsignaturaPorCodigo(arg));
            
            try {
                this.asignaturaList=this.recuperarDeArchivo("C:/Carpeta1/ArchivoAsignaturas.obj");
            } catch (Exception ex) {
                System.out.println("");
            }
            Asignatura asignatura=asignaturaList.get(this.buscarAsignaturaPorCodigo(arg));
            asignatura.agregarCarrera(carrera);
            try{
                this.eliminarArchivo("C:/Carpeta1/ArchivoAsignaturas.obj");
                this.almacenarEnArchivo(asignatura,"C:/Carpeta1/ArchivoAsignaturas.obj");
            }catch(Exception e1)
            {
                System.out.println("Error general");
            }
            
            return carrera;
        }catch(NullPointerException ex)
        {
            throw new NullPointerException("La carrera ya existe");
        }catch(NumberFormatException ex)
        {
            throw new NumberFormatException("Error en el formato del numero");
        }catch(RuntimeException ex)
        {
            throw new RuntimeException("La asignatura no existe");
        }
    }
    @Override
    public ArrayList<Asignatura> listar() 
    {
        try{
            this.asignaturaList=this.recuperarDeArchivo("C:/Carpeta1/ArchivoAsignaturas.obj");
        }catch(Exception e1)
        {
            System.out.println("Error al recuperar el archivo");
        }
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
    
    @Override
    public boolean almacenarEnArchivo(Asignatura asignatura, String rutaArchivo) throws Exception {
        ObjectOutputStream salida=null;
        boolean retorno=false;
        try{
            salida = new ObjectOutputStream(new FileOutputStream(new File(rutaArchivo),true));
            salida.writeObject(asignatura);
            salida.close();
            retorno=true;
        }catch(Exception e1){
            System.out.println(e1.toString());
            salida.close();
        }
        return retorno;
    }

    @Override
    public ArrayList<Asignatura> recuperarDeArchivo(String rutaArchivo) throws Exception {
        
        var asignaturaList = new ArrayList<Asignatura>();
        var fis = new FileInputStream(new File(rutaArchivo));
        ObjectInputStream entrada = null;
        try{        
            while(fis.available()>0){
                entrada = new ObjectInputStream(fis);
                Asignatura asignatura = (Asignatura) entrada.readObject();
                asignaturaList.add(asignatura);
            }
            entrada.close();
        }catch(Exception ex){
            entrada.close();
        }
        System.out.println("Si entro al recuperar archivos");
        System.out.println(asignaturaList);
        return asignaturaList;
        
    }
    public int buscarAsignaturaPorCodigo(String codigo)
    { 
        try{
            int posicion=-1;
            int i=-1;
            for(Asignatura asignatura:this.listar())
            {
                i++;
                if(asignatura.getCodigoAsignatura().equals(codigo))
                {
                    posicion=i;
                    break;
                }
            }
            return posicion;
        }
        catch(RuntimeException ex)
        {
            throw new RuntimeException("Error de busqueda de la asignatura");
        }
            
    }

    @Override
    public boolean eliminarArchivo(String rutaArchivo) throws Exception {
        boolean llave=false;
        ObjectOutputStream salida=null;
        try{
            salida = new ObjectOutputStream(new FileOutputStream(new File(rutaArchivo),false));
            salida;
            salida.close();
            llave=true;
        }catch(Exception e1){
            System.out.println(e1.toString());
            salida.close();
        }
        return llave;
    }
}
