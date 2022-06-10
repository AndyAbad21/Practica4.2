/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo;

/**
 * 
 * @author Andy Abad
 */
public class Carrera
{
    //Atributos
    private String nombre;
    private String codigo;
    private String titulo;
    private int horasPasantias;
    private String directorCarrera;
    //Constructor
    public Carrera(String nombre, String codigo, String titulo, int horasPasantias, String directorCarrera) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.titulo = titulo;
        this.horasPasantias = horasPasantias;
        this.directorCarrera = directorCarrera;
    }
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getHorasPractica() {
        return horasPasantias;
    }
    public void setHorasPractica(int horasPasantias) {
        this.horasPasantias = horasPasantias;
    }

    public String getDirectorCarrera() {
        return directorCarrera;
    }
    public void setDirectorCarrera(String directorCarrera) {
        this.directorCarrera = directorCarrera;
    }
    //Metodos 
    public boolean VerificarSiEsCarreraNueva()
    {
        boolean llave1;
        if(nombre.equals("Electrotecnia"))
        {
            llave1=true;
        }else if(nombre.equals("Telecomunicaciones"))
        {
            llave1=true;
        }else{
            llave1=false;
        }
        return llave1;
    }
    public String PrimeraLetraDeNombre()
    {
        String letra=nombre.substring(0,1);
        return letra;
    }
    //SobreEscritura de motodo toString
   
    @Override
    public String toString()
    {
        return "Nombre: "+nombre+"\n"+"Codigo: "+codigo+"\n"+"Titulo: "+titulo+"\n"+
                "Horas de Pasantias: "+horasPasantias+"\n"+"Director de Carrera: "+
                directorCarrera+"\n";
    }
}
