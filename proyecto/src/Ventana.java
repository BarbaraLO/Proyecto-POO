import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naomi
 */
public class Ventana extends Frame {
    
    private MenuBar menu;
    
   
    public Ventana(){
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
    
    public void Configurar(){
        this.setTitle("Clinica");
        this.setSize(500,500);
        this.setLocation(100,100);
        
        Font titleFont = new Font("arial", Font.BOLD, 25);
        Font labelFont = new  Font("arial", Font.PLAIN, 18);
        Font textFont = new  Font("arial", Font.PLAIN, 15);
         
                
        FlowLayout miFlowLayout = new FlowLayout(FlowLayout.CENTER);
               
        Label lblMessage= new Label("Clinica de Salud ");
                       
        this.setLayout( miFlowLayout );
        this.add(lblMessage);
                
        this.setVisible(true); 
    }
    
    
    
    public void Crear(){
        menu = new MenuBar();
             
        Menu menuA = new Menu( "Pacientes" );
        Menu menuB = new Menu( "Profesionales" );
        Menu menuC = new Menu( "Reservas ");
        Menu menuZ = new Menu( "Salir ");
             
        MenuItem submenuOpciones=new MenuItem("Opciones");
        menuA.add(submenuOpciones);
        
        MenuItem submenuVerProfesionales=new MenuItem("Ver lista Profesionales");
        menuB.add(submenuVerProfesionales);
         
        MenuItem submenuReservar=new MenuItem("Reservar Hora");
        menuC.add(submenuReservar);
        MenuItem submenuModificarR=new MenuItem("Modificar Reserva");
        menuC.add(submenuModificarR);
        MenuItem submenuEliminarR=new MenuItem("Eliminar Reserva");
        menuC.add(submenuEliminarR);
        MenuItem submenuMostrarR=new MenuItem("Mostrar Reservas");
        menuC.add(submenuMostrarR);        

        //actionlistener
    
            //boton profesionales
            submenuVerProfesionales.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    ListaDeProfesionales ver= new ListaDeProfesionales();
                    ver.setVisible(true);
                }
            });     
            
            submenuOpciones.addActionListener(new ActionListener(){            
                public void actionPerformed(ActionEvent e){
                    VentanaPaciente ver= new VentanaPaciente();
                    ver.setVisible(true);
                }
            });    
            
            submenuReservar.addActionListener(new ActionListener(){            
                public void actionPerformed(ActionEvent e){
                    VentanaReserva ver= new VentanaReserva();
                    ver.setVisible(true);
                }
            });                

            
             menu.add(menuA);
             menu.add(menuB);
             menu.add(menuC);
             menu.add(menuZ);
             setMenuBar(menu);     
    }   
    
}

