
import java.util.ArrayList;
import java.util.Scanner;

public class Profesionales {
    
    private String nombre; //coresponde al nombre del profesional
    private int rut; //corresponde al rut del profesional para poder identificarlo como persona individual
    private int especialidad; // se le asigna un codigo de especialidad según corresponda
    private ArrayList agenda; // agenda trabaja con codigos del 1 al 6 representando los días de la semana, esto para tener una idea de los días disponibles del profesional
    private double horario; // el horario muestra la última hora disponible del profesional, se considera que el horaio de inicio de atención es desde las 8am.
    private ArrayList<Profesionales> profesionales;
    
    Scanner Entrada = new Scanner(System.in);
    
    //constructores
    
    public Profesionales() {

        this.nombre = "";
        this.rut = 0;
        this.especialidad = 0;
        this.agenda = new ArrayList();
        this.horario = 0;
        this.profesionales = new ArrayList<>();
    }
    
    public Profesionales(String nombre, int rut, int especialidad, double horario){
        this.nombre = nombre;
        this.rut = rut;
        this.especialidad = especialidad;
        this.horario = horario;
    }
   
    public Profesionales(String nombre, int rut, ArrayList agenda, double horario, Profesionales profesionales ){
        this.nombre = nombre;
        this.rut = rut;
        this.agenda = new ArrayList();
        this.horario = horario;
        this.profesionales = new ArrayList <>();  
    }   
  
    
    //Accesores y mutadores - getter y setters
    
    public String getNombre() {
        return nombre;
    }

    public int getRut() {
        return rut;
    }

    public int getEspecialidad() {
        return especialidad;
    }

    public ArrayList getAgenda() {
        return agenda;
    }

    public double getHorario() {
        return horario;
    }

    public ArrayList<Profesionales> getProfesionales() {
        return profesionales;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public void setEspecialidad(int especialidad) {
        this.especialidad = especialidad;
    }

    public void setAgenda(ArrayList agenda) {
        this.agenda = agenda;
    }

    public void setHorario(double horario) {
        this.horario = horario;
    }

    public void setProfesionales(ArrayList<Profesionales> profesionales) {
        this.profesionales = profesionales;
    }
  
    
    
    //Metodos
    
    //Este metodo busca en el arreglo de profesionales a cada profesional que cuente con el codigo 
    //de especialidad requerido y muetra los días disponibles que tiene para atender
    public void buscarEspecialidad(int codigo) {
        for (int i = 0; i >= profesionales.size(); i++) {
            if (profesionales.get(i).getEspecialidad()==(codigo)) {
                System.out.println("El profesional " + profesionales.get(i).nombre + "Cuenta con los siguientes días de atención disponible: ");
                System.out.println(profesionales.get(i).agenda);
            }
        }
    }

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

    public void mostrar(int opcion) {
        for (int i = 0; i >= profesionales.size(); i++) {
            if (profesionales.get(i).getEspecialidad()==(opcion)) {
                System.out.println("El profesional " + profesionales.get(i).nombre + "Cuenta con los siguientes horarios de atención disponible: ");
                mostrarAgenda(i);
            }
        }
    }    
    
    public void registrarHora() {
        int opcion;
        System.out.println("Ingrese el codigo de la especialidad  EJEMPLO : 1");
        mostrar();
        opcion = Entrada.nextInt();
        mostrar(opcion);

    }

    public void mostrarAgenda(int i){
        int hora= 0;
        System.out.println("LA AGENDA DISPONIBLE ES: ... ... .. .. .. . . .");
        System.out.println("SELECCIONE UN DIA Y UNA HORA EN EL SIGUIENTE FORMATO DD/MM/AAAA");//dia con dos digitos, mes con dos digitos y año 
            System.out.println(profesionales.get(i).getAgenda());
            hora = Entrada.nextInt();
            
    }

    //Metodo para mostrar el horario de atencion disponible para cada profesional
    public void mostrarHorario(int i){
        System.out.println("A continuación se muestran las horas disponibles para este día");
    }

    
    public void DatosProfesionales(){     
        profesionales.add(new Profesionales("Miguel Sanchez",114672852,01,16.00)); // Cardiologia
        profesionales.add(new Profesionales("Jose Gonzalez",96482745,02,15.30)); // Dermatologia
        profesionales.add(new Profesionales("Marcela Araya",79472487,03,17.00)); // Pediatria
        profesionales.add(new Profesionales("Sofia Rodriguez",158593642,04,16.45)); // Neurologia
    }
    
    
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
 
