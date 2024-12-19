package ec.edu.puce.facturacion.forms;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FrmCrearCliente extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtCedula;
	private JTextField txtNombres;
	private JTextField txtDireccion;
	public FrmCrearCliente() {
		setTitle("Crear Cliente");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblCdula = new JLabel("Cédula");
		lblCdula.setBounds(12, 34, 60, 17);
		getContentPane().add(lblCdula);
		
		JLabel lblNombres = new JLabel("Nombres");
		lblNombres.setBounds(12, 63, 60, 17);
		getContentPane().add(lblNombres);
		
		JLabel lblDireccin = new JLabel("Dirección");
		lblDireccin.setBounds(12, 97, 60, 17);
		getContentPane().add(lblDireccin);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(82, 32, 114, 21);
		getContentPane().add(txtCedula);
		txtCedula.setColumns(10);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(82, 61, 114, 21);
		getContentPane().add(txtNombres);
		txtNombres.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(82, 95, 114, 21);
		getContentPane().add(txtDireccion);
		txtDireccion.setColumns(10);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(12, 147, 105, 27);
		getContentPane().add(btnNuevo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(126, 147, 105, 27);
		getContentPane().add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(242, 147, 105, 27);
		getContentPane().add(btnCancelar);

	}
}
