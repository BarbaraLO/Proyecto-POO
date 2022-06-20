import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


/**
 * Clase hija de Clase Persona, contiene información sobre el paciente y metodos relacionados; Implementa interface Datos.
 * @author Naomi Contreras
 * @author Barbara Leiva
 */
public class Pacientes extends Persona implements Datos {
    
    public Validaciones validaciones = new Validaciones();
    
    private ArrayList <Pacientes> pacientes;
    private String nombre;
    private String apellido;
    private int rut;
    private Date fechaNacimiento;
    private int telefono;
    private String correo;
 

    public Pacientes() {
        pacientes = new ArrayList<>();
    }
    
    /**
     * Constructor.
     * @param nombre nombre del paciente.
     * @param apellido apellido del paciente.
     * @param rut numero de identificación del paciente.
     * @param fecha fecha de nacimiento del paciente.
     * @param telefono numero de telefono del paciente
     * @param correo correo electronico del paciente
     */
    public Pacientes(String nombre, String apellido, int rut, Date fecha, int telefono, String correo){
        this.nombre=nombre;
        this.apellido=apellido;
        this.rut=rut;
        this.fechaNacimiento=fecha;
        this.telefono=telefono;
        this.correo=correo;  
    }

    
//getters y setters
    /**
     * Permite obtener valores de lista de pacientes
     * @return Lista de pacientes.
     */
    public ArrayList<Pacientes> getPacientes() {
        return pacientes;
    }
    
    /**
     * Permite fijar valores a lista de pacientes
     * @param pacientes Lista de pacientes.
     */
    public void setPacientes(ArrayList<Pacientes> pacientes) {
        this.pacientes = pacientes;
    }
    
    /**
     * Permite obtener valor de atributo nombre
     * @return nombre del paciente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Permite fijar valores del atributo nombre
     * @param nombre nombre del paciente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Permite obtener valor de atributo apellido
     * @return apellido del paciente.
     */
    
    public String getApellido() {
        return apellido;
    }

    /**
     * Permite fijar valores del atributo apellido
     * @param apellido apellido del paciente.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
        
    /**
     * Permite obtener valor de atributo rut
     * @return rut del paciente.
     */
    public int getRut() {
        return rut;
    }
    
    /**
     * Permite fijar valores del atributo rut
     * @param rut rut del paciente.
     */
    public void setRut(int rut) {
        this.rut = rut;
    }

    /**
     * Permite obtener valor de atributo FechaNacimiento
     * @return fecha de nacimiento del paciente.
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Permite fijar valores del atributo FechaNacimiento
     * @param fechaNacimiento fecha de nacimiento del paciente.
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Permite obtener valor de atributo telefono
     * @return numero de telefono del paciente.
     */
    public int getTelefono() {
        return telefono;
    }
    
    /**
     * Permite fijar valores del atributo telefono
     * @param telefono numero de telefono del paciente.
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * Permite obtener valor de atributo correo
     * @return correo electronico del paciente
     */
    public String getCorreo() {
        return correo;
    }
    
    /**
     * Permite fijar valores del atributo correo
     * @param correo correo electronico del paciente
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
 
    
    Scanner Entrada = new Scanner(System.in);
    
    //Metodos
    
    /**
     * Busca en el Listado de pacientes si el rut del paciente buscado se encuentra registrado.
     * @param rut numero de identificación del paciente que será buscado.
     * @return devuelve 'true' (verdadero) si encuentra el rut y 'false' (falso) si no lo hace.
     */
    public boolean buscarPaciente(int rut){
        for(int i = 0; i < pacientes.size(); i++){
            if(pacientes.get(i).getRut()==(rut)){
                return true;
            }
        }return false;   
    }
    

    //busca mediante el rut si el paciente se encuentra registrado
    /**
     * Busca paciente mediante su rut y muestra sus datos.
     * @return devuelve 'true' (verdadero) si encuentra el paciente y 'false' (falso) si no lo hace.
     */
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
    
    
    /**
     * Agrega un nuevo paciente al Listado de pacientes e ingresa sus datos por teclado.
     * @throws ParseException Señala que ha ocurrido un error.
     */
    public void AgregarPaciente() throws ParseException{
        String Fecha=null;
        
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
        
    //    System.out.println("*** Se ha ingresado un nuevo paciente con exito! ***");
    }
    
    /**
     * Comprueba si el paciente está registrado, si no lo está crea un nuevo paciente.
     * @param rut numero de identificación del paciente que será buscado.
     * @throws ParseException Señala que ha ocurrido un error
     */
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
    
     /**
      * Permite modificar datos del paciente ya registrado: nombre, apellido, telefono y correo.
      * @param paciente pacientes registrados en el Arraylist.
      */
    public void ModificarPaciente(Pacientes paciente){
           
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
  
    /**
     * Permite Eliminar a un paciente ya registrado a traves de su Rut.
     * @param paciente pacientes registrados en el Listado.
     */
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
    
    
    /**
     * Sobreescritura del método mostrar de la clase abstracta Persona.
     */
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
    
    public void InsertarDatoss(){
        VentanaPaciente paciente = new VentanaPaciente("Registrar Paciente");
        paciente.Formulario();
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

