
import java.util.ArrayList;

public class Profesionales {
    
    private String Nombre; //coresponde al nombre del profesional
    private int Rut; //corresponde al rut del profesional para poder identificarlo como persona individual
    private String Especialidad; // se le asigna un codigo de especialidad según corresponda
    private ArrayList agenda; // agenda trabaja con codigos del 1 al 6 representando los días de la semana, esto para tener una idea de los días disponibles del profesional
    private double horario; // el horario muestra la última hora disponible del profesional, se considera que el horaio de inicio de atención es desde las 8am.
    private Profesionales profesional;
    private ArrayList <Profesionales>  profesionales;
    /**
     *
     */
    
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
  
    
    
    
    
    //Accesores y mutadores - getter y setters

    public String getNombre() {
        return Nombre;
    }

    public int getRut() {
        return Rut;
    }

    public String getEspecialidad() {
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


    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setRut(int Rut) {
        this.Rut = Rut;
    }

    public void setEspecialidad(String Especialidad) {
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
 
