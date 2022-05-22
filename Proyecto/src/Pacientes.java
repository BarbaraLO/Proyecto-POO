import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Pacientes extends Persona implements Interface {
    
    public Validaciones validaciones = new Validaciones();
    
    private ArrayList <Pacientes> pacientes;
    private String nombre;
    private String apellido;
    private int rut;
    private Date fechaNacimiento;
    private int telefono;
    private String correo;

    //constructores
    public Pacientes() {
        pacientes = new ArrayList<>();
    }
        
    public Pacientes(String nombre, String apellido, int rut, Date fecha, int telefono, String correo){
        this.nombre=nombre;
        this.apellido=apellido;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
    
    //busca mediante el rut si el paciente se encuentra registrado
    public boolean buscar(){
        int rutPaciente;
        System.out.println("Ingrese RUT del paciente sin puntos ni guion");
        rutPaciente=Entrada.nextInt();
        
        for(int i=0; i<pacientes.size(); i++){
            if(pacientes.get(i).getRut()==rutPaciente){
                System.out.println("Paciente encontrado");
                System.out.println("*** DATOS PACIENTE ***");
                System.out.println("Nombre :"+getNombre());
                System.out.println("Apellido :"+getApellido());
                System.out.println("Rut :"+getRut());
                System.out.println("Telefono:"+getTelefono());
                System.out.println("Correo :"+getCorreo());
                return true;
            }
        }
        System.out.println("Paciente no encontrado!!!");
        return false;
    }
    
    
    
    public void AgregarPaciente() throws ParseException{
        String Fecha;
        
        System.out.println("*** Agregando Paciente, a continuacion ingrese sus datos ***"); 
        
        System.out.println("Ingrese su nombre");
        this.nombre=Entrada.next();
        
        System.out.println("Ingrese su apellido");
        this.apellido=Entrada.next();
        
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
        
        Pacientes paciente = new Pacientes(nombre,apellido,rut,FFecha,telefono,correo);
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
    //metodo de la interface
    public void Modificar(Pacientes paciente){
           
        int RutPaciente;
        int opcion, numero;
        String texto;
       
        System.out.println("Ingrese RUT del paciente sin puntos ni guion");
        RutPaciente = Entrada.nextInt();
        for(int i = 0; i < pacientes.size(); i++){
            if(pacientes.get(i).getRut()==(RutPaciente)){
            do {
                System.out.println("____________________________");
                System.out.println("Ingrese una opcion");
                System.out.println("____________________________");
                System.out.println("1- Modificar Nombre");
                System.out.println("2- Modificar Apellido");
                System.out.println("3- Modificar Telefono");
                System.out.println("4- Modificar Correo");
                System.out.println("5- Salir");
                System.out.println("____________________________");
                opcion = Entrada.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese nombre modificado");
                        texto = Entrada.next();
                        paciente.setNombre(pacientes.get(i).nombre = texto);
                        System.out.println("NOMBRE MODIFICADO CON EXITO");
                        break;

                    case 2:
                        System.out.println("Ingrese apellido modificado");
                        texto = Entrada.next();
                        paciente.setApellido(pacientes.get(i).apellido = texto);
                        System.out.println("APELLIDO MODIFICADO CON EXITO");
                        break;

                    case 3:                      
                        System.out.println("Ingrese telefono modificado");
                        numero = Entrada.nextInt();
                        paciente.setTelefono(pacientes.get(i).telefono = numero);
                        System.out.println("TELEFONO MODIFICADO CON EXITO");
                        break;

                    case 4:
                        System.out.println("Ingrese correo modificado");
                        texto = Entrada.next();
                        paciente.setCorreo(pacientes.get(i).correo = texto);
                        System.out.println("CORREO MODIFICADO CON EXITO");
                        break; 
                    }
                } while (opcion != 5);
            }
        }
    }
  
    public void EliminarPaciente(Pacientes paciente){
        int RutPaciente;
       
        System.out.println("Ingrese RUT del paciente sin puntos ni guion");
        RutPaciente = Entrada.nextInt();
        for(int i = 0; i < pacientes.size(); i++){
            if(pacientes.get(i).getRut()==(RutPaciente)){        
                pacientes.remove(i);
                System.out.println("**************************");
                System.out.println("*** Paciente eliminado ***");
                System.out.println("**************************");
            }   
        }
    }
    
    
    //sobre escritura del método mostrar de la clase abstracto Persona
    @Override
    public void mostrar(){
        if (pacientes.isEmpty())
            System.out.println("*** NO SE ENCUENTRAN PACIENTES REGISTRADOS ***");
        else
        for(int i=0; i<pacientes.size();i++){
        System.out.println("******************************");
        System.out.println("Nombre: "+pacientes.get(i).nombre);
        System.out.println("Apellido: "+pacientes.get(i).apellido);
        System.out.println("Rut: "+pacientes.get(i).rut);
        System.out.println("Fecha de Nacimiento: "+pacientes.get(i).fechaNacimiento);
        System.out.println("Telefono: "+pacientes.get(i).telefono);
        System.out.println("Correo: "+pacientes.get(i).correo);
        System.out.println("******************************");
        }
    }   
    
    @Override
    public void InsertarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Modificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
}

