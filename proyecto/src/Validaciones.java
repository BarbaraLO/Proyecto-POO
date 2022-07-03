
import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


/**
 * Clase que permite realizar validaciones de datos ingresados.
 * @author Naomi Contreras
 * @author Barbara Leiva
 */
public class Validaciones {
    
    
    public Scanner Entrada=new Scanner(System.in);
    
    /**
     * Valida que el numero sea de tipo entero.
     * @return Cadena de numeros.
     */
    public int ValidarInt(){
        try{
            String cadenaNumeros = Entrada.next();
            if(cadenaNumeros.matches("[0-9]*"))
                return Integer.valueOf(cadenaNumeros);
            else
                System.out.println("Numero no válido");
        }catch(NumberFormatException e){
            System.out.println(" El numero no es válido");
        }
       
        return 0;
    }      
    
    
    /**
     * Valida que los caracteres sean una cadena de texto.
     * @return Cadena de texto.
     */
    public String ValidarTexto(){
        try{
            String cadenaTexto = Entrada.next();
            if(cadenaTexto.matches("[A-Z,a-z]*"))
                return cadenaTexto;
            else
                System.out.println("Dato no valido");
        }catch(Exception e){
                System.out.println("El Dato no es válido");
        }
        
        return null; 
    }
    
    /**
     * Valida que los caracteres sean de formato fecha.
     * @return fecha.
     */
    public Date ValidarFecha(){
        String cadenaFecha = Entrada.next();
        DateFormat fecha = new SimpleDateFormat(cadenaFecha);
        Date fechaSalida;
        fecha.setLenient(false);
            
        try{
            fechaSalida=fecha.parse(cadenaFecha);
        }catch (ParseException e){
            System.out.println("Fecha no valida");
            return null;
        }
        return fechaSalida;
        }
    
}    