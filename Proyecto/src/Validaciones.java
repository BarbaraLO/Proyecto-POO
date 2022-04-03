
import java.util.Scanner;


/**
 *
 * @author naomi
 */
public class Validaciones {
    
    
    public Scanner Entrada=new Scanner(System.in);
    
    //Valida que sea numero entero
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
    
    
    //Valida que sea una cadena de texto
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
    
    

