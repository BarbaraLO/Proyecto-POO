import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Pacientes {
    
    public Validaciones validaciones = new Validaciones();
    
    private ArrayList <Pacientes> pacientes;
    private String nombre;
    private int rut;
    private Date fechaNacimiento;
    private int telefono;
    private String correo;

    //constructores
    
    public Pacientes() {
        pacientes = new ArrayList<>();
    }
        
    public Pacientes(String nombre, int rut, Date fecha, int telefono, String correo){
        this.nombre=nombre;
        this.rut=rut;
        this.fechaNacimiento=fecha;
        this.telefono=telefono;
        this.correo=correo;  
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
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
 
    
    //Metodos
    
    Scanner Entrada = new Scanner(System.in);
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
        String Fecha;
        
        System.out.println("*** Agregando Paciente, a continuacion ingrese sus datos ***"); 
        
        System.out.println("Ingrese su nombre completo");
        this.nombre=Entrada.next();
        
        System.out.println("Ingrese su RUT sin puntos ni guion");
        this.rut=Entrada.nextInt();
        //Rut=validaciones.Validar();
        
        System.out.println("Ingrese su fecha de nacimiento en formato dd/mm/yy");
        Fecha=Entrada.next();
        
        System.out.println("Ingrese su telefono");
        this.telefono=Entrada.nextInt();
        
        System.out.println("Ingrese su correo electronico");
        this.correo=Entrada.next();
        
        Date FFecha=new SimpleDateFormat("dd/mm/yyyy").parse(Fecha);
        
        Pacientes paciente = new Pacientes(nombre,rut,FFecha,telefono,correo);
        pacientes.add(paciente);
        
        System.out.println("*** Se ha ingresado un nuevo paciente con exito! ***");
    }
       
     public void comprobarSiEstaRegistrado(int rut) throws ParseException{
        if (pacientes.isEmpty()){
            System.out.println("Cree nuevo paciente");
            Pacientes pacientess = new Pacientes();
            pacientess.AgregarPaciente();
        }
         
        for(int i=0; i<pacientes.size();i++){
            if(pacientes.get(i).rut==rut){
                System.out.println("El paciente ya se encontraba registrado en el sistema");
        //        profesional.registrarHora();
            }
            else{
            System.out.println("Cree nuevo paciente");
            Pacientes pacientess = new Pacientes();
            pacientess.AgregarPaciente();
            }
        }
    }
    
    public void  ModificarPaciente(int rut){
        System.out.println("Modificar Paciente"+ rut); 
    }
    
    public void EliminarPaciente(int rut){
        System.out.println("Ingrese Rut que desea eliminar");
        int cedula=validaciones.Validar();
        int i;
        
        for(i=0; i<pacientes.size(); i++){
            if(cedula==pacientes.get(i).rut){
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
        System.out.println("Su hora de atención está registrada para " );
    }
    
    public void cambiarHora(){
        System.out.println("A continuacion se cambiaran los datos de su cita medica");
    }
    
    public void eliminarHora(){
        System.out.println("Hora eliminada");
    }
    
    public void mostrarPacientes(){   
        for(int i=0; i<pacientes.size();i++){
        System.out.println("******************************");
        System.out.println("Nombre: "+pacientes.get(i).nombre);
        System.out.println("Rut: "+pacientes.get(i).rut);
        System.out.println("Fecha de Nacimiento: "+pacientes.get(i).fechaNacimiento);
        System.out.println("Telefono: "+pacientes.get(i).telefono);
        System.out.println("Correo: "+pacientes.get(i).correo);
        System.out.println("******************************");
        }
    }   
    

}

