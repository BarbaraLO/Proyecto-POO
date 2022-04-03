import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Pacientes {
    
    public Validaciones validaciones = new Validaciones();
    
    
    private ArrayList <Pacientes> pacientes;
    private String Nombre;
    private int Rut;
    private Date fechaNacimiento;
    private int Telefono;
    private String Correo;

    public Pacientes() {
        this.pacientes = new ArrayList<>();
        Nombre = "";
        Rut = 0;
        Telefono = 0;
        Correo = "";
    }
    

    //constructores
    public Pacientes(String nombre, int rut, int telefono, String correo){
        
    }
    
    public Pacientes(String nombre, int rut, Date fecha, int telefono, String correo){
        this.Nombre=nombre;
        this.Rut=rut;
        this.fechaNacimiento=fecha;
        this.Telefono=telefono;
        this.Correo=correo;  
    }
   
    //Metodos
    
    
    //busca entre el listado de los pacientes si existe coincidencia con el rut ingresado
    //si lo encuentra retorna true para evitar crear un paciente duplicado
    public boolean buscarPaciente(int rut){
        for(int i = 0; i < pacientes.size(); i++){
            if(pacientes.get(i).getRut()==(rut)){
                return true;
            }
        }return false;   
    }
    
    
    public void AgregarPaciente() throws ParseException{
        String nombre;
        int rut;
        String fecha;
        int telefono;
        String correo;
        int cedula;
        
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Agregando Paciente, a continuacion ingrese sus datos"); 
        
        System.out.println("Ingrese su nombre completo");
        nombre=Entrada.next();
        
        System.out.println("Ingrese su RUT");
        rut=Entrada.nextInt();
        
        System.out.println("Ingrese su fecha de nacimiento en formato dd/mm/yy");
        fecha=Entrada.next();
        
        System.out.println("Ingrese su telefono");
        telefono=Entrada.nextInt();
        
        System.out.println("Ingrese su correo electronico");
        correo=Entrada.next();
        
        Date FFecha=new SimpleDateFormat("dd/mm/yyyy").parse(fecha);
        
        Pacientes paciente = new Pacientes(nombre,rut,FFecha,telefono,correo);
        paciente.add(paciente);
        System.out.println("Se ha ingresado un nuevo paciente con exito!");
        
        cedula=validaciones.validar();
   
    }
       
     public void comprobarSiEstaRegistrado(int rut){
 
        for(int i=0; i<pacientes.size();i++){
            if(pacientes.get(i).Rut==rut){
                System.out.println("El paciente ya se encontraba registrado en el sistema");
                profesional.registrarHora();
            }
            Pacientes pacientes = new Pacientes();
            pacientes.AgregarPaciente();
        }
    }
    
    
    public void  ModificarPaciente(int Rut){
        System.out.println("Modificar Paciente"+ Rut); 
    }
    
    public void EliminarPaciente(int Rut){
        System.out.println("Ingrese Rut que desea eliminar");
        int cedula=validaciones.validar();
        int i;
        
        for(i=0; i<pacientes.size(); i++){
            if(cedula==pacientes.get(i).Rut){
                pacientes.remove(i);
                System.out.println("Se ha eliminado el rut del paciente");
            }
        }
    }

    


    boolean buscarPaciente(String RutPaciente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Pacientes RutPaciente(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean BuscarPaciente(int cedula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void mostrarHora(){
        System.out.println("Su hora de atención está registrada para " + reserva);
    }
    public void cambiarHora(){
        System.out.println("A continuacion se cambiaran los datos de su cita medica");
    }
    public void eliminarHora(){
        System.out.println("Hora eliminada");
    }
    
    
    
     //getters y setters

    public ArrayList<Pacientes> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Pacientes> pacientes) {
        this.pacientes = pacientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getReserva() {
        return reserva;
    }

    public void setReserva(String reserva) {
        this.reserva = reserva;
    }

    public static Profesionales getProfesional() {
        return profesional;
    }

    public static void setProfesional(Profesionales profesional) {
        Pacientes.profesional = profesional;
    }
    
    
    
}

