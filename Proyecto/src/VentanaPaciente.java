
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class VentanaPaciente extends Frame {
    
    private Label lblNombre, lblApellido,lblRut,lblFecha,lblTelefono, lblCorreo, lblMensaje;
    private Button btnAceptar, btnLimpiar,btnReporte;
    private TextField txtNombre,txtApellido,txtRut,txtFecha, txtTelefono, txtCorreo;
    boolean presion=false;

    private Pacientes paciente= new Pacientes();
    
    public VentanaPaciente(String titulo){
        super(titulo);
        this.addWindowListener((WindowListener) this);
    }
    
    public void Formulario(){
        
        this.setSize(1000, 600);
        this.setLayout(null);
        this.setVisible(true);
         
	Color formColor = new Color(53, 59, 72);
	setBackground(formColor);
         
         
        Font titleFont = new Font("arial", Font.BOLD, 25);
	Font labelFont =new  Font("arial", Font.PLAIN, 18);
	Font textFont =new  Font("arial", Font.PLAIN, 15);
         
        
         lblMensaje=new Label("");
         lblMensaje.setForeground(Color.RED);
         lblMensaje.setBounds(400,50,400,30);
         
         
         
         lblNombre=new Label("Nombre");  
	 lblNombre.setBounds(250,100,150,30);
	 lblNombre.setFont(labelFont);  
	 lblNombre.setForeground(Color.WHITE);
         
         txtNombre=new TextField();
	 txtNombre.setBounds(400,100,400,30);
	 txtNombre.setFont(textFont);
         
         
         

         lblApellido=new Label("Apellidos");  
	 lblApellido.setBounds(250,150,150,30);
	 lblApellido.setFont(labelFont);  
	 lblApellido.setForeground(Color.WHITE);
         
         txtApellido=new TextField();
	 txtApellido.setBounds(400,150,400,30);
	 txtApellido.setFont(textFont);
         
         
         
         lblRut=new Label("Rut");  
	 lblRut.setBounds(250,200,150,30);
	 lblRut.setFont(labelFont);  
	 lblRut.setForeground(Color.WHITE);
         
         txtRut=new TextField();
	 txtRut.setBounds(400,200,400,30);
	 txtRut.setFont(textFont);
         
         
         
         lblFecha=new Label("Fecha Nacimiento");  
	 lblFecha.setBounds(250,250,150,30);
	 lblFecha.setFont(labelFont);  
	 lblFecha.setForeground(Color.WHITE);
         
         txtFecha=new TextField();
	 txtFecha.setBounds(400,250,400,30);
	 txtFecha.setFont(textFont);
         txtFecha.setText("DD/MM/YYYY");
         
         
         
         lblTelefono=new Label("Telefono");  
	 lblTelefono.setBounds(250,250,150,30);
	 lblTelefono.setFont(labelFont);  
	 lblTelefono.setForeground(Color.WHITE);

         txtTelefono=new TextField();
	 txtTelefono.setBounds(400,250,400,30);
	 txtTelefono.setFont(textFont);
         txtTelefono.setText("DD/MM/YYYY");
         
         
         
         lblCorreo=new Label("Correo");  
	 lblCorreo.setBounds(250,250,150,30);
	 lblCorreo.setFont(labelFont);  
	 lblCorreo.setForeground(Color.WHITE);

         txtCorreo=new TextField();
	 txtCorreo.setBounds(400,250,400,30);
	 txtCorreo.setFont(textFont);
         txtCorreo.setText("DD/MM/YYYY");

         btnLimpiar=new Button("Limpiar");
         btnLimpiar.setBounds(500,350,100,50);
	 btnLimpiar.setFont(textFont);
         
         
         btnAceptar.addActionListener((ActionListener) this);
         btnLimpiar.addActionListener((ActionListener) this);
         txtFecha.addKeyListener((KeyListener) this);
         
         
         add(lblMensaje);
	 add(lblNombre);
         add(txtNombre);
         add(lblApellido);
         add(txtApellido);
         add(lblRut);
         add(txtRut);
         add(lblFecha);
         add(txtFecha);
         add(lblTelefono);
         add(txtTelefono);
         add(lblCorreo);
         add(txtCorreo);
         add(btnAceptar);
         add(btnLimpiar);       
    }
    
    public void Reporte(){
        
        this.removeAll();
         
	Color formColor = new Color(53, 59, 72);
	setBackground(formColor);
         
         
        Font titleFont = new Font("arial", Font.BOLD, 25);
	Font labelFont =new  Font("arial", Font.PLAIN, 18);
	Font textFont =new  Font("arial", Font.PLAIN, 15);
         
        this.setLayout(new GridLayout(2, 5));
         
        lblMensaje=new Label("Nombre");
        lblMensaje.setForeground(Color.WHITE);
        this.add(lblMensaje);
         
        lblMensaje=new Label("Apellidos");
        lblMensaje.setForeground(Color.WHITE);
        this.add(lblMensaje);
         
        lblMensaje=new Label("Rut");
        lblMensaje.setForeground(Color.WHITE);
        this.add(lblMensaje);
         
        lblMensaje=new Label("Fecha Nacimiento");
        lblMensaje.setForeground(Color.WHITE);
        this.add(lblMensaje);  
         
        lblMensaje=new Label("Telefono");
        lblMensaje.setForeground(Color.WHITE);
        this.add(lblMensaje);
         
        lblMensaje=new Label("Correo");
        lblMensaje.setForeground(Color.WHITE);
        this.add(lblMensaje); 
         
        for(int i=0; i<paciente.pacientes.size();i++){
             
            lblMensaje=new Label(paciente.pacientes.get(i).getNombre());
            lblMensaje.setForeground(Color.WHITE);
            this.add(lblMensaje);  
            
            lblMensaje=new Label(paciente.pacientes.get(i).getApellido());
            lblMensaje.setForeground(Color.WHITE);
            this.add(lblMensaje); 
            
            //falta rut
            
            lblMensaje=new Label(paciente.pacientes.get(i).getFechaNacimiento().toString());
            lblMensaje.setForeground(Color.WHITE);
            this.add(lblMensaje);          
            
                //falta telefono
            
            lblMensaje=new Label(paciente.pacientes.get(i).getCorreo());
            lblMensaje.setForeground(Color.WHITE);
            this.add(lblMensaje);             
         } 
    }
    
    
    
    //eventos
    
    public void actionPerformed(ActionEvent e) {
        Date fechaNacimiento;    
         
        //button 
        Object obj = e.getSource();
         
         
        if(obj==btnReporte){
            System.out.println("reporte");
            Reporte();
        }
 
        if(obj==btnAceptar){
            System.out.println("crear");
              
            if(!txtNombre.getText().toString().isEmpty() && !txtApellido.getText().toString().isEmpty() && !txtRut.getText().toString().isEmpty() &&  !txtFechaNacimiento.getText().toString().isEmpty()){
                try {
                    fechaNacimiento=new SimpleDateFormat("dd/mm/yyyy").parse(txtFecha.getText().toString());
                      
                    paciente.setNombre(txtNombre.getText().toString());
                    paciente.setApellido(txtApellido.getText().toString());
                    paciente.setRut(txtRut.getText());
                    paciente.setFechaNacimiento(fechaNacimiento);

                      
                    paciente.pacientes.add(paciente);
                      
                    this.removeAll();
                      
                    lblMensaje=new Label("Datos insertados!!!");
                    lblMensaje.setForeground(Color.RED);
                    lblMensaje.setBounds(400,50,400,30);
                    Font textFont =new  Font("arial", Font.PLAIN, 15);
                    btnReporte=new Button("Reporte");
                    lblMensaje.setForeground(Color.WHITE);
                    btnReporte.setBounds(500,50,500,30);
                    btnReporte.setFont(textFont);
                      
                      
                    add(lblMensaje);
                    add(btnReporte);
                    btnReporte.addActionListener((ActionListener) this);  
                }catch (ParseException ex) {
                      Logger.getLogger(VentanaPaciente.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }else{
                Alerta("Los datos deben llenarse");
                lblMensaje.setText("Los campos deben llenarse");        
            }
            
            if(obj==btnLimpiar){
            System.out.println("limpiar");
            }    
            
            Pacientes paciente = new Pacientes(txtNombre.getText().toString()(txtApellido.getText));
            paciente.AgregarPaciente();
        }
    }
    
    public void Alerta(String Mensaje){
        Dialog ventanaAlerta = new Dialog(this, Mensaje, true);  
            ventanaAlerta.setLayout( new FlowLayout() );  
                Button b = new Button ("OK"); 
                  
                b.addActionListener ( new ActionListener(){  
                    public void actionPerformed( ActionEvent e )  
                    {  
                        ventanaAlerta.setVisible(false);  
                    }  
                });  
                ventanaAlerta.add( new Label ("Click para continuar."));  
                ventanaAlerta.add(b);
                ventanaAlerta.setSize(300,300);    
                ventanaAlerta.setVisible(true);            
    }    
    
    public void windowClosing(WindowEvent e) {
        System.out.println("Cerrar la interface");
        dispose();         
    }  
    
      public void windowOpened(WindowEvent e) {}
      public void windowActivated(WindowEvent e) {}
      public void windowIconified(WindowEvent e) {}
      public void windowDeiconified(WindowEvent e) {}
      public void windowDeactivated(WindowEvent e) {}
      public void windowClosed(WindowEvent e) {}

   //eventos teclado
    public void keyTyped(KeyEvent e) {}
    public void keyPressed(KeyEvent e){
          Object obj = e.getSource();
          if(obj==txtFecha && !presion){
                 txtFecha.setText("");
                 presion=true;
              
          }
    }
    
    public void keyReleased(KeyEvent e){}    
    
    
}
    
