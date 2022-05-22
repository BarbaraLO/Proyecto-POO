
import java.util.Scanner;


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
    public int Validar(){
       int cadenaNumeros=-1;
       do{
        try{
           cadenaNumeros=Entrada.nextInt();
           return cadenaNumeros;
           
        }catch(Exception e){
            System.out.println("Dato no válido "+e.toString());
        }
        
       }while(cadenaNumeros<0 || cadenaNumeros==0);
              
        return cadenaNumeros;
    }        
    
    
    /**
     * Valida que los caracteres sean una cadena de texto.
     * @param cadenaTexto caracteres ingresados.
     * @return Cadena de texto.
     */
    public String Validar(String cadenaTexto){
      String Cadena=null;
      do{
        try{
         Cadena=Entrada.next();
        }catch(Exception e){
           System.out.println("Dato no válido");   
        }
       }while(Cadena==null);
        
        return Cadena;
    }
}    
    
    

