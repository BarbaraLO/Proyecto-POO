import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
                    paciente.InsertarDatoss();      
                }
                    
            });

            
            submenuBuscar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    BuscarPaciente buscar= new BuscarPaciente();
                    buscar.setVisible(true);
                        
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
            submenuLPacientes.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Pacientes pacientes=new Pacientes();
                    pacientes.mostrar();
                }
            });              
            
            
            //boton profesionales
            submenuVerProfesionales.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    ListaDeProfesionales ver= new ListaDeProfesionales();
                    ver.setVisible(true);
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
             menu.add(menuZ);
             setMenuBar(menu);     
    }   
    
}

