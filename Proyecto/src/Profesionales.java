
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase hija de Clase Persona, contiene información sobre los profesionales y metodos relacionados.
 * @author Naomi Contreras
 * @author Barbara Leiva
 */
public class Profesionales extends Persona {
    
    private String nombre; //coresponde al nombre del profesional
    private int rut; //corresponde al rut del profesional para poder identificarlo como persona individual
    private int especialidad; // se le asigna un codigo de especialidad según corresponda
    private ArrayList agenda; // agenda trabaja con codigos del 1 al 6 representando los días de la semana, esto para tener una idea de los días disponibles del profesional
    private double horario; // el horario muestra la última hora disponible del profesional, se considera que el horaio de inicio de atención es desde las 8am.
    private ArrayList<Profesionales> profesionales;
    
    Scanner Entrada = new Scanner(System.in);
    

    public Profesionales() {

        this.nombre = "";
        this.rut = 0;
        this.especialidad = 0;
        this.agenda = new ArrayList();
        this.horario = 0;
        this.profesionales = new ArrayList<>();
    }
    
    /**
     * Constructor.
     * @param nombre Nombre del profesional.
     * @param rut Numero de identificación del profesional.
     * @param especialidad Codigo identificador de especialidad a la que se dedica el profesional.
     * @param horario Horario en el que atiende el profesional.
     */
    public Profesionales(String nombre, int rut, int especialidad, double horario){
        this.nombre = nombre;
        this.rut = rut;
        this.especialidad = especialidad;
        this.horario = horario;
    }
   
    /**
     * Constructor.
     * @param nombre Nombre del profesional.
     * @param rut Numero de identificación del profesional.
     * @param agenda Listado de dias disponibles del profesional
     * @param horario Horario en el que atiende el profesional.
     * @param profesionales Listado de profesionales.
     */
    public Profesionales(String nombre, int rut, ArrayList agenda, double horario, Profesionales profesionales ){
        this.nombre = nombre;
        this.rut = rut;
        this.agenda = new ArrayList();
        this.horario = horario;
        this.profesionales = new ArrayList <>();  
    }   
  
    
    //Accesores y mutadores - getter y setters
    /**
     * Permite obtener valor de atributo nombre.
     * @return nombre y apellido del profesional
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Permite obtener valor de atributo rut.
     * @return rut del profesional
     */
    public int getRut() {
        return rut;
    }
    
    /**
     * Permite obtener valor de atributo especialidad.
     * @return numero identificador de la especialidad
     */
    public int getEspecialidad() {
        return especialidad;
    }
    
    /**
     * Permite obtener valores de lista agenda.
     * @return lista agenda del profesional
     */
    public ArrayList getAgenda() {
        return agenda;
    }

    /**
     * Permite obtener valor de atributo horario.
     * @return horario del profesional
     */
    public double getHorario() {
        return horario;
    }

    /**
     * Permite obtener valores de lista de profesionales.
     * @return lista de profesionales
     */
    public ArrayList<Profesionales> getProfesionales() {
        return profesionales;
    }

    /**
     * Permite fijar valores del atributo nombre.
     * @param nombre nombre y apellido del profesional
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Permite fijar valores del atributo rut.
     * @param rut rut del profesional
     */
    public void setRut(int rut) {
        this.rut = rut;
    }

    /**
     * Permite fijar valores del atributo especialidad.
     * @param especialidad numero identificador de la especialidad
     */
    public void setEspecialidad(int especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Permite fijar valores a lista agenda del profesional.
     * @param agenda agenda del profesional
     */
    public void setAgenda(ArrayList agenda) {
        this.agenda = agenda;
    }

    /**
     * Permite fijar valores del atributo horario.
     * @param horario horario del profesional
     */
    public void setHorario(double horario) {
        this.horario = horario;
    }

    /**
     * Permite fijar valores a lista de profesionales.
     * @param profesionales lista de profesionales
     */
    public void setProfesionales(ArrayList<Profesionales> profesionales) {
        this.profesionales = profesionales;
    }
  
    
    
    /**
     * Busca los profesionales de una especialidad mediante el codigo identificador de la especialidad.
     * @param codigo Codigo de especialidad o area de la salud a la que se dedica el profesional.
     */
    public void buscarEspecialidad(int codigo) {
        for (int i = 0; i >= profesionales.size(); i++) {
            if (profesionales.get(i).getEspecialidad()==(codigo)) {
                System.out.println("El profesional disponible es " + profesionales.get(i).nombre);
            }
            else
                System.out.println("No hay profesional disponible para esa especialidad");
        }
    }

    /**
     * Sobreescritura del método mostrar de la clase abstracta Persona.
     */
    @Override
    public void mostrar() {
        System.out.println("*** ESPECIALIDADES ***");
        System.out.println("1: Medicina General");
        System.out.println("2: Pediatria");
        System.out.println("3: Geriatría");
        System.out.println("4: Ginecologia");
        System.out.println("5: Kinesiologia");
        System.out.println("6: Dental");
        System.out.println("7: Psicologia");
    }

    /**
     * Busca al profesional mediante su codigo del especialidad y muestra sus dias disponibles.
     * @param opcion 
     */
    public void mostrar(int opcion) {
        for (int i = 0; i >= profesionales.size(); i++) {
            if (profesionales.get(i).getEspecialidad()==(opcion)) {
                System.out.println("El profesional " + profesionales.get(i).nombre + "Cuenta con los siguientes horarios de atención disponible: ");
                mostrarAgenda(i);
            }
        }
    }    
    
    /**
     * Registra la hora medica con el profesional.
     */
    public void registrarHora() {
        int opcion;
        System.out.println("Ingrese el codigo de la especialidad  EJEMPLO : 1");
        mostrar();
        opcion = Entrada.nextInt();
        mostrar(opcion);

    }
    
    /**
     * Muestra listado de dias disponibles del profesional
     * @param i numero de lista del profesional
     */
    public void mostrarAgenda(int i){
        int hora= 0;
        System.out.println("lA AGENDA DISPONIBLE ES: ... ... .. .. .. . . .");
        System.out.println("SELECCIONE UN DIA Y UNA HORA EN EL SIGUIENTE FORMATO DD/MM/AAAA");//dia con dos digitos, mes con dos digitos y año 
            System.out.println(profesionales.get(i).getAgenda());
            hora = Entrada.nextInt();
            
    }

    /**
     * Contiene una lista con los datos de los profesionales: nombre, rut, especialidad y horario.
     */
    public void DatosProfesionales(){     
        profesionales.add(new Profesionales("Miguel Sanchez",114672852,01,16.00)); // Cardiologia
        profesionales.add(new Profesionales("Jose Gonzalez",96482745,02,15.30)); // Dermatologia
        profesionales.add(new Profesionales("Marcela Araya",79472487,03,17.00)); // Pediatria
        profesionales.add(new Profesionales("Sofia Rodriguez",158593642,04,16.45)); // Neurologia
    }
    
    /**
     * Muestra el listado con todos los profesionales y sus datos: nombre, rut, especialidad y horario.
     */
    public void mostrarProfesionales(){   
        for(int i=0; i<profesionales.size();i++){
        System.out.println("******************************");
        System.out.println("Nombre: "+profesionales.get(i).nombre);
        System.out.println("Rut: "+profesionales.get(i).rut);
        System.out.println("Especialidad: "+profesionales.get(i).especialidad);
        System.out.println("Horario: "+profesionales.get(i).horario);
        System.out.println("******************************");
        }
    }   
    
}
 
