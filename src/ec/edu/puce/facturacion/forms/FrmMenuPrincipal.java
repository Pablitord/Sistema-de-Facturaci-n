package ec.edu.puce.facturacion.forms;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmMenuPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JDesktopPane desktopPane;

	public FrmMenuPrincipal() {
		setTitle("SISTEMA DE FACTURACION ELECTRONICA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 573);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(98, 160, 234));
		menuBar.setFont(new Font("Dialog", Font.BOLD, 16));
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setFont(new Font("Dialog", Font.BOLD, 16));
		menuBar.add(mnFile);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.setFont(new Font("Dialog", Font.BOLD, 16));
		mnFile.add(mntmSalir);
		
		JMenu mnClientes = new JMenu("Clientes");
		mnClientes.setFont(new Font("Dialog", Font.BOLD, 16));
		menuBar.add(mnClientes);
		
		JMenuItem mntmCrearClientes = new JMenuItem("Crear Clientes");
		mntmCrearClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmCrearCliente frmCliente=new FrmCrearCliente();
				frmCliente.setVisible(true);
				desktopPane.add(frmCliente);
			}
		});
		mntmCrearClientes.setFont(new Font("Dialog", Font.BOLD, 16));
		mnClientes.add(mntmCrearClientes);
		
		JMenuItem mntmListaClientes = new JMenuItem("Lista Clientes");
		mntmListaClientes.setFont(new Font("Dialog", Font.BOLD, 16));
		mnClientes.add(mntmListaClientes);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, "name_187473059215648");
	}

}
