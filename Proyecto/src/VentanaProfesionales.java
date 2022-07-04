
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.ParseException;


/**
 *
 * @author Barbara
 */

public class VentanaProfesionales extends Frame implements WindowListener, ActionListener, KeyListener  {
    
    private Label lblNombre,lblRut,lblEspecialidad,lblHorario,lblMensaje,lblTitulo;
    private Button btnAceptar, btnLimpiar,btnReporte;
    private TextField txtNombre,txtRut,txtEspecialidad, txtHorario;
    boolean presion=false;

    private Profesionales profesional = new Profesionales();
    
    public VentanaProfesionales(String titulo){
        super(titulo);
        this.addWindowListener(this);
    }

    //getter y setter
    public Label getLblNombre() {
        return lblNombre;
    }

    public Label getLblRut() {
        return lblRut;
    }

    public Label getLblEspecialidad() {
        return lblEspecialidad;
    }

    public Label getLblHorario() {
        return lblHorario;
    }

    public Label getLblMensaje() {
        return lblMensaje;
    }

    public Label getLblTitulo() {
        return lblTitulo;
    }

    public Button getBtnReporte() {
        return btnReporte;
    }

    public TextField getTxtNombre() {
        return txtNombre;
    }

    public TextField getTxtRut() {
        return txtRut;
    }

    public TextField getTxtEspecialidad() {
        return txtEspecialidad;
    }

    public TextField getTxtHorario() {
        return txtHorario;
    }

    public boolean isPresion() {
        return presion;
    }

    public Profesionales getProfesional() {
        return profesional;
    }

    public void setLblNombre(Label lblNombre) {
        this.lblNombre = lblNombre;
    }

    public void setLblRut(Label lblRut) {
        this.lblRut = lblRut;
    }

    public void setLblEspecialidad(Label lblEspecialidad) {
        this.lblEspecialidad = lblEspecialidad;
    }

    public void setLblHorario(Label lblHorario) {
        this.lblHorario = lblHorario;
    }

    public void setLblMensaje(Label lblMensaje) {
        this.lblMensaje = lblMensaje;
    }

    public void setLblTitulo(Label lblTitulo) {
        this.lblTitulo = lblTitulo;
    }

    public void setBtnReporte(Button btnReporte) {
        this.btnReporte = btnReporte;
    }

    public void setTxtNombre(TextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public void setTxtRut(TextField txtRut) {
        this.txtRut = txtRut;
    }

    public void setTxtEspecialidad(TextField txtEspecialidad) {
        this.txtEspecialidad = txtEspecialidad;
    }

    public void setTxtHorario(TextField txtHorario) {
        this.txtHorario = txtHorario;
    }

    public void setPresion(boolean presion) {
        this.presion = presion;
    }

    public void setProfesional(Profesionales profesional) {
        this.profesional = profesional;
    }
    
    
    
    public void InfoProfesionales() throws ParseException{
        
        this.setLayout(new GridLayout(5, 5));
        this.setSize(1000,600);
        this.setVisible(true);
	Color formColor = new Color(53, 59, 72);
	setBackground(formColor);

        Font titleFont = new Font("arial", Font.BOLD, 25);
	Font labelFont =new  Font("arial", Font.PLAIN, 15);

        lblMensaje=new Label("Nombre");
        lblMensaje.setForeground(Color.WHITE);
        lblMensaje.setFont(titleFont); 
        this.add(lblMensaje);
                
        lblMensaje=new Label("Rut");
        lblMensaje.setForeground(Color.WHITE);
        lblMensaje.setFont(titleFont); 
        this.add(lblMensaje);
         
        lblMensaje=new Label("Especialidad");
        lblMensaje.setForeground(Color.WHITE);
        lblMensaje.setFont(titleFont); 
        this.add(lblMensaje);  
         
        lblMensaje=new Label("Horario");
        lblMensaje.setForeground(Color.WHITE);
        lblMensaje.setFont(titleFont); 
        this.add(lblMensaje);
        
        profesional.DatosProfesionales();
        for(int i=0; i<profesional.getProfesionales().size();i++){        
            
            lblMensaje=new Label(profesional.getProfesionales().get(i).getNombre());
            lblMensaje.setForeground(Color.WHITE);
            lblMensaje.setFont(labelFont);
            this.add(lblMensaje);

            lblMensaje=new Label(profesional.getProfesionales().get(i).getRut());
            lblMensaje.setForeground(Color.WHITE);
            lblMensaje.setFont(labelFont);
            this.add(lblMensaje); 

            String numEspecialidad = Integer.toString(profesional.getProfesionales().get(i).getEspecialidad());
            lblMensaje=new Label(numEspecialidad);
            lblMensaje.setFont(labelFont);
            lblMensaje.setForeground(Color.WHITE);
            this.add(lblMensaje); 
         
            String numHorario = Double.toString(profesional.getProfesionales().get(i).getHorario());
            lblMensaje=new Label(numHorario);
            lblMensaje.setFont(labelFont);
            lblMensaje.setForeground(Color.WHITE);
            this.add(lblMensaje);     
 
        }
   
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

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
    