/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo;
import java.util.ArrayList;
/**
 * 
 * @author Andy Abad
 */
public class Asignatura 
{
    //Artibutos
    private String nombre;
    private int horas;
    private String codigoAsignatura;
    private int horasPractica;
    private String modalidad;
    private ArrayList<Carrera> carreraList;
    private ArrayList<Profesor> profesorList;
    //Constructor
    public Asignatura(String nombre, int horas, String codigoAsignatura, int horasPractica, String modalidad) {
        this.nombre = nombre;
        this.horas = horas;
        this.codigoAsignatura = codigoAsignatura;
        this.horasPractica = horasPractica;
        this.modalidad = modalidad;
    }
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getCodigoAsignatura() {
        return codigoAsignatura;
    }
    public void setCodigoAsignatura(String codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }

    public int getHorasPractica() {
        return horasPractica;
    }
    public void setHorasPractica(int horasPractica) {
        this.horasPractica = horasPractica;
    }

    public String getModalidad() {
        return modalidad;
    }
    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }
    //Metodos
    public ArrayList<Carrera> agregarCarrera(ArrayList<Carrera> carreraList)
    {
        this.carreraList=carreraList;
        return carreraList;
    }
    public ArrayList<Profesor> agregarProfesor(ArrayList<Profesor> profesorList)
    {
        this.profesorList=profesorList;
        return profesorList;
    }
    
    public int cacularHorasDeExamenes()
    {
        int horasE;
        horasE=horas-10;
        return horasE;
    }
    public String PrimeraLetraDeNombre()
    {
        String letra=nombre.substring(0,1);
        return letra;
    }
    public String imprimir(ArrayList lista)
    {
        String cadena="";
        for(Object object: lista)
        {
            cadena=cadena+object+"\n";
        }
        return cadena;
    }
    //SobreEscritura de metodo toString
    @Override
    public String toString()
    {
        String cadena1="++++++Carreras+++++++"+"\n"+this.imprimir(carreraList)+
                "\n"+"++++++Profesores+++++"+"\n"+this.imprimir(profesorList);
        return "Nombre: "+nombre+"\n"+"Horas: "+horas+"\n"+"Codigo de Asignatura: "+
                codigoAsignatura+"\n"+"Horas de Practica: "+horasPractica+"\n"+
                "Modalidad: "+modalidad+"\n"+cadena1+"\n";
    }
    
}
