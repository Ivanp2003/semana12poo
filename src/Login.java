import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{
    private JTextField txtUsuario;
    private JPasswordField txtContrasena;
    private JButton accesoButton;
    private JPanel panelMain;
    private JComboBox comboRol;

    public Login(){
        super("Login");
        setContentPane(panelMain);
        setSize(400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        JLabel lblnombre = new JLabel("Jugadores");
        lblnombre.setBounds(30, 10, 200, 25);
        panelMain.add(lblnombre);



        txtUsuario = new JTextField("Nombre");
        txtUsuario.setBounds(30, 40, 150, 25);
        panelMain.add(txtUsuario);



        JButton accion = new JButton("click");
        accion.setBounds(100,100,100,25);
        add(accion);

        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(140,100,25,25);
        add(comboBox);


        accesoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUsuario.getText();
                String contrasena = String.valueOf(txtContrasena.getPassword());
                String rol = (String) comboRol.getSelectedItem();


                if(usuario.isEmpty() || contrasena.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Llene los campos");
                    return;
                }

                if(rol.equals("Administrador") && usuario.equals("admin") && contrasena.equals("123")){
                    new Administrador().setVisible(true);
                    dispose();
                }

                else if(rol.equals("Jugador") && usuario.equals("jugador") && contrasena.equals("123")){
                    new Jugador().setVisible(true);
                    dispose();
                }
            }
        });
    }


    public static void main(String[] args) {
        new Login();
    }
}
