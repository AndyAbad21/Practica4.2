/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package servicio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
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
            try {
                this.asignaturaList=this.recuperarDeArchivo("C:/Carpeta1/ArchivoAsignaturas.obj");
            } catch (Exception ex) {
                System.out.println("");
            }
            int posicion=this.buscarAsignaturaPorCodigo(arg);
            Asignatura asignatura1=asignaturaList.get(posicion);
            Asignatura asignatura1aux=asignaturaList.get(posicion);
            asignatura1.agregarCarrera(carrera);
            asignaturaList.remove(asignatura1aux);
            asignaturaList.add(posicion,asignatura1);
            try{
                this.eliminarArchivo("C:/Carpeta1/ArchivoAsignaturas.obj");
                for(int i=0;i<asignaturaList.size();i++)
                {
                    Asignatura asignatura2=asignaturaList.get(i);
                    this.almacenarEnArchivo(asignatura2,"C:/Carpeta1/ArchivoAsignaturas.obj");
                }
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
    public Profesor crearProfesor(Profesor profesor,String arg)
    {
        try{
            
            Asignatura asignatura=this.listar().get(this.buscarAsignaturaPorCodigo(arg));
            asignatura.agregarProfesor(profesor);
            try {
                this.asignaturaList=this.recuperarDeArchivo("C:/Carpeta1/ArchivoAsignaturas.obj");
            } catch (Exception ex) {
                System.out.println("");
            }
            int posicion=this.buscarAsignaturaPorCodigo(arg);
            Asignatura asignatura1=asignaturaList.get(posicion);
            Asignatura asignatura1aux=asignaturaList.get(posicion);
            asignatura1.agregarProfesor(profesor);
            asignaturaList.remove(asignatura1aux);
            asignaturaList.add(posicion,asignatura1);
            try{
                this.eliminarArchivo("C:/Carpeta1/ArchivoAsignaturas.obj");
                for(int i=0;i<asignaturaList.size();i++)
                {
                    Asignatura asignatura2=asignaturaList.get(i);
                    this.almacenarEnArchivo(asignatura2,"C:/Carpeta1/ArchivoAsignaturas.obj");
                }
            }catch(Exception e1)
            {
                System.out.println("Error general");
            }
            return profesor;
        }catch(NullPointerException ex)
        {
            throw new NullPointerException("El codigo de profesor ya existe");
        }catch(NumberFormatException ex)
        {
            throw new NumberFormatException("Error en el formato");
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
        try{ 
            try {
                this.asignaturaList=this.recuperarDeArchivo("C:/Carpeta1/ArchivoAsignaturas.obj");
            } catch (Exception ex) {
                System.out.println("Error al recuperar archivos");
            }
            try{
                this.eliminarArchivo("C:/Carpeta1/ArchivoAsignaturas.obj");
                
                asignaturaList.remove(posicion);
                asignaturaList.add(posicion, asignatura);
                for(int i=0;i<asignaturaList.size();i++)
                {
                    Asignatura asignatura2=asignaturaList.get(i);
                    this.almacenarEnArchivo(asignatura2,"C:/Carpeta1/ArchivoAsignaturas.obj");
                }
            }catch(Exception e1)
            {
                System.out.println("Error general");
            }
        }catch(NullPointerException ex)
        {
            throw new NullPointerException("El codigo de profesor ya existe");
        }catch(NumberFormatException ex)
        {
            throw new NumberFormatException("Error en el formato");
        }catch(RuntimeException ex)
        {
            throw new RuntimeException("La asignatura no existe");
        }
        return asignatura;
    }

    @Override
    public Carrera modificarCarrera(Carrera carrera, int posicionA, int posicionC) 
    {
        try{
            try {
                this.asignaturaList=this.recuperarDeArchivo("C:/Carpeta1/ArchivoAsignaturas.obj");
            } catch (Exception ex) {
                System.out.println("");
            }
            asignaturaList.get(posicionA).getCarreraList().remove(posicionC);
            asignaturaList.get(posicionA).getCarreraList().add(posicionC,carrera);
            try{
                this.eliminarArchivo("C:/Carpeta1/ArchivoAsignaturas.obj");
                for(int i=0;i<asignaturaList.size();i++)
                {
                    Asignatura asignatura2=asignaturaList.get(i);
                    this.almacenarEnArchivo(asignatura2,"C:/Carpeta1/ArchivoAsignaturas.obj");
                }
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
    public Profesor modificarProfesor(Profesor profesor, int posicionA, int posicionP)
    {
        
        try{
            try {
                this.asignaturaList=this.recuperarDeArchivo("C:/Carpeta1/ArchivoAsignaturas.obj");
            } catch (Exception ex) {
                System.out.println("");
            }
            asignaturaList.get(posicionA).getProfesorList().remove(posicionP);
            asignaturaList.get(posicionA).getProfesorList().add(posicionP, profesor);
            try{
                this.eliminarArchivo("C:/Carpeta1/ArchivoAsignaturas.obj");
                for(int i=0;i<asignaturaList.size();i++)
                {
                    Asignatura asignatura2=asignaturaList.get(i);
                    this.almacenarEnArchivo(asignatura2,"C:/Carpeta1/ArchivoAsignaturas.obj");
                }
            }catch(Exception e1)
            {
                System.out.println("Error general");
            }
            return profesor;
        }catch(NullPointerException ex)
        {
            throw new NullPointerException("El codigo de profesor ya existe");
        }catch(NumberFormatException ex)
        {
            throw new NumberFormatException("Error en el formato");
        }catch(RuntimeException ex)
        {
            throw new RuntimeException("La asignatura no existe");
        }
    }

    @Override
    public Asignatura eliminarAsignatura(int posicion) 
    {
        try{
            try {
                this.asignaturaList=this.recuperarDeArchivo("C:/Carpeta1/ArchivoAsignaturas.obj");
            } catch (Exception ex) {
                System.out.println("");
            }
            
            Asignatura asignatura1=asignaturaList.get(posicion);
            asignaturaList.remove(posicion);
            try{
                this.eliminarArchivo("C:/Carpeta1/ArchivoAsignaturas.obj");
                for(int i=0;i<asignaturaList.size();i++)
                {
                    Asignatura asignatura2=asignaturaList.get(i);
                    this.almacenarEnArchivo(asignatura2,"C:/Carpeta1/ArchivoAsignaturas.obj");
                }
            }catch(Exception e1)
            {
                System.out.println("Error general");
            }
            
            return asignatura1; 
        }catch(NullPointerException ex)
        {
            throw new NullPointerException("El codigo de profesor ya existe");
        }catch(NumberFormatException ex)
        {
            throw new NumberFormatException("Error en el formato");
        }catch(RuntimeException ex)
        {
            throw new RuntimeException("La asignatura no existe");
        }
    }

    @Override
    public Carrera eliminarCarrera(int posicionA, int posicionC) 
    {
        
        try{
            try {
                this.asignaturaList=this.recuperarDeArchivo("C:/Carpeta1/ArchivoAsignaturas.obj");
            } catch (Exception ex) {
                System.out.println("");
            }
            Carrera carrera=asignaturaList.get(posicionA).getCarreraList().get(posicionC);
            asignaturaList.get(posicionA).getCarreraList().remove(posicionC);
            try{
                this.eliminarArchivo("C:/Carpeta1/ArchivoAsignaturas.obj");
                for(int i=0;i<asignaturaList.size();i++)
                {
                    Asignatura asignatura2=asignaturaList.get(i);
                    this.almacenarEnArchivo(asignatura2,"C:/Carpeta1/ArchivoAsignaturas.obj");
                }
            }catch(Exception e1)
            {
                System.out.println("Error general");
            }
            
            return carrera; 
        }catch(NullPointerException ex)
        {
            throw new NullPointerException("El codigo de profesor ya existe");
        }catch(NumberFormatException ex)
        {
            throw new NumberFormatException("Error en el formato");
        }catch(RuntimeException ex)
        {
            throw new RuntimeException("La asignatura no existe");
        }           
    }

    @Override
    public Profesor eliminarProfesor(int posicionA, int posicionP) 
    {
        try{
            try {
                this.asignaturaList=this.recuperarDeArchivo("C:/Carpeta1/ArchivoAsignaturas.obj");
            } catch (Exception ex) {
                System.out.println("");
            }
            Profesor profesor=asignaturaList.get(posicionA).getProfesorList().get(posicionP);
            asignaturaList.get(posicionA).getProfesorList().remove(posicionP);
            try{
                this.eliminarArchivo("C:/Carpeta1/ArchivoAsignaturas.obj");
                for(int i=0;i<asignaturaList.size();i++)
                {
                    Asignatura asignatura2=asignaturaList.get(i);
                    this.almacenarEnArchivo(asignatura2,"C:/Carpeta1/ArchivoAsignaturas.obj");
                }
            }catch(Exception e1)
            {
                System.out.println("Error general");
            }
            
            return profesor; 
        }catch(NullPointerException ex)
        {
            throw new NullPointerException("El codigo de profesor ya existe");
        }catch(NumberFormatException ex)
        {
            throw new NumberFormatException("Error en el formato");
        }catch(RuntimeException ex)
        {
            throw new RuntimeException("La asignatura no existe");
        }         
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
        File archivo = new File(rutaArchivo);
        archivo.delete();
        return llave;
    }
    /*@Override
    public void validarCodigoAsignatura(String codigo)
    {
        String llave="";
        try{
            for(int i=0;i<this.listar().size();i++)
            {
                Asignatura asignatura=this.listar().get(i);
                if(asignatura.getCodigoAsignatura().equals(codigo))
                {
                    llave=null;
                    break;
                }
            }
            if(llave.equals(""))
            {
                
            }
        }catch(NullPointerException ex)
        {
            throw new NullPointerException("");
        }
    }*/

}
