
import java.util.ArrayList;

public class Profesionales {
    private String Nombre; //coresponde al nombre del profesional
    private int Rut; //corresponde al rut del profesional para poder identificarlo como persona individual
    private String Especialidad; // se le asigna un codigo de especialidad según corresponda
    private ArrayList agenda; // agenda trabaja con codigos del 1 al 6 representando los días de la semana, esto para tener una idea de los días disponibles del profesional
    private double horario; // el horario muestra la última hora disponible del profesional, se considera que el horaio de inicio de atención es desde las 8am.
    private Profesionales profesional;
    private ArrayList <Profesionales>  profesionales;
    
    
    //constructores
    public Profesionales(){
        
    }
    
    
    public Profesionales(String Nombre, int Rut,int Telefono, ArrayList agenda, double horario, Profesionales profesionaels ){
        this.Nombre = Nombre;
        this.Rut = Rut;
        this.agenda = new ArrayList();
        this.horario = 0;
        this.profesionales = new ArrayList <>();  
    }   
     
    
    public void mostrarProfesionales(Profesionales Dato){   
        System.out.println("Nombre: "+Dato.Nombre);
        System.out.println("Rut: "+Dato.Rut);
        System.out.println("Especialidad: "+Dato.Especialidad);
        System.out.println("Horario: "+Dato.horario);
    }    
    

    //Este metodo busca en el arreglo de profesionales a cada profesional que cuente con el codigo 
    //de especialidad requerido y muetra los días disponibles que tiene para atender
    public void buscarEspecialidad(String codigo){
        for (int i= 0; i>= profesionales.size(); i++){         
            if ( profesionales.get(i).getEspecialidad().equals(codigo)){
                System.out.println("El profesional "+ profesionales.get(i).Nombre + "Cuenta con los siguientes días de atención disponible: " );             
                System.out.println (profesionales.get(i).agenda);
            }
        }
    }
    
    //Metodo para mostrar el horario de atencion disponible para cada profesional
    public void mostrarHorario(int i){
        System.out.println("A continuación se muestran las horas disponibles para este día");
    }

    
    //Accesores y mutadores - getter y setters
    public String getNombre(){
        return Nombre;
    }
    
    public int getRut(){
        return Rut;
    }
    
    public String getEspecialidad(){
        return Especialidad;
    }
    
    public void setNombre(String Nombre){
        Nombre=Nombre;
    }
    
    public void setApellido(String apellido){
        apellido=apellido;
    }
    
    public void setRut(int Rut){
        Rut=Rut;
    }
    
    public void setEspecialidad(String Especialidad){
        Especialidad=Especialidad;
    }

    public ArrayList getProfresionales() {
        return profesionales;
    }

    public void setProfresionales(ArrayList profresionales) {
        this.profesionales = profesionales;
    }

    public ArrayList getAgenda() {
        return agenda;
    }

    public void setAgenda(ArrayList agenda) {
        this.agenda = agenda;
    }

    public double getHorario() {
        return horario;
    }

    public void setHorario(double horario) {
        this.horario = horario;
    }
    
}
