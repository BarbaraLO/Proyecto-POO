/*
Nombres:
Alison Jara
Barbara Leiva
Naomie Contreras
*/




public class Principal {

    
    public static Pacientes pacientes = new Pacientes();
    public static Profesionales profesionales = new Profesionales();
    public static Reserva reservas = new Reserva();
    

    public static void main(String[] args)  {
        Ventana vl= new Ventana();
        vl.Configurar();
        vl.Crear();

        
        vl.setTitle("Sistema de Clinica de salud");
        vl.setSize(500,500);
        vl.setVisible(true);
        

    }

}
