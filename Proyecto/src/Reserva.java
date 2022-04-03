
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
    private Pacientes PPacientes;
    private Date Fecha;
    private final ArrayList<Reserva> LReserva = new ArrayList<>();
    
    public Reserva(){
        
    }
    
    public Reserva(int CodigoReserva, Pacientes PPacientes, Date Fecha){
        this.CodigoReserva= CodigoReserva;
        this.PPacientes=PPacientes;
        this.Fecha=Fecha;
    }

    public int getCodigoReserva() {
        return CodigoReserva;
    }

    public Pacientes getPPacientes() {
        return PPacientes;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setCodigoReserva(int CodigoReserva) {
        this.CodigoReserva = CodigoReserva;
    }

    public void setPPacientes(Pacientes PPacientes) {
        this.PPacientes = PPacientes;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
    
    public void InsertarDatos(Pacientes paciente) throws ParseException{
        
        int ID;
        String fecha;
        String RutPaciente;
        
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Ingrese rut del paciente");
        RutPaciente= Entrada.next();
        
        if(paciente.buscarPaciente(RutPaciente)){
            
            paciente= paciente.RutPaciente(RutPaciente);
            
            System.out.println("DATOS PACIENTE");
            System.out.println("Nombre :"+paciente.getNombre());
            System.out.println("Rut :"+paciente.getRut());
            System.out.println("Telefono:"+paciente.getTelefono());
            System.out.println("Correo :"+paciente.getCorreo());
            
            System.out.println("Ingrese ID de la reserva");
            ID=Entrada.nextInt();
            
            System.out.println("Ingrese rut del paciente ");
            fecha=Entrada.next();
            
            Date FFecha=new SimpleDateFormat("dd/mm/yyyy").parse(fecha);
            Reserva reservas = new Reserva(ID,paciente,FFecha);
            LReserva.add(reservas);
            
            System.out.println("Reserva creada");
        }
        
        
    }
    
    public void ImprimirDatos(){
        int i;
        for(i=0; i<LReserva.size(); i++){
            System.out.println("Nombre:"+LReserva.get(i).PPacientes.getNombre()+"\nCedula de Identidad"+LReserva.get(i).PPacientes.getRut()+"\n"+" Telefono"+LReserva.get(i).PPacientes.getTelefono());
        }
    }
}
