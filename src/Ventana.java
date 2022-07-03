import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
	lblMessage.setBounds(400,100,400,30);
	lblMessage.setFont(titleFont);
        
        this.setLayout( miFlowLayout );
        this.add(lblMessage);
                
        this.setVisible(true); 
    }
    
    
    public void Crear(){
        menu = new MenuBar();
             
        Menu menuA = new Menu( "Pacientes" );
        Menu menuB = new Menu( "Profesionales" );
        Menu menuC = new Menu( "Reservas ");
             
        MenuItem submenuAgregar=new MenuItem("Agregar Paciente");
        menuA.add(submenuAgregar);
        MenuItem submenuBuscar=new MenuItem("Buscar Paciente");
        menuA.add(submenuBuscar);
        MenuItem submenuModificar=new MenuItem("Modificar Paciente");
        menuA.add(submenuModificar);
        MenuItem submenuEliminar=new MenuItem("Eliminar Paciente");
        menuA.add(submenuEliminar);        
        MenuItem submenuLPacientes=new MenuItem("Listado de Pacientes");
        menuA.add(submenuLPacientes);     
        
        
        
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
             
            submenuAgregar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
      
                    Pacientes paciente = new Pacientes();
                    try {      
                        paciente.InsertarDatoss();
                    } catch (ParseException ex) {
                        Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                    
            });

            
            submenuLPacientes.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    
                    
                    Pacientes paciente = new Pacientes();
                    try {
                        paciente.mostrarr();
                    } catch (ParseException ex) {
                        Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                    
            });
            
            submenuModificar.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Pacientes pacientes=new Pacientes();
                    pacientes.Modificar();
                }
            });
            
            submenuEliminar.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Pacientes paciente=new Pacientes();
                    paciente.EliminarPaciente(paciente);
                }
            });                    
/*            submenuLPacientes.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Pacientes pacientes=new Pacientes();
                    pacientes.mostrar();
                }
            });              
 */           
            
            //boton profesionales
            submenuVerProfesionales.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Profesionales profesional = new Profesionales();
                    try {
                        profesional.MostrarProfesionales();
                    } catch (ParseException ex) {
                        Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });              
            
            
            //boton reserva
            submenuReservar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Reserva reserva = new Reserva();
                    reserva.InsertarDatos();
                   
                }      
            });

            submenuModificarR.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Reserva reserva = new Reserva();
         
                 
                }  
            });
            
            submenuEliminarR.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Reserva reserva = new Reserva();
               
                }
            });
            
            submenuMostrarR.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Reserva reserva = new Reserva();
                    reserva.ImprimirDatos();
                }
            });       
            
            
            
             menu.add(menuA);
             menu.add(menuB);
             menu.add(menuC);
             setMenuBar(menu);     
        }   
    
    
}
