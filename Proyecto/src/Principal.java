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
    public static Profesionales profesional = new Profesionales();

    public static void main(String[] args) throws ParseException {
        Scanner Entrada;
        int opcion;
        do {
            System.out.println("Ingrese una opcion");
            System.out.println("1- Mostrar especialidades");
            System.out.println("2- Registrar hora");
            System.out.println("3- Mostrar hora del paciente");
            System.out.println("4- Cambiar hora");
            System.out.println("5- Eliminar hora");
            System.out.println("6- Salir");

            Entrada = new Scanner(System.in);
            opcion = Entrada.nextInt();

            switch (opcion) {
                case 1:
                    profesional.mostrar();
                    break;

                case 2:
                    pacientes.validarPaciente();
                    break;

                case 3:
                    pacientes.mostrarHora();
                    break;

                case 4:
                    pacientes.cambiarHora();

                    break;

                case 5:
                    pacientes.eliminarHora();

                    break;

            }

        } while (opcion != 6);
    }

}
