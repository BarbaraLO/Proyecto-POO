
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Clase que contiene informacion sobre la reserva de horas de los pacientes; Implementa interface Datos.
 * @author Naomi Contreras
 * @author Barbara Leiva
 */
public class Reserva implements Datos{
    
    private int CodigoReserva;
    private Date Fecha;
    private ArrayList<Reserva> LReserva = new ArrayList<>();
    private ArrayList <Pacientes> LPacientes = new  ArrayList <>();
    
    public Reserva(){
        LReserva = new ArrayList<>();
    }
    
    /**
     * Constructor.
     * @param CodigoReserva Numero identificador de la reserva del paciente.
     * @param pacientes Listado de pacientes.
     * @param Fecha Fecha de la reserva solicitada.
     */
    public Reserva(int CodigoReserva, ArrayList<Pacientes> pacientes, Date Fecha) {
        this.CodigoReserva= CodigoReserva;
        this.LPacientes=pacientes;
        this.Fecha=Fecha;
    }
    
    /**
     * Permite obtener valores de lista de reservas.
     * @return Lista de reservas
     */
    public ArrayList<Reserva> getLReserva() {
        return LReserva;
    }
    
    /**
     * Permite obtener valores de lista de pacientes.
     * @return Lista de pacientes
     */
    public ArrayList<Pacientes> getLPacientes() {
        return LPacientes;
    }
    
    /**
     * Permite obtener valor de atributo CodigoReserva.
     * @return Codigo de la reserva
     */
    public int getCodigoReserva() {
        return CodigoReserva;
    }

    /**
     * Permite obtener valor de atributo fecha.
     * @return fecha de la reserva
     */
    public Date getFecha() {
        return Fecha;
    }

    /**
     * Permite fijar valores a lista de pacientes.
     * @param LReserva Lista de reservas
     */
    public void setLReserva(ArrayList<Reserva> LReserva) {
        this.LReserva = LReserva;
    }

    /**
     * Permite fijar valores a lista de pacientes.
     * @param LPacientes Lista de pacientes
     */
    public void setLPacientes(ArrayList<Pacientes> LPacientes) {
        this.LPacientes = LPacientes;
    }

    /**
     * Permite fijar valor de atributo CodigoReserva.
     * @param CodigoReserva Codigo de la reserva
     */  
    public void setCodigoReserva(int CodigoReserva) {
        this.CodigoReserva = CodigoReserva;
    }

    /**
     * Permite fijar valor de atributo fecha.
     * @param Fecha Fecha de la reserva
     */
    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
    
    Scanner Entrada = new Scanner(System.in);

    /**
     * Guarda los datos del paciente en la reserva solicitada.
     * @param paciente pacientes registrados en el Listado.
     * @throws ParseException Señala que ha ocurrido un error.
     */
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
   
    /**
     * Imprime los datos de la reservas guardadas: nombre, apellido, rut y telefono del paciente; fecha y codigo de la reserva.
     */
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
    
    /**
     * Permite modificar la fecha de la reserva a traves del rut del paciente.
     * @throws ParseException Señala que ha ocurrido un error.
     */
    public void ModificarReserva() throws ParseException{                
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
                        Date FFecha=new SimpleDateFormat("dd/mm/yyyy").parse(fecha);
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
    
    /**
     * Permite eliminar una reserva registrada a partir del rut del paciente.
     * @throws ParseException Señala que ha ocurrido un error.
     */
     public void EliminarReserva() throws ParseException{
                   
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
    
    /**
    * Metodo Insertar datos de la interface Datos.
    */
    @Override
    public void InsertarDatos() {
        
    }

    /**
    * Metodo Modificar datos de la interface Datos.
    */
    @Override
    public void Modificar() {
        
    }
    
                  
}
    
