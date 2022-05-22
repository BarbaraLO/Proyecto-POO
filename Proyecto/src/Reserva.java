import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Reserva implements Interface {
    
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

    public ArrayList<Reserva> getLReserva() {
        return LReserva;
    }

    public ArrayList<Pacientes> getLPacientes() {
        return LPacientes;
    }
    
    public int getCodigoReserva() {
        return CodigoReserva;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setLReserva(ArrayList<Reserva> LReserva) {
        this.LReserva = LReserva;
    }

    public void setLPacientes(ArrayList<Pacientes> LPacientes) {
        this.LPacientes = LPacientes;
    }

      
    public void setCodigoReserva(int CodigoReserva) {
        this.CodigoReserva = CodigoReserva;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
    
    Scanner Entrada = new Scanner(System.in);

    
    public void InsertarDatos(Pacientes paciente) throws ParseException{
        
        int ID;
        String fecha;
        int RutPaciente;
        
        System.out.println("Ingrese rut del paciente");
        RutPaciente= Entrada.nextInt();
        
        if(paciente.buscarPaciente(RutPaciente)== true){
            
            
            System.out.println("*** DATOS PACIENTE ***");
            System.out.println("Nombre :"+paciente.getNombre());
            System.out.println("Apellido :"+paciente.getApellido());
            System.out.println("Rut :"+paciente.getRut());
            System.out.println("Telefono:"+paciente.getTelefono());
            System.out.println("Correo :"+paciente.getCorreo());
            
            System.out.println("Ingrese ID de la reserva");
            ID=Entrada.nextInt();
            
            System.out.println("Ingrese fecha de reserva en formato dd/mm/yyyy");
            fecha=Entrada.next();
            
            Date FFecha=new SimpleDateFormat("dd/mm/yyyy").parse(fecha);
            
            Reserva reservas = new Reserva(ID,paciente.getPacientes(),FFecha);
            LReserva.add(reservas);
            System.out.println("**********************");
            System.out.println("*** Reserva creada ***");
            System.out.println("**********************");
        } 
    }
   
    public void ImprimirDatos(){
        if (LReserva.isEmpty())
            System.out.println("NO HAY RESERVAS REGISTRADAS");
        else
        for(int i=0; i<LReserva.size(); i++){
            System.out.println("******************************");
            System.out.println("Nombre:"+LReserva.get(i).LPacientes.get(i).getNombre());
            System.out.println("Apellido:"+LReserva.get(i).LPacientes.get(i).getApellido());
            System.out.println("Cedula de Identidad:"+LReserva.get(i).LPacientes.get(i).getRut());
            System.out.println("Telefono:"+LReserva.get(i).LPacientes.get(i).getTelefono());     
            System.out.println("Hora reservada:"+LReserva.get(i).getFecha());
            System.out.println("Codigo de reserva:"+LReserva.get(i).getCodigoReserva());
            System.out.println("******************************");
        }
    }
    


    public void ModificarReserva() throws ParseException {                
        int RutPaciente;
        String fecha;
        int opcion;
       
        System.out.println("Ingrese RUT del paciente sin puntos ni guion");
        RutPaciente = Entrada.nextInt();
        for(int i = 0; i < LReserva.size(); i++){
            if((LReserva.get(i).LPacientes.get(i).getRut())==(RutPaciente)){
            do {
                System.out.println("____________________________");
                System.out.println("Modificar hora de reserva");
                System.out.println("____________________________");
                System.out.println("1- Modificar fecha");
                System.out.println("2- Salir");
                System.out.println("____________________________");
                opcion = Entrada.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese nueva fecha de reserva en formato dd/mm/yyyy");
                        fecha=Entrada.next();
                        Date FFecha = null;
                    try {
                        FFecha = new SimpleDateFormat("dd/mm/yyyy").parse(fecha);
                    } catch (ParseException ex) {
                        Logger.getLogger(Reserva.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        LReserva.get(i).setFecha(FFecha);
                        System.out.println("**************************");
                        System.out.println("*** Reserva modificada ***");
                        System.out.println("**************************");
                        break;

                    }
                } while (opcion != 2);
            }
            else
                System.out.println("*** EL PACIENTE NO SE ENCUENTRA REGISTRADO ***");  
        }
    }

     public void EliminarReserva() throws ParseException {
                   
        int RutPaciente;
        String fecha;
        int opcion;
       
        System.out.println("Ingrese RUT del paciente sin puntos ni guion");
        RutPaciente = Entrada.nextInt();
        for(int i = 0; i < LReserva.size(); i++){
            if((LReserva.get(i).LPacientes.get(i).getRut())==(RutPaciente)){
                LReserva.remove(i);
                System.out.println("*************************");
                System.out.println("*** Reserva eliminada ***");
                System.out.println("*************************");
            }
            else
                System.out.println("*** EL PACIENTE NO SE ENCUENTRA REGISTRADO ***");      
        }
    }


    @Override
    public void Modificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
    

