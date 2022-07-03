
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naomi
 */
public class VentanaPaciente extends Frame implements WindowListener, ActionListener, KeyListener {

    private Label lblNombre, lblApellido,lblRut,lblFecha,lblTelefono, lblCorreo, lblMensaje,lblTitulo;
    private Button btnAceptar, btnLimpiar,btnReporte;
    private TextField txtNombre,txtApellido,txtRut,txtFecha, txtTelefono, txtCorreo;
    boolean presion=false;

    private Pacientes paciente= new Pacientes();
    
    public VentanaPaciente(String titulo){
        super(titulo);
        this.addWindowListener(this);
    }

    // Getter y Setter
    public Pacientes getPaciente() {
        return paciente;
    }

    public void setPaciente(Pacientes paciente) {
        this.paciente = paciente;
    }

    public Label getLblNombre() {
        return lblNombre;
    }

    public Label getLblApellido() {
        return lblApellido;
    }

    public Label getLblRut() {
        return lblRut;
    }

    public Label getLblFecha() {
        return lblFecha;
    }

    public Label getLblTelefono() {
        return lblTelefono;
    }

    public Label getLblCorreo() {
        return lblCorreo;
    }

    public Label getLblMensaje() {
        return lblMensaje;
    }

    public Button getBtnAceptar() {
        return btnAceptar;
    }

    public Button getBtnLimpiar() {
        return btnLimpiar;
    }

    public Button getBtnReporte() {
        return btnReporte;
    }

    public TextField getTxtNombre() {
        return txtNombre;
    }

    public TextField getTxtApellido() {
        return txtApellido;
    }

    public TextField getTxtRut() {
        return txtRut;
    }

    public TextField getTxtFecha() {
        return txtFecha;
    }

    public TextField getTxtTelefono() {
        return txtTelefono;
    }

    public TextField getTxtCorreo() {
        return txtCorreo;
    }

    public boolean isPresion() {
        return presion;
    }

    public void setLblNombre(Label lblNombre) {
        this.lblNombre = lblNombre;
    }

    public void setLblApellido(Label lblApellido) {
        this.lblApellido = lblApellido;
    }

    public void setLblRut(Label lblRut) {
        this.lblRut = lblRut;
    }

    public void setLblFecha(Label lblFecha) {
        this.lblFecha = lblFecha;
    }

    public void setLblTelefono(Label lblTelefono) {
        this.lblTelefono = lblTelefono;
    }

    public void setLblCorreo(Label lblCorreo) {
        this.lblCorreo = lblCorreo;
    }

    public void setLblMensaje(Label lblMensaje) {
        this.lblMensaje = lblMensaje;
    }

    public void setBtnAceptar(Button btnAceptar) {
        this.btnAceptar = btnAceptar;
    }

    public void setBtnLimpiar(Button btnLimpiar) {
        this.btnLimpiar = btnLimpiar;
    }

    public void setBtnReporte(Button btnReporte) {
        this.btnReporte = btnReporte;
    }

    public void setTxtNombre(TextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public void setTxtApellido(TextField txtApellido) {
        this.txtApellido = txtApellido;
    }

    public void setTxtRut(TextField txtRut) {
        this.txtRut = txtRut;
    }

    public void setTxtFecha(TextField txtFecha) {
        this.txtFecha = txtFecha;
    }

    public void setTxtTelefono(TextField txtTelefono) {
        this.txtTelefono = txtTelefono;
    }

    public void setTxtCorreo(TextField txtCorreo) {
        this.txtCorreo = txtCorreo;
    }

    public void setPresion(boolean presion) {
        this.presion = presion;
    }
    
    
    public void Formulario() throws ParseException{
        
        this.setSize(1200, 700);
        this.setLayout(null);
        this.setVisible(true);
         
	Color formColor = new Color(53, 59, 72);
	setBackground(formColor);
         
         
        Font titleFont = new Font("arial", Font.BOLD, 25);
	Font labelFont =new  Font("arial", Font.PLAIN, 18);
	Font textFont =new  Font("arial", Font.PLAIN, 15);
        
        
         lblTitulo =new Label("DATOS DEL PACIENTE");  
	 lblTitulo.setBounds(250,50,450,30);
	 lblTitulo.setFont(titleFont);  
	 lblTitulo.setForeground(Color.WHITE);
        
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
         txtRut.setText("RUT sin puntos ni guion");
                 
         lblFecha=new Label("Fecha Nacimiento");  
	 lblFecha.setBounds(250,250,150,30);
	 lblFecha.setFont(labelFont);  
	 lblFecha.setForeground(Color.WHITE);
        
         txtFecha=new TextField();
	 txtFecha.setBounds(400,250,400,30);
	 txtFecha.setFont(textFont);
         txtFecha.setText("DD/MM/YYYY");
        
         
         lblTelefono=new Label("Telefono");  
	 lblTelefono.setBounds(250,300,150,30);
	 lblTelefono.setFont(labelFont);  
	 lblTelefono.setForeground(Color.WHITE);

         txtTelefono=new TextField();
	 txtTelefono.setBounds(400,300,400,30);
	 txtTelefono.setFont(textFont);

                 
         lblCorreo=new Label("Correo");  
	 lblCorreo.setBounds(250,350,150,30);
	 lblCorreo.setFont(labelFont);  
	 lblCorreo.setForeground(Color.WHITE);

         txtCorreo=new TextField();
	 txtCorreo.setBounds(400,350,400,30);
	 txtCorreo.setFont(textFont);
             
         btnAceptar=new Button("Crear");
         btnAceptar.setBounds(500,500,100,50);
	 btnAceptar.setFont(textFont);
         
         btnLimpiar=new Button("Limpiar");
         btnLimpiar.setBounds(500,500,100,50);
	 btnLimpiar.setFont(textFont);
                 
         btnAceptar.addActionListener(this);
         btnLimpiar.addActionListener(this);
         txtFecha.addKeyListener(this);
         
         
         add(lblTitulo);
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
 

    public void ListadoPacientes(){
        
        this.removeAll();
        
        this.setLayout(new GridLayout(2, 5));
        this.setSize(1000,600);
        this.setVisible(true);
	Color formColor = new Color(53, 59, 72);
	setBackground(formColor);
         
        Font titleFont = new Font("arial", Font.BOLD, 25);
	Font labelFont =new  Font("arial", Font.PLAIN, 18);
	Font textFont =new  Font("arial", Font.PLAIN, 15);
                
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

        
   for(int i=0; i<paciente.getPacientes().size();i++){
       
            lblMensaje=new Label(paciente.getPacientes().get(i).getNombre());
            lblMensaje.setForeground(Color.WHITE);
            this.add(lblMensaje);  
            
            lblMensaje=new Label(paciente.getPacientes().get(i).getApellido());
            lblMensaje.setForeground(Color.WHITE);
            this.add(lblMensaje); 
            
            lblMensaje=new Label(paciente.getPacientes().get(i).getRut());
            lblMensaje.setForeground(Color.WHITE);
            this.add(lblMensaje); 
            
            lblMensaje=new Label(paciente.getPacientes().get(i).getFechaNacimiento().toString());
            lblMensaje.setForeground(Color.WHITE);
            this.add(lblMensaje);         


            lblMensaje=new Label(paciente.getPacientes().get(i).getTelefono());
            lblMensaje.setForeground(Color.WHITE);
            this.add(lblMensaje); 
            
            lblMensaje=new Label(paciente.getPacientes().get(i).getCorreo());
            lblMensaje.setForeground(Color.WHITE);
            this.add(lblMensaje);    
          } 
   
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
     Date fechaNacimiento;
     
     Object obj = e.getSource();

        if(obj==btnReporte){
            System.out.println("Listado de pacientes");
            ListadoPacientes();
        }


        if(obj==btnAceptar){
            System.out.println("crear");



        if(!txtNombre.getText().isEmpty() && !txtApellido.getText().isEmpty() &&  !txtFecha.getText().isEmpty() &&  !txtRut.getText().isEmpty() &&  !txtTelefono.getText().isEmpty() &&  !txtCorreo.getText().isEmpty()){
            try {
                fechaNacimiento=new SimpleDateFormat("dd/mm/yyyy").parse(txtFecha.getText());    

                paciente.setNombre(txtNombre.getText());
                paciente.setApellido(txtApellido.getText());
                paciente.setRut(txtRut.getText());
                paciente.setFechaNacimiento(fechaNacimiento);
                paciente.setTelefono(txtTelefono.getText());
                paciente.setCorreo(txtCorreo.getText());

                paciente.AgregarPaciente();


                this.removeAll();

                lblMensaje=new Label("Datos insertados!!!");
                lblMensaje.setForeground(Color.RED);
                lblMensaje.setBounds(550,200,400,30);
                Font textFont =new  Font("arial", Font.PLAIN, 25);
                add(lblMensaje); 


                this.removeAll();

                btnReporte=new Button("Listado de pacientes");
                lblMensaje.setForeground(Color.WHITE);
                btnReporte.setBounds(400,300,400,30);
                btnReporte.setFont(textFont);


                add(lblMensaje);                  
                add(btnReporte);
                btnReporte.addActionListener(this);
                paciente.mostrar();

            } catch (ParseException ex) {;
            }
    
        }   
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
    