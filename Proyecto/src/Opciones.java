
import java.util.Scanner;


/**
 *
 * @author naomi
 */
public class Opciones {
    
    
    
    
    
    public Scanner Entrada = new Scanner(System.in);
    public Opciones(){
        
    }
    
    public int Menu(){
        
       Mensaje("1-Crear Pacientes");
       Mensaje("2-Listar Pacientes");
       Mensaje("3-Eliminar Pacientes");
       Mensaje("4-Crear Productos");     
       Mensaje("Digite la opcion");
       int opcion=Entrada.nextInt();
     
        return opcion;
    }
    
    
    public void Mensaje(String mensaje){
        System.out.println(mensaje);
    }
    
    public int ValidarEntero(){
        int Cadena=-1;
       do{
        try{
           Cadena=Entrada.nextInt();
           return Cadena;
           
        }catch(Exception e){
            Mensaje("Dato no válido "+e.toString());
        }
        
       }while(Cadena<0 || Cadena==0);
        
       
        return Cadena;
    }
    
}
