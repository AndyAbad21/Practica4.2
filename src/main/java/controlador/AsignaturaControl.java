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
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import vista.tablas.TablaAsignaturasVista;
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
    private TablaAsignaturasVista tav;
    
    public AsignaturaControl()
    {
        asignaturaServicio=new AsignaturaServicio();
    }
    
    public Asignatura crear(String[] args)
    {
        try{
            
            this.validarCodigoAsignatura(args[2]);
            asignatura=new Asignatura(args[0],stringAInt(args[1]),args[2],
            stringAInt(args[3]), args[4]);
            this.asignaturaServicio.crear(asignatura);
            return asignatura;
        }catch(NullPointerException ex)
        {
            throw new NullPointerException("El codigo se repite");
        }
        catch(NumberFormatException ex)
        {
            throw new NumberFormatException("Error en el formato de numero");
        }catch(Exception ex)
        {
            throw new RuntimeException("Error inesperado");
        }
    }
    public Carrera crearCarrera(String[] args)
    {
        try{
            this.validarCodigoCarrera(args[5],args[1]);
            carrera=new Carrera(args[0], args[1], args[2], stringAInt(args[3]), args[4]);
            Asignatura asignatura=asignaturaServicio.listar().get(this.buscarAsignaturaPorCodigo(args[5]));
            asignatura.agregarCarrera(carrera);
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
    public Profesor crearProfesor(String[] args)
    {
        try{
            this.validarCodigoProfesor(args[8], args[7]);
            profesor=new Profesor(args[0], args[1], args[2], stringAInt(args[3]),
                args[4], stringAInt(args[5]), stringAInt(args[6]), args[7]);
            Asignatura asignatura=asignaturaServicio.listar().get(this.buscarAsignaturaPorCodigo(args[8]));
            asignatura.agregarProfesor(profesor);
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
    
    
    public ArrayList<Asignatura> listar()
    {
        return asignaturaServicio.listar();
    }
    
    public Asignatura modificarAsignatura(String[] args)
    {
        try{
            asignatura=new Asignatura(args[0], stringAInt(args[1]),args[2],
            stringAInt(args[3]), args[4]);
            this.asignaturaServicio.modificarAsignatura(asignatura,this.buscarAsignaturaPorCodigo(args[5]));

            return asignatura;
        }catch(NumberFormatException ex)
        {
            throw new NumberFormatException("El formato es invalido");
        }catch(RuntimeException ex)
        {
            throw new RuntimeException("Error de ejecucion");
        }
    }
    public Carrera modificarCarrera(String[] args)
    {
        try{
            carrera=new Carrera(args[0], args[1], args[2], stringAInt(args[3]), args[4]);
            this.asignaturaServicio.modificarCarrera(carrera,this.buscarAsignaturaPorCodigo(args[5]),
                    this.buscarCarreraPorCodigo(args[5], args[6]));

            return carrera;
        }catch(NumberFormatException ex)
        {
            throw new NumberFormatException("El formato es invalido");
        }catch(RuntimeException ex)
        {
            throw new RuntimeException("Error de ejecucion");
        }
    }
    public Profesor modificarProfesor(String[] args)
    {
        try{
            profesor=new Profesor(args[0], args[1], args[2], stringAInt(args[3]),
                args[4], stringAInt(args[5]), stringAInt(args[6]), args[7]);
            asignaturaServicio.modificarProfesor(profesor,this.buscarAsignaturaPorCodigo(args[8]),
                    this.buscarProfesorPorCodigo(args[8],args[9]));
            return profesor;
        }catch(NumberFormatException ex)
        {
            throw new NumberFormatException("Error en el formato");
        }catch(RuntimeException ex)
        {
            throw new RuntimeException("Error en la ejecucion");
        }
    }
    
    public Asignatura eliminarAsignatura(String codigo)
    {
        try{
            this.validarAsignatura(codigo);
            return asignaturaServicio.eliminarAsignatura(this.buscarAsignaturaPorCodigo(codigo));
        }catch(NullPointerException ex)
        {
            throw new NullPointerException("");
        }
    }
    public Carrera eliminarCarrera(String codigoA, String codigoC)
    {
        try{
            this.validarCarrera(codigoA, codigoC);
            return asignaturaServicio.eliminarCarrera(this.buscarAsignaturaPorCodigo(codigoA),
                    this.buscarCarreraPorCodigo(codigoA, codigoC));
        }catch(NullPointerException ex)
        {
            throw new NullPointerException("La asignatura no existe");
        }
    }
    public Profesor eliminarProfesor(String codigoA, String codigoP)
    {
        return asignaturaServicio.eliminarProfesor(this.buscarAsignaturaPorCodigo(codigoA),this.buscarProfesorPorCodigo(codigoA, codigoP));
    }
    
    public int buscarAsignaturaPorCodigo(String codigo)
    { 
        try{
            int posicion=-1;
            int i=-1;
            for(Asignatura asignatura:asignaturaServicio.listar())
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
    public int buscarCarreraPorCodigo(String codigoA, String codigoC)
    {
        try{
            int posicion=-1;
            int i=-1;
            Asignatura asignatura=asignaturaServicio.listar().get(this.buscarAsignaturaPorCodigo(codigoA));
            for(Carrera carrera:asignatura.getCarreraList())
            {
                i++;
                if(carrera.getCodigo().equals(codigoC))
                {
                    posicion=i;
                    break;
                }
            }
            return posicion;
        }catch(RuntimeException ex)
        {
            throw new RuntimeException("Error de ejecucion");
        }
    }
    public int buscarProfesorPorCodigo(String codigoA, String codigoP)
            
    {
        try
        {
            int posicion=-1;
            int i=-1;
            Asignatura asignatura=asignaturaServicio.listar().get(this.buscarAsignaturaPorCodigo(codigoA));
            for(Profesor profesor: asignatura.getProfesorList())
            {
                i++;
                if(profesor.getCodigo().equals(codigoP))
                {
                    posicion=i;
                    break;
                }
            }
            return posicion;
        }catch(RuntimeException ex)
        {
            throw new RuntimeException("Error en la ejecucion");
        }
    }
    public int stringAInt(String cadena)
    {
        try{
            return Integer.valueOf(cadena);
        }catch(NumberFormatException ex1)
        { 
            throw new NumberFormatException("Error en el formato del numero");
        }
    }
    public void validarCodigoAsignatura(String codigo)
    {
        String llave="";
        try{
            for(int i=0;i<asignaturaServicio.listar().size();i++)
            {
                Asignatura asignatura=asignaturaServicio.listar().get(i);
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
    }
    public void validarCodigoCarrera(String codigoA,String codigoC)
    {
        String llave="";
        try{
            Asignatura asignatura=asignaturaServicio.listar().get(
                    this.buscarAsignaturaPorCodigo(codigoA));
            for(int i=0;i<asignatura.getCarreraList().size();i++)
            {  
                if(asignatura.getCarreraList().get(i).getCodigo().equals(codigoC))
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
            throw new NullPointerException("El codigo de carrera ya existe");
        }
    }
    public void validarCodigoProfesor(String codigoA, String codigoP)
    {
        String llave="";
        try{
            Asignatura asignatura=asignaturaServicio.listar().get(
                    this.buscarAsignaturaPorCodigo(codigoA));
            for(int i=0;i<asignatura.getProfesorList().size();i++)
            {  
                if(asignatura.getProfesorList().get(i).getCodigo().equals(codigoP))
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
            throw new NullPointerException("El codigo de profesor ya existe");
        }
    }
    
    public void validarAsignatura(String codigoA)
    {
        String llave=null;
        try{
            for(int i=0;i<asignaturaServicio.listar().size();i++)
            {
                if(asignaturaServicio.listar().get(i).getCodigoAsignatura().equals(codigoA))
                {
                    llave="";
                }
            }
            if(llave.equals(""))
            {
                
            }
        }catch(NullPointerException ex)
        {
            throw new NullPointerException("El codigo de la asignatura si existe");
        }
    }
    public void validarCarrera(String codigoA, String codigoC)
    {
        String llave=null;
        try{
            Asignatura asignatura=asignaturaServicio.listar().get(
                    this.buscarAsignaturaPorCodigo(codigoA));
            for(int i=0;i<asignatura.getCarreraList().size();i++)
            {  
                if(asignatura.getCarreraList().get(i).getCodigo().equals(codigoC))
                {
                    llave="";
                    break;
                }
            }
            if(llave.equals(""))
            {
                
            }
        }catch(NullPointerException ex)
        {
            throw new NullPointerException("El codigo de la carrera no existe");
        }
    }
    public void validarProfesor(String codigoA,String codigoP)
    {
        String llave=null;
        try{
            Asignatura asignatura=asignaturaServicio.listar().get(
                    this.buscarAsignaturaPorCodigo(codigoA));
            for(int i=0;i<asignatura.getProfesorList().size();i++)
            {  
                if(asignatura.getProfesorList().get(i).getCodigo().equals(codigoP))
                {
                    llave="";
                    break;
                }
            }
            if(llave.equals(""))
            {
                
            }
        }catch(NullPointerException ex)
        {
            throw new NullPointerException("El codigo del profesor no existe");
        }
    }
}
