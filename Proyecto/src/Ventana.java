
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Ventana extends Frame {
    
    private MenuBar menu;
    

    
    public void Configurar(){
        this.setTitle("xd");
        this.setSize(500,500);
        this.setLocation(100,100);
        
        Font titleFont = new Font("arial", Font.BOLD, 25);
        Font labelFont =new  Font("arial", Font.PLAIN, 18);
        Font textFont =new  Font("arial", Font.PLAIN, 15);
         
                
        FlowLayout miFlowLayout = new FlowLayout(FlowLayout.CENTER);
               
        Label lblMessage= new Label("Clinica de Salud ");
                       
        this.setLayout( miFlowLayout );
        this.add(lblMessage);
                
        this.setVisible(true); 
    }
    
    
    
    public void Crear(){
        menu= new MenuBar();
             
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
        MenuItem submenuListaPacientes=new MenuItem("Lista Pacientes");
        menuA.add(submenuListaPacientes);        
        
        
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
             
            //boton pacientes
            submenuAgregar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
      
                    Pacientes paciente=new Pacientes();
        
                }      
            });

            submenuBuscar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Pacientes paciente = new Pacientes();
                    paciente.buscar();
                }  
            });
            
            submenuModificar.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Pacientes pacientes=new Pacientes();
                    pacientes.ModificarPaciente(pacientes);
                }
            });
            
            submenuEliminar.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Pacientes pacientes=new Pacientes();
                    pacientes.EliminarPaciente(pacientes);
                }
            });  
            
            submenuListaPacientes.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Pacientes pacientes=new Pacientes();
                    pacientes.mostrar();
                }
            });              
            
            
            //boton profesionales
            submenuVerProfesionales.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Profesionales profesionales = new Profesionales();
                    profesionales.DatosProfesionales();
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

