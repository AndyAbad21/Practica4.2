/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo;

import java.io.Serializable;

/**
 * 
 * @author Andy Abad
 */
public class Profesor implements Serializable
{
    private String nombre;
    private String correo;
    private String titulo;
    private int diaNacimiento;
    private String mesNacimiento;
    private int anioNacimiento;
    private int aniosTrabajo;
    private String codigo;
    //Constructor
    public Profesor(String nombre, String correo, String titulo, 
            int diaNacimiento, String mesNacimiento, int anioNacimiento,
            int aniosTrabajo, String codigo) {
        this.nombre = nombre;
        this.correo = correo;
        this.titulo = titulo;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
        this.aniosTrabajo = aniosTrabajo;
        this.codigo=codigo;
    }
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }
    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public String getMesNacimiento() {
        return mesNacimiento;
    }
    public void setMesNacimiento(String mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }
    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public int getAniosTrabajo() {
        return aniosTrabajo;
    }
    public void setAniosTrabajo(int aniosTrabajo) {
        this.aniosTrabajo = aniosTrabajo;
    }
    public String getCodigo()
    {
        return codigo;
    }
    public void setCodigo(String codigo)
    {
        this.codigo=codigo;
    }
    //Metodos
    public Double calcularSuelo()
    {
        Double sueldo;
        sueldo=1000.0+(aniosTrabajo*100);
        return sueldo;
    }
    public int calcularEdad()
    {
        int edad;
        edad=2022-anioNacimiento;
        return edad;
    }
    //SobreEscritura del metodo toString
    @Override
    public String toString()
    {
        return "Nombre: "+nombre+"\n"+"Correo: "+correo+"\n"+"Titulo: "+titulo+"\n"+
                "Fecha Nacimiento: "+diaNacimiento+"/"+mesNacimiento+"/"+anioNacimiento+
                "\n"+"Anios de Trabajo: "+aniosTrabajo+"\n"+"Codigo: "+codigo;
    }
    
}
