
import java.util.ArrayList;

public class Profesionales {
    
    private String nombre; //coresponde al nombre del profesional
    private int rut; //corresponde al rut del profesional para poder identificarlo como persona individual
    private String especialidad; // se le asigna un codigo de especialidad según corresponda
    private ArrayList agenda; // agenda trabaja con codigos del 1 al 6 representando los días de la semana, esto para tener una idea de los días disponibles del profesional
    private double horario; // el horario muestra la última hora disponible del profesional, se considera que el horaio de inicio de atención es desde las 8am.
    private ArrayList<Profesionales> profesionales;
    Scanner e;

    public Profesionales() {

        this.nombre = "";
        this.rut = 0;
        especialidad = "";
        this.agenda = new ArrayList();
        this.horario = 0;
        this.profesionales = new ArrayList<>();
    }
    //constructores
   
        public Profesionales(String Nombre, int Rut, ArrayList agenda, double horario, Profesionales profesionales ){
        this.Nombre = Nombre;
        this.Rut = Rut;
        this.agenda = new ArrayList();
        this.horario = 0;
        this.profesionales = new ArrayList <>();  
    }   
  
    
      //Este metodo busca en el arreglo de profesionales a cada profesional que cuente con el codigo 
    //de especialidad requerido y muetra los días disponibles que tiene para atender
    public void buscarEspecialidad(String codigo) {
        for (int i = 0; i >= profesionales.size(); i++) {
            if (profesionales.get(i).getEspecialidad().equals(codigo)) {
                System.out.println("El profesional " + profesionales.get(i).nombre + "Cuenta con los siguientes días de atención disponible: ");
                System.out.println(profesionales.get(i).agenda);
            }
        }
    }

    public void mostrar() {
        System.out.println("1: Medicina General");
        System.out.println("2: Pediatria");
        System.out.println("3: Geriatría");
        System.out.println("4: Ginecologia");
        System.out.println("5: Kinesiologia");
        System.out.println("6: Dental");
        System.out.println("7: Psicologia");
    }

    public void registrarHora() {
        int opcion = 0;
        System.out.println("Ingrese el codigo de la especialidad  EJEMPLO : 1");
        mostrar();
        opcion = e.nextInt();
        mostrar(opcion);

    }

    public void mostrar(int opcion) {
        for (int i = 0; i >= profesionales.size(); i++) {
            if (profesionales.get(i).getEspecialidad().equals(opcion)) {
                System.out.println("El profesional " + profesionales.get(i).nombre + "Cuenta con los siguientes horarios de atención disponible: ");
                mostrarAgenda(i);
    }
        }
    }
    public void mostrarAgenda(int i){
        int hora= 0;
        System.out.println("lA AGENDA DISPONIBLE ES: ... ... .. .. .. . . .");
        System.out.println("SELECCIONE UN DIA Y UNA HORA EN EL SIGUIENTE FORMATO DD/MM/AAAA");//dia con dos digitos, mes con dos digitos y año 
            System.out.println(profesionales.get(i).getAgenda());
            hora = e.nextInt();
            
    }
 

    
        //Metodo para mostrar el horario de atencion disponible para cada profesional
    public void mostrarHorario(int i){
        System.out.println("A continuación se muestran las horas disponibles para este día");
    }

    
public void DatosProfesionales(){     
        profesionales.add(new Profesionales("Miguel Sanchez",114672852,01,555)); // Cardiologia
        profesionales.add(new Profesionales("Jose Gonzalez",96482745,02,666)); // Dermatologia
        profesionales.add(new Profesionales("Marcela Araya",79472487,03,777)); // Pediatria
        profesionales.add(new Profesionales("Sofia Rodriguez",158593642,04,888)); // Neurologia
    }
    
        public void mostrarProfesionales(){   
        for(int i=0; i<profesionales.size();i++){
        System.out.println("Nombre: "+profesionales.get(i).Nombre);
        System.out.println("Rut: "+profesionales.get(i).Rut);
        System.out.println("Especialidad: "+profesionales.get(i).Especialidad);
        System.out.println("Horario: "+profesionales.get(i).horario);  
        }
    }   
    
    
           
    //Accesores y mutadores - getter y setters

    public String getNombre() {
        return Nombre;
    }

    public int getRut() {
        return Rut;
    }

    public int getEspecialidad() {
        return Especialidad;
    }

    public ArrayList getAgenda() {
        return agenda;
    }

    public double getHorario() {
        return horario;
    }

    public Profesionales getProfesional() {
        return profesional;
    }

    public ArrayList<Profesionales> getProfesionales() {
        return profesionales;
    }
    


    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setRut(int Rut) {
        this.Rut = Rut;
    }

    public void setEspecialidad(int Especialidad) {
        this.Especialidad = Especialidad;
    }


    public void setAgenda(ArrayList agenda) {
        this.agenda = agenda;
    }

    public void setHorario(double horario) {
        this.horario = horario;
    }

    public void setProfesional(Profesionales profesional) {
        this.profesional = profesional;
    }

    
      
}
 
