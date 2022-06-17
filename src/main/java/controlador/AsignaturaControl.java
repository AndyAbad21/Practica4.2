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
        //tav=new TablaAsignaturasVista();
    }
    
    
    public Asignatura crear(String[] args)
    {
        asignatura=new Asignatura(args[0], Integer.valueOf(args[1]),args[2],
        Integer.valueOf(args[3]), args[4]);
        this.asignaturaServicio.crear(asignatura);
        System.out.println("La asignatura se guardo correctamente");
        return asignatura;
    }
    public ArrayList<Asignatura> listar()
    {
        return asignaturaServicio.listar();
    }
    public Profesor crearProfesor(String[] args)
    {
        profesor=new Profesor(args[0], args[1], args[2], Integer.valueOf(args[3]),
                args[4], Integer.valueOf(args[5]), Integer.valueOf(args[6]), args[7]);
        Asignatura asignatura=asignaturaServicio.listar().get(this.buscarPosicion(args[8]));
        asignatura.agregarProfesor(profesor);
        //System.out.println(asignaturaServicio.listar());
        return profesor;
    }
    public Carrera crearCarrera(String[] args)
    {
        carrera=new Carrera(args[0], args[1], args[2], Integer.valueOf(args[3]), args[4]);
        Asignatura asignatura=asignaturaServicio.listar().get(this.buscarPosicion(args[5]));
        asignatura.agregarCarrera(carrera);
        /*System.out.println("La posicion: "+this.buscarPosicion(args[5]));
        System.out.println("La asignatura: "+asignatura);
        System.out.println("");
        System.out.println(asignaturaServicio.listar());*/
        return carrera;
    }
    
    public Asignatura modificarAsignatura(String[] args)
    {
        asignatura=new Asignatura(args[0], Integer.valueOf(args[1]),args[2],
        Integer.valueOf(args[3]), args[4]);
        this.asignaturaServicio.modificar(asignatura,this.buscarPosicion(args[5]));
        System.out.println("La asignatura se modifico correctamente");
        
        return asignatura;
    }
    public TablaAsignaturasVista actualizarTablaAsignatura()
    {
        
        /*tav=new TablaAsignaturasVista();
        tav.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tav.setTableModel(this.actualizarDatosAsignatura());
        tav.setVisible(true);
        return tav;*/
        tav=new TablaAsignaturasVista();
        tav.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tav.setTableModel();
        tav.setVisible(true);
        return tav;
    }
    public TableModel actualizarDatosAsignatura()
    {
        String[] encabezado=new String[5];
        encabezado[0]="Codigo";
        encabezado[1]="Nombre";
        encabezado[2]="Horas";
        encabezado[3]="Horas Practica";
        encabezado[4]="Modalidad";
        
        var datos=new Object[this.listar().size()][5];
        int i=0;
        for(Asignatura asignatura: this.listar())
        {
            datos[i][0]=asignatura.getCodigoAsignatura();
            datos[i][1]=asignatura.getNombre();
            datos[i][2]=asignatura.getHoras();
            datos[i][3]=asignatura.getHorasPractica();
            datos[i][4]=asignatura.getModalidad();
            i++;
        }
        TableModel modeloTabla=new DefaultTableModel(datos, encabezado);
        return modeloTabla;
    }
    public int buscarPosicion(String codigo)
    {
        
        int posicion=0;
        int i=-1;
        for(Asignatura asignatura:asignaturaServicio.listar())
        {
            i++;
            /*System.out.println("el codigo: "+codigo+"--------------");
            System.out.println("la asignaturaCodigo es:"+asignatura.getCodigoAsignatura() );
            System.out.println("la i es: "+ i);
            System.out.println("El tamanio de la lista "+asignaturaServicio.listar().size());*/
            if(asignatura.getCodigoAsignatura().equals(codigo))
            {
                //System.out.println("Si entro0000000000000000000000000");
                posicion=i;
                break;
            }
        }
        return posicion;
    }
}
