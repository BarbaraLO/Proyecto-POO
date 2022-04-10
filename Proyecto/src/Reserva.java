
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naomi
 */
public class Reserva {
    
    private int CodigoReserva;
    private Date Fecha;
    private ArrayList<Reserva> LReserva = new ArrayList<>();
    private ArrayList <Pacientes> LPacientes = new  ArrayList <>();
    
    public Reserva(){
        LReserva = new ArrayList<>();
    }

    public Reserva(int CodigoReserva, ArrayList<Pacientes> pacientes, Date Fecha) {
        this.CodigoReserva= CodigoReserva;
       // this.PPacientes=PPacientes;
        this.LPacientes=pacientes;
        this.Fecha=Fecha;
    }
    
    public int getCodigoReserva() {
        return CodigoReserva;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setCodigoReserva(int CodigoReserva) {
        this.CodigoReserva = CodigoReserva;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
    
    public void InsertarDatos(Pacientes paciente) throws ParseException{
        
        int ID;
        String fecha;
        int RutPaciente;
        
        Scanner Entrada = new Scanner(System.in);
        
        System.out.println("Ingrese rut del paciente");
        RutPaciente= Entrada.nextInt();
        
        if(paciente.buscarPaciente(RutPaciente)== true){
            
            System.out.println("DATOS PACIENTE");
            System.out.println("Nombre :"+paciente.getNombre());
            System.out.println("Rut :"+paciente.getRut());
            System.out.println("Telefono:"+paciente.getTelefono());
            System.out.println("Correo :"+paciente.getCorreo());
            
            System.out.println("Ingrese ID de la reserva");
            ID=Entrada.nextInt();
            
            System.out.println("Ingrese fecha de reserva:");
            fecha=Entrada.next();
            
            Date FFecha=new SimpleDateFormat("dd/mm/yyyy").parse(fecha);
            
            Reserva reservas = new Reserva(ID,paciente.getPacientes(),FFecha);
            LReserva.add(reservas);
            
            System.out.println("*** Reserva creada ***");
        }  
    }
    
    public void ImprimirDatos(){
        for(int i=0; i<LReserva.size(); i++){
            System.out.println("******************************");
            System.out.println("Nombre:"+LReserva.get(i).LPacientes.get(i).getNombre());
            System.out.println("Cedula de Identidad:"+LReserva.get(i).LPacientes.get(i).getRut());
            System.out.println("Telefono:"+LReserva.get(i).LPacientes.get(i).getTelefono());     
            System.out.println("Hora reservada:"+LReserva.get(i).getFecha());
            System.out.println("Codigo de reserva:"+LReserva.get(i).getCodigoReserva());
            System.out.println("******************************");
        }
    }
}
