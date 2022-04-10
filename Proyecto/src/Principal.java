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

    public static void main(String[] args) throws ParseException {
        Scanner Entrada;
        int opcion;
        do {
            System.out.println("____________________________");
            System.out.println("Ingrese una opcion");
            System.out.println("____________________________");
            System.out.println("1- Registrar paciente");
            System.out.println("2- Mostrar listado de pacientes");
            System.out.println("3- Mostrar listado especialidades");
            System.out.println("4- Mostrar listado de profesionales");
            System.out.println("5- Mostrar hora del paciente");
            System.out.println("6- Cambiar hora");
            System.out.println("7- Eliminar hora");
            System.out.println("8- Salir");
            System.out.println("____________________________");

            Entrada = new Scanner(System.in);
            opcion = Entrada.nextInt();

            switch (opcion) {
                case 1:
                    pacientes.AgregarPaciente();
                    break;

                case 2:
                    pacientes.mostrarPacientes();
                    break;

                case 3:
                    profesionales.mostrar();
                    break;

                case 4:
                    profesionales.DatosProfesionales();
                    profesionales.mostrarProfesionales();
                    break;

                case 5:
                    pacientes.eliminarHora();
                    pacientes.mostrarHora();
                    break;
                case 6:
                    pacientes.cambiarHora();

                    break;
                case 7:
                    pacientes.cambiarHora();

                    break;                    
            }

        } while (opcion != 8);
    }

}
