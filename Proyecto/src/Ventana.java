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
        Menu menuZ = new Menu( "Reservas ");
             
        MenuItem submenuAgregar=new MenuItem("Agregar Paciente");
        menuA.add(submenuAgregar);
        MenuItem submenuBuscar=new MenuItem("Buscar Paciente");
        menuA.add(submenuBuscar);
        MenuItem submenuModificar=new MenuItem("Modificar Paciente");
        menuA.add(submenuModificar);
        MenuItem submenuEliminar=new MenuItem("Eliminar Paciente");
        menuA.add(submenuEliminar);        

        //actionlistener
             
            submenuAgregar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
      
                    Pacientes paciente=new Pacientes();
                    paciente.InsertarDatos();      
                }
                    
            });

            
            submenuBuscar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    
                    
                    Pacientes paciente = new Pacientes();
    
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
                    Pacientes pacientes=new Pacientes();
                    pacientes.EliminarPaciente(pacientes);
                }
            });                    
            
            
            
            
             
             
             
             
             menu.add(menuA);
             menu.add(menuB);
             menu.add(menuZ);
             setMenuBar(menu);    
    }   
    
}

