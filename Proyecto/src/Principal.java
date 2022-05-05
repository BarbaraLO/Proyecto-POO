/*
Nombres:
Alison Jara
Barbara Leiva
Naomie Contreras
*/


import java.text.ParseException;
import java.util.Scanner;

public class Principal {

    public static Pacientes pacientes = new Pacientes();
    public static Profesionales profesionales = new Profesionales();
    public static Reserva reservas = new Reserva();
    
    public static void main(String[] args) throws ParseException {
        Scanner Entrada;
        int opcion;
        do {
            System.out.println("____________________________");
            System.out.println("INGRESE UNA OPCION:");
            System.out.println("____________________________");
            System.out.println("1- Registrar paciente");
            System.out.println("2- Modificar Paciente");
            System.out.println("3- Eliminar Paciente");
            System.out.println("4- Mostrar listado de pacientes");
            System.out.println("5- Mostrar listado de profesionales y especialidad");
            System.out.println("6- Reservar hora");
            System.out.println("7- Modificar Reserva");
            System.out.println("8- Eliminar reserva");
            System.out.println("9- Mostrar reservas");
            System.out.println("0- Salir");
            System.out.println("____________________________");

            Entrada = new Scanner(System.in);
            opcion = Entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    pacientes.AgregarPaciente();
                    break;

                case 2:
                    pacientes.ModificarPaciente(pacientes);
                    break;

                case 3:
                    pacientes.EliminarPaciente(pacientes);
                    break;

                case 4:
                    pacientes.mostrarPacientes();
                    break;

                case 5:
                    profesionales.mostrar();
                    profesionales.DatosProfesionales();
                    profesionales.mostrarProfesionales();
                    break;
                    
                case 6:
                    reservas.InsertarDatos(pacientes);
                    break;
                    
                case 7:
                    reservas.ModificarReserva();
                    break;
                    
                case 8:
                    reservas.EliminarReserva();
                    break;
                    
                case 9:
                    reservas.ImprimirDatos();
                    break;
            }

        } while (opcion != 0);
    }

}
