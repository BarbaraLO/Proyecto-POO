/**
 * Clase que contiene información y metodos para el manejo de horarios de los profesionales.
 * @author Naomi Contreras
 * @author Barbara Leiva
 */
public class Horarios {
    private int mes;
    private int dia;
    private int hora;
    private int disponibilidad;

    /**
     * Muestra fechas disponibles.
     */
    public void verFechasDisp(){
        System.out.println("Mostrando horario");
    }
    
    /**
     * Permite obtener valor de atributo mes.
     * @return Mes de la reserva
     */
    public int getMes() {
        return mes;
    }

    /**
     * Permite fijar valor de atributo mes.
     * @param mes Mes de la reserva
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * Permite obtener valor de atributo hora.
     * @return Hora de la reserva
     */
    public int getHora() {
        return hora;
    }

    /**
     * Permite fijar valor de atributo hora.
     * @param Hora Hora de la reserva
     */
    public void setHora(int Hora) {
        this.hora = Hora;
    }

    /**
     * Permite obtener valor de atributo disponibilidad.
     * @return Disponibilidad de la hora
     */
    public int getDisponibilidad() {
        return disponibilidad;
    }
    
    /**
     * Permite fijar valor de atributo disponibilidad.
     * @param disponibilidad Disponibilidad de la hora
     */
    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
}
